package oddeye;

import oddeye.pojo.Classroom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Classroom classroom = (Classroom) context.getBean("classroom");
        System.out.println(classroom);
    }
}
