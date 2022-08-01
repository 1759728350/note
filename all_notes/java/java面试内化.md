

## 1.Java 基础 知识
##### 1.1面向对象(了解)

封装
就是把对象的属性和方法结合为一个整体，并尽可能隐藏内部实现细节，就是把不想告诉或者不该告诉别人的东西隐藏起来，把可以告诉别人的公开，别人只能用我提供的功能实现需求，而不知道是如何实现的。增加安全性。

继承：子类继承父类的属性和方法，并能根据自己的需求扩展出新的行为，提高了代码的复用性。

多态是指不同的子类在继承父类后分别都重写覆盖了父类的方法，即父类同一个方法，在继承的子类中表现出不同的形式。
,把不同的子类对象都当作父类来看，向上屏蔽了不同子类对象之间的差异，写出通用的代码，以适应需求的不断变化。
```java
父类或接口  起的名字 = new 子类
(左边)              (右边)
```

抽象
抽象类用 abstract 关键字来修饰，用 abstract修饰类时，此类就不能被实例化，从这里可以看出，抽象类（接口）就是为了继承而存在的

##### 数据类型(了解)
![[Pasted image 20220801191718.png]]

##### 1.3JDK JRE JVM 的区别 （必会）
![[Pasted image 20220801192822.png]]
JVM 是 Java Virtual Machine（Java 虚拟机），
所有的java程序会首先被编译为.class的类文件，这种类文件可以在虚拟机上执行,是整个 java 实现跨平台的最核心的部分，能够运行以 Java 语言的软件程序。

JRE（Java Runtime Environment）是运行 JAVA 程序所必须的环境的集合，
包含 java 虚拟机和 java 程序的一些核心类库。

JDK（Java Development Kit）是整个 Java 的核心，是 java 开发工具包，
包括了 Java 运行环境 JRE、Java 工具和 Java 基础类库。

在JDK的安装目录下有一个jre目录，里面有两个文件夹bin和lib，在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，而jvm和 lib合起来就称为jre。

[相关解释](https://blog.csdn.net/weixin_45525272/article/details/117825058?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522165934959216782388031797%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=165934959216782388031797&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-117825058-null-null.142^v37^pc_rank_34&utm_term=jre&spm=1018.2226.3001.4187)

##### 1.4 重载和重写的区别（必会）
