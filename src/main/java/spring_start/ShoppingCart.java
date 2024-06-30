package spring_start;

public class ShoppingCart {

    private Souvenir souvenir;

    public ShoppingCart(Souvenir souvenir) {
        this.souvenir = souvenir;
    }

    public ShoppingCart() {
        System.out.println("ShoppingCart создана!");
    }

    public void buySouvenir() {
        System.out.println("Покупаю!");
        souvenir.makeHappy();
    }

    public void setSouvenir(Souvenir souvenir) {
        this.souvenir = souvenir;
        System.out.println("В корзину добавлен: " + this.souvenir);
    }

}
