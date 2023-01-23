package app.product.subproduct;

import app.product.Product;

public class Drink extends Product {
    private boolean hasStraw;

    public Drink(int id, String name, int price, int kcal, boolean hasStraw) {
        super(id, name, price, kcal);
        this.hasStraw = hasStraw;
    }

    public boolean isHasStraw() {
        return hasStraw;
    }

    public void setHasStraw(boolean hasStraw) {
        this.hasStraw = hasStraw;
    }
}
