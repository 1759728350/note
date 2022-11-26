##### 主流语言的语言类型
c是一种编译型语言
不同于java这种混合式编译解释型的语言
也不同于JavaScript,python,shell那样的解释型语言

##### 解释型语言的缺点
每一次执行指令都要通过解释器实时一条一条翻译为机器语言
所以在运行时其性能开销会比编译型语言要大

##### 为什么java是混合式编译解释型语言?
详见[note_java_java基础_java是什么类型的语言](../java/java基础/java是什么类型的语言)


##### c语言的编译过程
我们通过gcc来编译c源文件
四步为
![[Pasted image 20220825225500.png]]

##### 预处理
* 删除注释
* 扩展宏
	生成宏代码并将使用#define 定义的符号常量替换为它们的值
* 扩展包含的文件
	包含了诸如#include <stdio.h> 之类的头文件，它将查找stdio.h 文件并将头文件复制到源代码文件中。

##### 编译
生成汇编语言

##### 汇编
将汇编语言转换为二进制机器码

##### 链接
多个模块的代码会被合并为一个,用到了库文件会对库文件进行链接

##### 库文件是什么
一个预先编译成机器码,供其他程序调用的代码集合
因其是二进制,所以不可见
但能通过头文件来调用库文件里的函数

##### 头文件和库文件的区别
头文件相当于接口文件
库文件就是你头文件里申明的函数的实现
头文件.h结尾header(stdio.h)
库文件就是躺在c库里的二进制机器码


##### 上哪去找头文件,库文件?
库文件一般在/usr/lib   /usr/lib64下
而库文件的头文件一般在/usr/include目录下


##### 静态链接与动态链接
<font color=#F09B59 style=" font-weight:bold;">就是将.c文件编译,汇编生成的.o文件链接成不同的库,然后将库打包成可执行文件</font>


<font color=#FFCCCC style=" font-weight:bold;">文件格式?</font>
静态库文件和动态库文件。windows静态库文件就是.lib文件，动态库文件就是.dll文件。
linux下,前者为.a 后者为.so

<font color=#FFCCCC style=" font-weight:bold;">何为动态链接?
</font>
本身是加载库的过程
就是链接其他依赖库的行为推迟到程序运行时,在可执行文件运行时才加载需要的库
执行exe文件时,需要去找所依赖的动态链接库库的dll(windows系统)或是so(linux系统)
然后将.c文件和所依赖的动态链接库dll文件转化为exe可执行文件
因为<font color=#66CC99 style=" font-weight:bold;">其链接后的exe可执行文件是不完整的,在运行时需要去动态加载dll</font>
因此我们在删除
优点:节省存储空间

<font color=#FFCCCC style=" font-weight:bold;">静态链接执行效率更快?</font>
因为其将经过预处理,编译,汇编后的.o目标文件一次性链接完毕,打包成lib文件(linux下是.a文件)
然后将静态链接库文件转为exe可执行文件
在执行可执行exe文件时,就不需要去动态加载所依赖的库了
所以我们明白了像向日葵这种只有一个exe文件的应用
就是将所有依赖的静态链接库打包成了一个exe可执行文件
<font color=#66CC99 style=" font-weight:bold;">优点:执行效率更高</font>

<font color=#FFCCCC style=" font-weight:bold;">如何制作一个动态链接库和静态链接库?</font>
下面两个实验非常详细
[实验1](https://blog.csdn.net/zhengnianli/article/details/104321056?ops_request_misc=&request_id=&biz_id=102&utm_term=C%E8%AF%AD%E8%A8%80%E5%8A%A8%E6%80%81%E9%93%BE%E6%8E%A5&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-2-104321056.142^v59^new_blog_pos_by_title,201^v3^control_1&spm=1018.2226.3001.4187
)
[实验2](https://blog.csdn.net/assiduous_me/article/details/113731968?ops_request_misc=&request_id=&biz_id=102&utm_term=C%E8%AF%AD%E8%A8%80%E5%8A%A8%E6%80%81%E9%93%BE%E6%8E%A5&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-5-113731968.142^v59^new_blog_pos_by_title,201^v3^control_1&spm=1018.2226.3001.4187)




在静态链接中，链接器将所有使用的库函数复制到可执行文件中。在动态链接中，不会复制代码，只需将库的名称放在二进制文件中即可。
库文件与头文件的区别以及静态链接与动态链接暂时不探讨(暂时不探讨)[网上资料挖坑](https://blog.csdn.net/weixin_42458272/article/details/106193786?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166137399916782395339264%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=166137399916782395339264&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~rank_v31_ecpm-7-106193786-null-null.142^v42^new_blog_pos_by_title,185^v2^control&utm_term=%E5%A4%B4%E6%96%87%E4%BB%B6%E5%92%8C%E5%BA%93%E6%96%87%E4%BB%B6%E7%9A%84%E5%8C%BA%E5%88%AB&spm=1018.2226.3001.4187)
