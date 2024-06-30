package spring_start;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private int id;

    private String title;

    //todo подумать над типом даты
//    private Date creationDate;

    private final List<Souvenir> souvenirList;

//    public ShoppingCart(Souvenir souvenir) {
//        this.souvenir = souvenir;
//    }

    public ShoppingCart() {
        souvenirList = new ArrayList<>();
        System.out.println("ShoppingCart создана!");
    }

    public void buySouvenir() {
        System.out.println("Покупаю!");
        for (Souvenir souvenir : souvenirList) {
            souvenir.makeHappy();
        }
    }

    public void setSouvenir(Souvenir souvenir) {
        this.souvenirList.add(souvenir);
        System.out.println("В корзину добавлен: " + souvenir);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Корзина № " + id);
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("Корзина магазина " + title);
        this.title = title;
    }
}
