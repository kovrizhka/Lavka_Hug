package spring_start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Souvenir souvenir = context.getBean("souvenir", Souvenir.class);

        ShoppingCart cart = new ShoppingCart(souvenir);
        cart.buySouvenir();

        context.close();
    }
}
