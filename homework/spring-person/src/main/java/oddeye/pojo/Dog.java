package oddeye.pojo;/*
 **description:
 **param&method:
 **caller:
 **problems:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Value("修勾勾")
    private String dname;
    @Value("4")
    private String dage;

    public Dog() {
    }

    public Dog(String dname, String dage) {
        this.dname = dname;
        this.dage = dage;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDage() {
        return dage;
    }

    public void setDage(String dage) {
        this.dage = dage;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dname='" + dname + '\'' +
                ", dage='" + dage + '\'' +
                '}';
    }
}
