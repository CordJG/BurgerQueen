package app.product.subproduct;

import app.product.Product;

public class Side extends Product {

    private int ketchup;

    public Side(int id, String name, int price, int kcal, int ketchup) {
        super(id, name, price, kcal);
        this.ketchup = ketchup;
    }

    public int getKetchup() {
        return ketchup;
    }

    public void setKetchup(int ketchup) {
        this.ketchup = ketchup;
    }
}
