package com.godfathers.pizza.entities;

import com.godfathers.pizza.utils.OrderState;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int orderNumber;
    private double seatPrice;
    private OrderState state;
    private LocalDateTime dateTime;
    private List<Ordination> items;
    private Table tableRef;

    public Order(int orderNumber, double seatPrice, OrderState state, LocalDateTime dateTime, List<Ordination> items, Table tableRef) {
        this.orderNumber = orderNumber;
        this.seatPrice = seatPrice;
        this.state = state;
        this.dateTime = dateTime;
        this.items = items;
        this.tableRef = tableRef;
    }
}
