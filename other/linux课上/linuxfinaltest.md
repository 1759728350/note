##### 什么是操作系统

操作系统（Operating system）是配置在计算机硬件上的第一层软件，其它所有软件都将依赖操作系统的支持，取得它的服务。
操作系统，是用户和硬件之间的接口，是硬件和软件的管理者。
方便性，有效性是操作系统的目标。
例如：windows, Linux, UNIX, OS/2
自由不是免费

Linux倍受青睐的原因：自由软件 + 兼容UNIX全部功能。

##### Linux操作系统组成

内核：系统的心脏，所有用户命令都被送到内核执行。
Shell：命令解释器， 用户和内核之间的接口。
应用程序：实用工具。
<img src="C:\Users\13771640667\AppData\Roaming\Typora\typora-user-images\image-20211221225033964.png" align="left" style="zoom:67%;" >













##### 虚拟机

虚拟机是一个软件系统，会在原机器上虚拟出一台新的机器。
操作

> 1.新建虚拟机(分配硬件资源),
> 2.安装 centos7 镜像iso   
> 3.配置语言 光驱    配置用户管理员   ,配置安全策略

退出虚拟机鼠标键盘控制使用Alt+Ctrl
![image-20211221230033250](C:\Users\13771640667\AppData\Roaming\Typora\typora-user-images\image-20211221230033250.png)



##### 命令

“/”作为路径起点时称为根目录，否则是目录之间的分隔符
（2）“.”作为路径时代表当前工作目录，“..”代表上级目录 ~家文件



cat/head/less/more/tail
dd删除  yy复制  p黏贴 u撤销

普通--->i       esc<---插入模式
||
:
低行模式

用户账号管理
  useradd       usermod       用户信息 /etc/passwd      userdel
用户密码管理
   passwd          /etc/shadow
用户组的管理
   groupadd       gpasswd添加、删除组成员         groupdel
文件属性的读取和修改
   chown            chmod           权限的两种表示方法
切换用户 
      su

##### 运行级别

这些级别在/etc/inittab 文件里指定。
缺省的运行级，RHS 用到的级别如下：

0 - 停机（千万不要把initdefault 设置为0 ）

1 - 单用户模式

2 - 多用户，但是没有 NFS 

3 - 完全多用户模式

4 - 没有用到

5 - X11 进到 X Window 系统了 

6 - 重新启动 

千万不要把initdefault 设置为6
很多黑客千方百计提升权限来改成6或0



使用rpm命令
查询RPM软件包   rpm   -q 查询
       -u修改         -e  erase(删除)  -i安装

安装RPM软件包   rpm   -ivh

##### 网络

配置主机名  
  hostname 
  /etc/sysconfig/network
配置网卡  
  /etc/sysconfig/network-script/ifcfg-eth0    
  ifup  
  ifdown

df 查看磁盘占用状态
fdisk添加分区
export 将该变量设置为系统全局变量
/etc/shells看解释器有哪些