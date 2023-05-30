package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
//@ToString
public abstract class ExtraPizzaDecorator extends Consumation {
    protected Consumation decoratedPizza;

    public ExtraPizzaDecorator(String name, Double price, Double calories) {
        super(name, price, calories);
    }

    @Override
    public abstract String getName();
    public abstract Double getPrice();
    public abstract Double getcalories();
}
