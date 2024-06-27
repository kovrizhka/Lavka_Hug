package spring_start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXML {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ShoppingCart cart = context.getBean("cart", ShoppingCart.class);
        cart.buySouvenir();

        context.close();
    }
}
