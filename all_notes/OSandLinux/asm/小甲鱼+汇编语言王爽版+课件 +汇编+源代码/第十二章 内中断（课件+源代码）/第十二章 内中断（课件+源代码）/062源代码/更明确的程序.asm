assume cs:code

code segment
start: 
		mov ax, cs
        mov ds, ax
        mov si, offset do0			;设置ds:si指向源地址
        mov ax, 0
        mov es, ax
        mov di, 200h       			;设置es:di指向目的地址

        mov cx, do0部分代码的长度	;设置cx为传输长度
        cld         	            ;设置传输方向为正
        rep movsb
        
		;设置中断向量表 
        
		mov ax, 4c00h
        int 21h
  
do0: 
		;显示字符串“Welcome to Fishc.com！” 
        
		mov ax, 4c00h
        int 21h
		
code ends
end start
