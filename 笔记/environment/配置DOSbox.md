### 配置DOSbox

[下载链接]( https://pan.baidu.com/s/13SHb30Ou3hIaeC3K-Dya6A)  密码vqqv

安装至d:\asm
![image-20220118121652687](C:\Users\13771640667\AppData\Roaming\Typora\typora-user-images\image-20220118121652687.png)

注意:debug.exe与dosbox在同一层级



配置mount
![image-20220118121748023](C:\Users\13771640667\AppData\Roaming\Typora\typora-user-images\image-20220118121748023.png)

当运行dosbox中的dosbox.exe时
会同时启动该窗口
从中获取到在c盘中的配置文件路径
在该配置文件最后加上
mount c: d:\asm
c:
![image-20220118121950698](C:\Users\13771640667\AppData\Roaming\Typora\typora-user-images\image-20220118121950698.png)

这样每次打开exe时就会自动执行这两行命令