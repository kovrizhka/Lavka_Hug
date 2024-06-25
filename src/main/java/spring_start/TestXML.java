package spring_start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class TestXML {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TheMessage message = context.getBean("toy", TheMessage.class);
        message.makeHappy();
    }
}
