package spring_start;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_start.staff.Souvenir;

public class TestAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextComponentScan.xml");

        Souvenir souvenir = context.getBean("knittedToy", Souvenir.class);
        souvenir.makeHappy();

        context.close();
    }
}
