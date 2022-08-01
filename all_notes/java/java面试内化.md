

## 1.Java 基础 知识
##### 1.1面向对象(了解)

封装
就是把对象的属性和方法结合为一个整体，并尽可能<font color=#66CC99 style=" font-weight:bold;">隐藏内部实现细节</font>，就是把不想告诉或者不该告诉别人的东西隐藏起来，把可以告诉别人的公开，别人<font color=#66CC99 style=" font-weight:bold;">只能用我暴露的功能</font>实现需求，而不知道是如何实现的。增加安全性。

继承：子类继承父类的属性和方法，并能根据自己的需求扩展出新的行为，提高了代码的复用性。

多态是指不同的子类在继承父类后分别都重写覆盖了父类的方法，即<font color=#66CC99 style=" font-weight:bold;">父类同一个方法，在继承的子类中表现出不同的形式</font>。
,把不同的子类对象都当作父类来看，向上<font color=#66CC99 style=" font-weight:bold;">屏蔽了不同子类对象之间的差异</font>，写出通用的代码，以适应需求的不断变化。
```java
父类或接口  起的名字 = new 子类
(左边)              (右边)
```

抽象
抽象类用 abstract 关键字来修饰，用 abstract修饰类时，<font color=#66CC99 style=" font-weight:bold;">此类就不能被实例化</font>，从这里可以看出，抽象类（接口）就是为了继承而存在的

##### 数据类型(了解)
![[Pasted image 20220801191718.png]]

##### 1.3JDK JRE JVM 的区别 （必会）
![[Pasted image 20220801192822.png]]
JVM 是 Java Virtual Machine（Java 虚拟机），
所有的java程序会首先被编译为.class的类文件，这种<font color=#66CC99 style=" font-weight:bold;">.class文件可以在虚拟机上执行</font>,是整个 java 实现<font color=#66CC99 style=" font-weight:bold;">跨平台</font>的最核心的部分，能够运行以 Java 语言的软件程序。

JRE（Java Runtime Environment）是运行 JAVA 程序所必须的环境的集合，
包含<font color=#66CC99 style=" font-weight:bold;"> java 虚拟机</font>和 java 程序的一些<font color=#66CC99 style=" font-weight:bold;">核心类库</font>。

JDK（Java Development Kit）是整个 Java 的核心，是 java 开发工具包，
包括了 Java 运行环境 JRE、Java 工具和 <font color=#66CC99 style=" font-weight:bold;">Java 基础类库</font>。

在JDK的安装目录下有一个jre目录，里面有两个文件夹bin和lib，在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib合起来就称为jre。

