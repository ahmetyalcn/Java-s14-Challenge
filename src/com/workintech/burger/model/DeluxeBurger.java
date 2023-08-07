package com.workintech.burger.model;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", 19.10, BreadRollType.DOUBLE_BURGER);
        super.setMeat("Double");
        this.cips = cips;
        this.drink = drink;
    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Cannot add additional items to a deluxe burger.");
    }
}
