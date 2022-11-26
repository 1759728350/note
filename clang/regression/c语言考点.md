
<font color=#FF6666* style=" font-weight:bold;">主要用于记录考点</font>

### 数据类型
这两个类型的数据类型都是浮点型
float小数点后六位精度       
占两个字节
double小数点后15位精度
占4个字节

printf("占位控制格式",变量)

十进制int表示%d
十进制小数float%f
无符号八进制int%o
无符号十六进制int%x
字符串string%s
字符char%c
十进制小数double%lf

##### 分割符
一次输入两个
![](img/Pasted%20image%2020221008172927.png)
就要用到分割符

##### 隐式分割标记
指空格，回车 Tab键。
在控制格式中如果，两个格式说明符之间没有符号，则系统用默认的分割符
比如a空格b
注意:这种分割标记是在数值类型时才会有


##### 求三个浮点数平均值
```c
void main(){
	double a,b,c,d;
	//输入时必须用双精度
	scanf("%lf%lf&lf",&a,&b,&c);
	//如果算整数,可以把3改成3.0,也可以用double转型
	d = (a+b+c)/3;
	//输出可以用f和lf
	printf("%lf",d)
}

```
##### double和float区别
[区别](../double和float区别###double和float区别)

<font color=#99CCFF style=" font-weight:bold;">scanf和printf</font>

##### 运算符
* 取余数
取余必须是整数
a%b=0    ==>  a是b的倍数 
* 整数相除
是整数
* 库函数
pow(a,b)求乘方
sqrt(a)开平方
abs(a)求绝对值
fabs(a)求浮点数绝对值

##### a++和++a
a++先作为表达式结算然后再自身加一
![](img/Pasted%20image%2020221008185749.png)

对计算顺序的影响
![](img/Pasted%20image%2020221008190143.png)












![](img/Pasted%20image%2020220917194037.png)




### 字符存储
![](img/Pasted%20image%2020220917195117.png)
![](img/Pasted%20image%2020220917195628.png)

![](img/Pasted%20image%2020220917195956.png)




##### 输入
printf()
单个字符的输入输出
getchar()
putchar()
