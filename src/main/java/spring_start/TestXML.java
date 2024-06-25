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

//        ///////////////////////////////////////////////////////////


        SumOfNumbers firstSum = new SumOfNumbers(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        Thread firstThread = new Thread(firstSum);
        firstThread.start();

        SumOfNumbers secondSum = new SumOfNumbers(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);
        Thread secondThread = new Thread(secondSum);
        secondThread.start();

        waitForThread(firstThread, secondThread);
        int finalResult = firstSum.getResult() + secondSum.getResult();
        printInfo(finalResult);
    }

//    private static SumOfNumbers startTaskInThread(int fromNumber, int toNumber) {
//        SumOfNumbers newTaskFoSumming = new SumOfNumbers(fromNumber, toNumber);
//        Thread taskClassThread = new Thread(newTaskFoSumming);
//        taskClassThread.start();
//        return newTaskFoSumming;
//    }

    private static void printInfo(int number) {
        System.out.printf(TEMPLATE, Thread.currentThread().getName(), number);
    }

    private static void waitForThread(Thread... threads) {
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static final class SumOfNumbers implements Runnable {
        private final static int INITIAL_NUMBER = 0;
        private final int fromNumber;
        private final int toNumber;

        public int getResult() {
            return result;
        }

        private int result;

        SumOfNumbers(int fromNumber, int toNumber) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.result = INITIAL_NUMBER;
        }

        @Override
        public void run() {
            IntStream.rangeClosed(fromNumber, toNumber).forEach(i -> result += i);
            printInfo(result);
//            System.out.println(result + " я поток " + Thread.currentThread().getName() + ". Закончил работу!");
        }
    }

}
