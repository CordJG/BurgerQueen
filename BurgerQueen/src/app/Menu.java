package app;

import app.product.Product;
import app.product.ProductRepository;
import app.product.subproduct.*;

public class Menu {
    private Product[] products;

    public Menu(Product[] products){
        this.products = products;
    }

    public void printMenu() {
        System.out.println("[π»] λ©λ΄");
        System.out.println("-".repeat(60));

        printHamburgers(true);

        printSide(true);

        printDrink(true);

        System.out.println();
        System.out.println("π (0) μ₯λ°κ΅¬λ");
        System.out.println("π° (+) μ£Όλ¬ΈνκΈ°");
        System.out.println("-".repeat(60));
        System.out.println("[π’] λ©λ΄λ₯Ό μ νν΄μ£ΌμΈμ : ");
    }

    public void printDrink(boolean printPrice) {
        System.out.println("π₯€ μλ£");
        for( Product product : products){
            if(product instanceof Drink) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    public void printSide(boolean printPrice) {
        System.out.println("π μ¬μ΄λ");
        for( Product product : products){
            if(product instanceof Side){
                printEachMenu(product,printPrice);
            }
        }
        System.out.println();
    }

    public void printHamburgers(boolean printPrice) {
        System.out.println("π νλ²κ±°");
        for (Product product : products) {
            if (product instanceof Hamburger) {
                printEachMenu(product,printPrice);
            }
        }
        System.out.println();
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if (printPrice)
        System.out.printf(
                "    (%d) %s %5dKcal %5dμ\n",
                product.getId(), product.getName(), product.getKcal(), product.getPrice()
        );
        else System.out.printf("    (%d) %s %5dKcal\n",
                                product.getId(), product.getName(), product.getKcal());
    }
}
