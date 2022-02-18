#### 再加一个ip

[root@oddeyeos network-scripts]# ifconfig ens33:1 192.168.150.25/24
[root@oddeyeos network-scripts]# ifconfig
ens33: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.150.24  netmask 255.255.255.0  broadcast 192.168.150.255
        inet6 fe80::6533:8ec9:69d4:4243  prefixlen 64  scopeid 0x20<link>
        ether 00:0c:29:9a:9c:72  txqueuelen 1000  (Ethernet)
        RX packets 4949  bytes 381462 (372.5 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1212  bytes 120099 (117.2 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

ens33:1: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.150.25  netmask 255.255.255.0  broadcast 192.168.150.255
        ether 00:0c:29:9a:9c:72  txqueuelen 1000  (Ethernet)

#### 查看某一机子上看其有几个ip

[root@oddeyeos network-scripts]# ip address show ens33
2: ens33: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc pfifo_fast state UP group default qlen 1000
    link/ether 00:0c:29:9a:9c:72 brd ff:ff:ff:ff:ff:ff
    inet 192.168.150.24/24 brd 192.168.150.255 scope global noprefixroute ens33
       valid_lft forever preferred_lft forever
    inet 192.168.150.25/24 brd 192.168.150.255 scope global secondary ens33:1
       valid_lft forever preferred_lft forever
    inet6 fe80::6533:8ec9:69d4:4243/64 scope link noprefixroute 
       valid_lft forever preferred_lft forever

#### 删除ip

[root@oddeyeos network-scripts]# ip a d 192.168.150.25/24 dev ens33
[root@oddeyeos network-scripts]# ifconfig
ens33: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.150.24  netmask 255.255.255.0  broadcast 192.168.150.255
        inet6 fe80::6533:8ec9:69d4:4243  prefixlen 64  scopeid 0x20<link>
        ether 00:0c:29:9a:9c:72  txqueuelen 1000  (Ethernet)
        RX packets 4972  bytes 384293 (375.2 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1218  bytes 120614 (117.7 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        inet6 ::1  prefixlen 128  scopeid 0x10<host>
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 542  bytes 43608 (42.5 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 542  bytes 43608 (42.5 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0












1.  #### hostname lyh  一次改
 2.  #### cd etc   永久改  重启生效
   
      cat hostname
      vim hostname


DHCP服务器动态分配ip




nmtui  网络管理   该名字  网卡管理  激活



#### ifconfig 查ip地址  

查看接口网路状态
[root@oddeyeos network-scripts]# lsof -i:67
COMMAND  PID   USER   FD   TYPE DEVICE SIZE/OFF NODE NAME
dnsmasq 1800 nobody    3u  IPv4  32701      0t0  UDP *:bootps 



rpm   包
查询是否有 vsftpd
rpm -qa| grep vsftpd

下载软件时查 1.网上www
2. iso找
3.yum  

下载前建仓库：  将光盘设为仓库

##### [root@oddeyeos network-scripts]# df                                                    //找光盘

文件系统                   1K-块    已用     可用 已用% 挂载点
devtmpfs                  998396       0   998396    0% /dev
tmpfs                    1013944       0  1013944    0% /dev/shm
tmpfs                    1013944   10672  1003272    2% /run
tmpfs                    1013944       0  1013944    0% /sys/fs/cgroup
/dev/sda3               17410832 6275904 10227460   39% /
/dev/sda1                 999320  142232   788276   16% /boot
tmpfs                     202792      48   202744    1% /run/user/1000
/dev/sr0 光盘                4600876 4600876        0  100% /run/media/dougax/CentOS 7 x86_64
/dev/sdb1                1998672    6144  1871288    1% /opt/data1
/dev/mapper/lyhvg-lyhlv   999320    2564   927944    1% /opt/lyhlv01
[root@oddeyeos network-scripts]# 







# 网卡设置



## 改主机名

短暂改

##### [root@oddeyeos /]# hostname nmd

永久改

##### vim /etc/hostname

## 改固定ip



#### 查看网卡

ifconfig
ens33: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.150.24  netmask 255.255.255.0  broadcast 192.168.150.255
        inet6 fe80::6533:8ec9:69d4:4243  prefixlen 64  scopeid 0x20<link>
        ether 00:0c:29:9a:9c:72  txqueuelen 1000  (Ethernet)
        RX packets 206706  bytes 298284672 (284.4 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 20673  bytes 1452267 (1.3 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        inet6 ::1  prefixlen 128  scopeid 0x10<host>
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 787  bytes 63772 (62.2 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 787  bytes 63772 (62.2 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0





右上角ipv4

手动

![屏幕截图 2021-10-26 164050](jxwb.assets/屏幕截图 2021-10-26 164050-16358387811451.jpg)

查看是否一样

![屏幕截图 2021-10-26 160813](jxwb.assets/屏幕截图 2021-10-26 160813.jpg)



## 改本地域名

## ping通

域名通

网通



命令式

cd /etc/sysconfig/netscript



# 改本地域名

 vim /etc/hosts

在最后一行加上ip  空格   域名

ping www.lyh.com









### 装软件



##### 查 软件

##### rpm -qa|grep httpd



##### [root@oddeyeos network-scripts]# mkdir /mnt/cdrom        //建仓库文件夹

[root@oddeyeos network-scripts]# cd /mnt/cdrom
[root@oddeyeos cdrom]# ls

##### //光盘不可直接访问，只能间接挂载访问

## [root@oddeyeos cdrom]# mount /dev/sr0 /mnt/cdrom      //挂载iso  到仓库

### 每次重启都要重新挂载

##### /mnt/cdrom底下就是光盘里的文件了

//mount: /dev/sr0 写保护，将以只读方式挂载

##### [root@oddeyeos cdrom]# cd /etc/yum.repos.d                                  //查看所有仓库   看后缀repo文件

[root@oddeyeos yum.repos.d]# ls

CentOS-Base.repo  CentOS-CR.repo  CentOS-Debuginfo.repo  CentOS-fasttrack.repo  CentOS-Media.repo  CentOS-Sources.repo  CentOS-Vault.repo  CentOS-x86_64-kernel.repo

[root@oddeyeos yum.repos.d]# 

[root@oddeyeos yum.repos.d]# vim CentOS-Base.repo         //仓库名

[base]                                                             
name=CentOS-$releasever - Base                     //$取系统变量
mirrorlist=http://mirrorlist.centos.org/?release=$releasever&arch=$basearch&repo=os&infra=$infra        //仓库国外镜像
#baseurl=http://mirror.centos.org/centos/$releasever/os/$basearch/                        //仓库位置
gpgcheck=1                                                                                                             
gpgkey=file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7





##### [root@oddeyeos yum.repos.d]# mv *.repo ./bak                               //把其他仓库移到备份文件中

[root@oddeyeos yum.repos.d]# ls
bak

##### [root@oddeyeos yum.repos.d]# vim mytest.repo                              //建一个自己的仓库文件 .repo



//建repo

##### [mytest]                                                                      //yum命令所找的仓库名

##### name=mytest                                                           //名字就是mytest.repo

##### baseurl=file:///mnt/cdrom                                         //本地光盘就file://              这是mount挂载光盘的文件夹      也可以是国外国内镜像网站

#####  gpgcheck=0                                                                                //check  不检查





//mount /dev/sr0 /mnt/cdrom

#### 用yum尝试装一下 

##### //检查repo是否被扫描到  是否能用

[root@oddeyeos yum.repos.d]# yum repolist
已加载插件：fastestmirror, langpacks
Loading mirror speeds from cached hostfile
mytest                                                                                                                                                       | 3.6 kB  00:00:00     
(1/2): mytest/group_gz                                                                                                                                       | 153 kB  00:00:00     
(2/2): mytest/primary_db                                                                                                                                     | 3.3 MB  00:00:00     
源标识                                                                                 源名称                                                                                  状态
mytest                                                                                 mytest                                                                                  4,070
repolist: 4,070

#### //尝试下载

##### yum install -y httpd







//缺少tree命令   于是下载  
yum install tree

//tree效果
[root@oddeyeos yum.repos.d]# tree 
.
├── bak
│   ├── CentOS-Base.repo
│   ├── CentOS-CR.repo
│   ├── CentOS-Debuginfo.repo
│   ├── CentOS-fasttrack.repo
│   ├── CentOS-Media.repo
│   ├── CentOS-Sources.repo
│   ├── CentOS-Vault.repo
│   └── CentOS-x86_64-kernel.repo
└── mytest.repo



//配置仓库后下载
 yum install -y vsftpd

[root@oddeyeos yum.repos.d]# systemctl start vsftpd                                //启动vsftpd  
[root@oddeyeos yum.repos.d]# systemctl status vsftpd                             //检查是否启动    activerunning()
● vsftpd.service - Vsftpd ftp daemon
   Loaded: loaded (/usr/lib/systemd/system/vsftpd.service; disabled; vendor preset: disabled)
   Active: active (running) since 四 2021-10-28 11:28:11 CST; 25s ago
  Process: 12280 ExecStart=/usr/sbin/vsftpd /etc/vsftpd/vsftpd.conf (code=exited, status=0/SUCCESS)
 Main PID: 12281 (vsftpd)
    Tasks: 1
   CGroup: /system.slice/vsftpd.service
           └─12281 /usr/sbin/vsftpd /etc/vsftpd/vsftpd.conf

10月 28 11:28:11 oddeyeos systemd[1]: Starting Vsftpd ftp daemon...
10月 28 11:28:11 oddeyeos systemd[1]: Started Vsftpd ftp daemon.





#### 运行httpd



##### 查看防火墙并关闭

systemctl status firewalld

systemctl stop firewalld
systemctl disabled firewalld

##### 看网站文件夹

##### cd /var/www/html



[root@liyonghai /]# cd /var/www/html
[root@liyonghai html]# ls
index.html

###### 访问ip时默认访问该文件夹下的  index.html



###### vim下加行号

###### 最下面:set number     和：wq类似



##### 改httpd端口号 

[root@liyonghai myweb1]# cd /etc/httpd
[root@liyonghai httpd]# ls
conf  conf.d  conf.modules.d  logs  modules  run

[root@liyonghai conf]# ls
httpd.conf  magic
[root@liyonghai conf]# vim httpd.conf 

listen80

119行

160行

#### 虚拟主机

httpd -t  测试conf文件是否有语法错误





进入服务器配置文件修改配置

##### cd /etc/httpd/conf

##### vim httpd.conf



配置两个虚拟主机

<VirtualHost *:80>
ServerName www.w1.com
DocumentRoot /var/www/html/test/w1
DirectoryIndex index.html
</VirtualHost>

<VirtualHost *:80>
 ServerName www.w2.com
 DocumentRoot /var/www/html/test/w2
 DirectoryIndex index.html
</VirtualHost>



修改域名配置文件，配置两个虚拟主机域名共用一个ip

vim /etc/hosts

127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6
192.168.33.24 www.w1.com www.w2.com



启动服务器

systemctl start httpd

配置的两个虚拟主机仅限当前虚拟机内可以访问       

即：虚拟机主机可以和这两个虚拟机可以通过域名访问，但本机的windows系统的主机不能通过域名访问到这两个虚拟机

但可以通过ip访问虚拟机底下的两个虚拟主机

总结：1.配域名  2.创建文件夹  3.httpd配置文件中配virtualhost



到此为止，可以创建了了web项目，本机虚拟机可以通过域名来访问



### ifconfig ens33:1 192.168.33.12/24



ens33: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.33.24  netmask 255.255.255.0  broadcast 192.168.33.255
        inet6 fe80::6533:8ec9:69d4:4243  prefixlen 64  scopeid 0x20<link>
        ether 00:0c:29:9a:9c:72  txqueuelen 1000  (Ethernet)
        RX packets 1773  bytes 188602 (184.1 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1194  bytes 102069 (99.6 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

ens33:1: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.33.12  netmask 255.255.255.0  broadcast 192.168.33.255
        ether 00:0c:29:9a:9c:72  txqueuelen 1000  (Ethernet)





[root@liyonghai conf]# ping 192.168.33.12
PING 192.168.33.12 (192.168.33.12) 56(84) bytes of data.
64 bytes from 192.168.33.12: icmp_seq=1 ttl=64 time=0.200 ms
64 bytes from 192.168.33.12: icmp_seq=2 ttl=64 time=0.033 ms



#### vim /etc/hosts

127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4
::1         localhost localhost.localdomain localhost6 localhost6.localdomain6
192.168.33.24 www.w1.com
192.168.33.12 www.w2.com





##### cd /etc/httpd/conf

##### vim httpd.conf

<VirtualHost 192.168.33.12>
 81 ServerName www.w1.com
 82 DocumentRoot /var/www/html/test/w1
 83 DirectoryIndex index.html
 84 </VirtualHost>
 85 
 86 <VirtualHost 192.168.33.24>
 87  ServerName www.w2.com
 88  DocumentRoot /var/www/html/test/w2
 89  DirectoryIndex index.html
 90 </VirtualHost>



httpd -t    检查配置文件语法



systemctl start httpd

改配置后要

### systemctl restart httpd

/var/www/html/test/w2
