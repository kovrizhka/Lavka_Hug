package spring_start.staff;

import org.springframework.stereotype.Component;

@Component
public class KnittedToy implements Souvenir {

    public KnittedToy() {
//        System.out.println("Продаётся вязаная игрушка!");
    }

    @Override
    public void makeHappy() {
        System.out.println("Я мягкая и я радую человека!!!");
    }

    public void initializeKnittedToy() {
        System.out.println("Создана вязаная игрушка!");
    }

    public void destroyKnittedToy() {
        System.out.println("Вязаная игрушка продана!");
    }
}
