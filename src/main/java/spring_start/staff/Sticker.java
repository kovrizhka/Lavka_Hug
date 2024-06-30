package spring_start.staff;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Sticker implements Souvenir {

    public Sticker() {
    }

    @Override
    public void makeHappy() {
        System.out.println("Меня клеят и я радую человека!!!");
    }
}
