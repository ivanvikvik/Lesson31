package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.entity.BreadEntity;

public class Main {
    public static void main(String[] args) {
        BreadEntity bread = new BreadEntity("White", "Best", 2.5);

        System.out.println(bread);
    }
}