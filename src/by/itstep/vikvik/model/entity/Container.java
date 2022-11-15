package by.itstep.vikvik.model.entity;

public interface Container {
    void add(Product product);
    Product get(int index);
    int size();
}
