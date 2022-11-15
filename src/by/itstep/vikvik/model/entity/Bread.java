package by.itstep.vikvik.model.entity;

import java.util.Objects;

public class Bread extends Product {

    private String color;
    private String flour;

    public Bread() {
        color = "";
    }

    public Bread(String color, String flour, double price) {
        super(price);
        setColor(color);
        this.flour = flour;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bread bread = (Bread) o;
        return color.equals(bread.color) && flour.equals(bread.flour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flour, getPrice());
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
                super.toString() + '}';
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
