
### double和float区别
##### 单双精度
单精度是float
双精度是double

单精度32位
双精度64位

单精度是 1 位符号， 8 位指数， 23位小数。
双精度是 1 位符号 ,11 位指数， 52 位小数。
就是double比float表示的数范围大

##### 占位符

float，单精度浮点型，对应%f。  
double,双精度浮点型，对应%lf。
%f告诉scanf函数在所传地址位置上存储一个float型值，  
而%lf告诉scanf函数在所传地址位置上存储一个double型值。

##### scanf和printf使用时
scanf输入时千万不能把格式对于错了
double用%f会报错
同理
float用%f也会报错

printf输出时
比如输出double时用%lf和%f没啥区别
但最好要用对应的输出

##### 默认double
一个小数默认是double
要表示float需要在数后面加f