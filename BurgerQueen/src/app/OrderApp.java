package app;

import app.product.ProductRepository;
import app.product.*;
public class OrderApp {

    public void start() {

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        System.out.println("🍔 BurgerQueen Order Service");


    }
}