[相关解释](https://blog.csdn.net/weixin_45525272/article/details/117825058?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522165934959216782388031797%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=165934959216782388031797&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-117825058-null-null.142^v37^pc_rank_34&utm_term=jre&spm=1018.2226.3001.4187)

##### 1.4 重载和重写的区别（必会）
重载： 发生在同一个类中，方法名必须相同，参数类型不同.个数不同.顺序不同,方法返回
值和访问修饰符可以不同，发生在编译时。

重写： 发生在父子类中，方法名.参数列表必须相同，返回值范围小于等于父类，抛出的异
常范围小于等于父类，<font color=#66CC99 style=" font-weight:bold;">访问修饰符范围大于等于父类</font>；
如果父类方法访问修饰符为 <font color=#66CC99 style=" font-weight:bold;">private 则子类就不能重写该方法</font>。


##### 1.5 Java 中\=\=和 equals 的区别（必会)

== 的作用：

基本类型：比较的就是值是否相同

引用类型：比较的就是地址值是否相同

equals 的作用:引用类型：默认情况下，比较的是地址值。

特：String、Integer、Date 这些类库中 equals 被重写，比较的是内容而不是地址！
```java
public boolean equals(Object anObject) {  
    if (this == anObject) {  
        return true;  
    }    
    if (anObject instanceof String) {  
        String anotherString = (String)anObject;  
        int n = value.length;  
        if (n == anotherString.value.length) {  
            char v1[] = value;  
            char v2[] = anotherString.value;  
            int i = 0;  
            while (n-- != 0) {  
                if (v1[i] != v2[i])  
                    return false;  
	            i++;  
            }            
            return true;  
        
	    }    
    }    
    return false;  
}
```


##### 1.6 String、StringBuffer、StringBuilder 三者之间的区别（必会）

String 字符串常量

StringBuffer 字符串变量（线程安全）

StringBuilder 字符串变量（非线程安全）

String 中的 String 类中使用 final 关键字修饰字符数组来保存字符串，
<font color=#66CC99 style=" font-weight:bold;">private final char value[] ，String 对象是不可变的，也就可以理解为常量，线程安全。</font>

AbstractStringBuilder 是 StringBuilder 与 StringBuffer 的公共父类，定义了
一些字符串的基本操作，如 expandCapacity、append、insert、indexOf 等公共方法。
StringBuffer <font color=#66CC99 style=" font-weight:bold;">对方法加了同步锁</font>或者对调用的方法加了同步锁，所以是线程安全
的。

StringBuilder 并没有对方法进行加同步锁，所以是非线程安全的。

小结：

（1）如果要操作少量的数据用 String；

（2）多线程操作字符串缓冲区下操作大量数据用 StringBuffer；

（3）单线程操作字符串缓冲区下操作大量数据用 StringBuilder。



##### 1.7 接口和抽象类的区别是什么？（必会）

实现：抽象类的子类使用 extends 来继承；接口必须使用 implements 来实现接
口。
<font color=#66CC99 style=" font-weight:bold;">构造函数：抽象类可以有构造函数；接口不能有。</font>

main 方法：抽象类可以有 main 方法，并且我们能运行它；接口不能有 main 方
法。
实现数量：类可以实现很多个接口；但是只能继承一个抽象类。

访问修饰符：<font color=#66CC99 style=" font-weight:bold;">接口中的方法默认使用 public 修饰</font>；抽象类中的方法可以是任意访
问修饰符


##### 1.8 string 常用的方法有哪些？（了解）

indexOf()：返回指定字符的索引。

charAt()：返回指定索引处的字符。

replace()：字符串替换。

trim()：去除字符串两端空白。

split()：分割字符串，返回一个分割后的字符串数组。

getBytes()：返回字符串的 byte 类型数组。

length()：返回字符串长度。

toLowerCase()：将字符串转成小写字母。

toUpperCase()：将字符串转成大写字符。

substring()：截取字符串。

equals()：字符串比较。


##### 1.9 什么是单例模式？有几种？（必会）

单例模式：某个类的实例在多线程环境下只会被创建一次出来。

单例模式有饿汉式单例模式、懒汉式单例模式和双检锁单例模式三种。

饿汉式：<font color=#66CC99 style=" font-weight:bold;">线程安全，一开始就初始化</font>。
在线程访问单例对象之前就已经创建好一个私有静态全局对象。再加上，由于一个<font color=#66CC99 style=" font-weight:bold;">类在整个生命周期中只会被加载一次</font>，因此该单例类只会创建一个实例。线程每次都只能也必定只可以拿到这个唯一的对象
![[Pasted image 20220801235314.png]]
懒汉式：<font color=#66CC99 style=" font-weight:bold;">非线程安全，延迟初始化</font>。
![[Pasted image 20220801235338.png]]
```java
if(instance == null){
	//多线程情况下,多个线程同时检查instance=null的情况下会创建多个实例
	instance = new Singleton();
}
```

双检锁：线程安全，延迟初始化。
给该类加锁后,该段代码只能被一个线程访问
```java
synchroized(Singleton.class){
	
	if(singleton == null){
		singleton = new Singleton();
	}
}
```
![[Pasted image 20220801235359.png]]