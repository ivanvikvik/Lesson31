package by.itstep.vikvik.model.logic;

import by.itstep.vikvik.model.entity.Container;
import by.itstep.vikvik.model.entity.Product;

public class ShopAssistance {
    public static double calculateTotalPrice(Container container) {
        if (container == null) {
            return -1;
        }

        double total = 0;

        for (int i = 0; i < container.size(); i++) {
            Product product = container.get(i);
            total += product.getPrice();
        }

        return total;
    }
}
