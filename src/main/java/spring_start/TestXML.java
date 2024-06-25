package spring_start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class TestXML {

    private static final int FROM_NUMBER_FIRST_THREAD = 1;
    private static final int TO_NUMBER_FIRST_THREAD = 500;
    private static final int FROM_NUMBER_SECOND_THREAD = 501;
    private static final int TO_NUMBER_SECOND_THREAD = 1000;

    private static final String TEMPLATE = "%s : %d\n";
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TheMessage message = context.getBean("toy", TheMessage.class);
        message.makeHappy();
    }
}
