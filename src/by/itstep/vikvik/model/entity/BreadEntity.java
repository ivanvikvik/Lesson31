package by.itstep.vikvik.model.entity;

import java.util.Objects;

public class BreadEntity {

    private String color;
    private String flour;
    private double price;

    public BreadEntity() {
        color = "";
    }

    public BreadEntity(String color, String flour, double price) {
        setColor(color);
        this.flour = flour;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            color = "";
        }
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BreadEntity bread = (BreadEntity) o;
        return Double.compare(bread.price, price) == 0 && color.equals(bread.color) && flour.equals(bread.flour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flour, price);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
                ", price=" + price +
                '}';
    }

    //    public boolean equals(Object object) {
//        if (object == null) {
//            return false;
//        }
//
//        if (this == object) {
//            return true;
//        }
//
//
//        if (!(object instanceof Bread)) {
//            return false;
//        }
//
//        Bread temp = (Bread) object;
//
//        if (!color.equals(temp.color)) {
//            return false;
//        }
//
//        if (!flour.equals(temp.flour)) {
//            return false;
//        }
//
//        if (price != temp.price) {
//            return false;
//        }
//
//        return true;
//    }

}
