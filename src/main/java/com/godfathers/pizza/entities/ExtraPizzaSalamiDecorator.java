package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class ExtraPizzaSalamiDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaSalamiDecorator(){
        super("Salami",0.99, 66.0);
    }
    public ExtraPizzaSalamiDecorator(Consumation pizza){
        super("Salami",0.99, 66.0);
        this.decoratedPizza = pizza;
    }
    @Override
    public String getName() {
        return decoratedPizza.getName()+ " con Salami";
    }
    @Override
    public Double getPrice() {
        return decoratedPizza.getPrice() + this.price;
    }
    @Override
    public Double getcalories() {
        return decoratedPizza.getCalories() + this.calories;
    }
    public String print() {
        return "{" +
                "calories= +" + this.calories +
                ", price= +" + this.price +
                '}';
    }
    @Override
    public String toString() {
        return "{" +
                "calories=" + this.getCalories() +
                ", name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                '}';
    }
}
