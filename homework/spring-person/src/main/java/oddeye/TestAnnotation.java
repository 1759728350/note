package oddeye;/*
 **description:
 **param&method:
 **caller:
 **problems:
 */

import oddeye.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
