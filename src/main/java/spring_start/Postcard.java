package spring_start;

public class Postcard implements TheMessage {

    @Override
    public void makeHappy() {
        System.out.println("Я бумажная и я радую человека!!!");
    }
}
