package spring_start;

public class ShoppingCart {

    private final Souvenir souvenir;

    public ShoppingCart(Souvenir souvenir) {
        this.souvenir = souvenir;
    }

    public void buySouvenir() {
        System.out.println("Покупаю!");
        souvenir.makeHappy();
    }
}
