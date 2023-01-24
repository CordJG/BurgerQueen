package app;

import app.product.ProductRepository;
import app.product.*;
import app.*;

import java.util.Scanner;

public class OrderApp {

    public void start() {




        Scanner sc = new Scanner(System.in);

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        Cart cart = new Cart(productRepository, menu);

        System.out.println("🍔 BurgerQueen Order Service");

        while(true) {
            menu.printMenu();
            String input = sc.nextLine();

            if(input.equals("+")) {

                break;
            }
            else {
                int menuNumber = Integer.parseInt(input);

                if(menuNumber ==0) cart.printCart();
                else if (1 <= menuNumber && menuNumber <=products.length) cart.addToCart(menuNumber);
            }

        }

        menu.printMenu();
        String input = sc.nextLine();


    }
}
