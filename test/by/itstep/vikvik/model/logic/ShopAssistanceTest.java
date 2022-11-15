package by.itstep.vikvik.model.logic;

import by.itstep.vikvik.model.entity.Basket;
import by.itstep.vikvik.model.entity.Container;
import by.itstep.vikvik.model.entity.Product;
import org.junit.Test;
import static org.junit.Assert.*;


public class ShopAssistanceTest {
    @Test
    public void testEmptyContainer(){
        Container container = new Basket();
        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(container);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testNull(){
        double expected = -1;

        double actual = ShopAssistance.calculateTotalPrice(null);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testContainerHasOneProduct(){
        Container container = new Basket();
        Product product = new Product(10.5);
        container.add(product);
        double expected = product.getPrice();

        double actual = ShopAssistance.calculateTotalPrice(container);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPrice(){
        Container container = new Basket();
        container.add(new Product(10.5));
        container.add(new Product(20.11));
        container.add(new Product(30.3));

       // System.out.println(container); // debug

        double expected = 60.91;

        double actual = ShopAssistance.calculateTotalPrice(container);

        assertEquals(expected, actual, 0.001);
    }

}
