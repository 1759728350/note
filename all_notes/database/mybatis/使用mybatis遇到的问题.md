### mapper.xml没有被打包

<font color=#66CC99 style=" font-weight:bold;">BingingExecption</font>
```
<build>  
    <plugins>  
        <plugin>  
            <groupId>org.springframework.boot</groupId>  
            <artifactId>spring-boot-maven-plugin</artifactId>  
        </plugin>  
    </plugins>  
  
    <resources>  
        <resource>  
            <directory>src/main/java</directory>  
            <includes>  
                <include>**/*.properties</include>  
                <include>**/*.xml</include>  
            </includes>  
            <filtering>false</filtering>  
        </resource>  
        <resource>  
            <directory>src/main/resources</directory>  
            <includes>  
                <include>**/*.properties</include>  
                <include>**/*.xml</include>  
            </includes>  
            <filtering>false</filtering>  
        </resource>  
    </resources>  
  
  
</build>
```
上面的plugin是maven打包插件,用于将项目打包为可直接运行的jar
[../../project_blog/springboot项目打包](../../project_blog/springboot项目打包)

下面这个resource是扫描文件时将xml文件也要打包进去
最后在target目录下确保xml和mapper接口在一起
![](img/Pasted%20image%2020220910022124.png)