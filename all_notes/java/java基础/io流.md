
##### 什么是io流
将文件读到内存或内存读到文件

##### 字节流和字符流
Java中一切都是字节流，没有字符流，字符只是<font color=#66CC99 style=" font-weight:bold;">根据编码对字节流进行翻译的结果</font>。

Java I/O有两个

面向字节流的InputStream和OutputStream
面向字符流的Reader和Writer

Java中InputStreamReader和InputStreamWriter是字节流向字符流解码的桥梁
![[Pasted image 20220817185950.png]]

Java中InputStreamReader和InputStreamWriter是字节流向[字符流](https://so.csdn.net/so/search?q=%E5%AD%97%E7%AC%A6%E6%B5%81&spm=1001.2101.3001.7020)解码的桥梁


##### 字符流的存在意义?

最常见的应用场景是：程序的配置文件，不管是json，yaml，properties，<font color=#66CC99 style=" font-weight:bold;">读取这些文件时，你肯定不想拿到一堆字节</font>，来处理字符转换和编码问题。

##### flush()方法
flush()的意思就是刷新，清空缓冲区，强制将缓冲区的数据写入文件或是读取。

当数据预存到缓冲池中时，在数据的长度满足缓冲池中的大小后，才会将缓冲池中的数据成块的发送，在发送数据过程中，<font color=#66CC99 style=" font-weight:bold;">末尾的数据大小不能满足缓冲池的大小</font>。最终导致这部分的数据<font color=#66CC99 style=" font-weight:bold;">停留在缓冲池无法发送</font>。此时需要手动调用flush方法

当你print或者write的时候，会暂时保存在缓冲区，并没有发送出去，这是出于效率考虑的，因为数据不会自己发送过去，必须有其他机制，而且这个很消耗资源，就像马桶你需要很多水，才能冲走，你如果扔一点东西，就冲一次水，那你水费要爆表了，同样如果你写一行文字，或者一个字节，就要马上发送出去，那网络流量，CPU使用率等等都要爆表了，所以一般只有在你真正需要发送否则无法继续的时候，调用flush，将数据发送出去。

##### close()方法
关闭此输入流并释放与该流关联的所有<font color=#66CC99 style=" font-weight:bold;">系统资源</font>。

##### 装换流存在的意义?
使用字符流时,参数必须是字节流,你要用转换流将字节流转换过去