package com.godfathers.pizza.entities;

public class Table {
    String ref;
    Int seats;
    Boolean free;

    public Table(String ref, Int seats, Boolean free) {
        this.ref = ref;
        this.seats = seats;
        this.free = free;
    }
}
