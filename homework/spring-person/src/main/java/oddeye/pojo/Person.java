package oddeye.pojo;/*
 **description:
 **param&method:
 **caller:
 **problems:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    //多属性要写属性名
    @Value("lyh")
    private String pname;
    @Value("20")
    private int page;
    //默认byType
    @Autowired
    private Dog dog;

    public Person() {
    }

    public Person(String pname, int page, Dog dog) {
        this.pname = pname;
        this.page = page;
        this.dog = dog;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page=" + page +
                ", dog=" + dog +
                '}';
    }
}
