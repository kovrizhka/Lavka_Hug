package spring_start.staff;

import org.springframework.stereotype.Component;

//@Component("postcard")
public class Postcard implements Souvenir {

    @Override
    public void makeHappy() {
        System.out.println("Я бумажная и я радую человека!!!");
    }
}
