package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public class ExtraPizzaCheeseDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaCheeseDecorator(){
        super("Cheese",0.69, 92.0);
    }
    public ExtraPizzaCheeseDecorator(Consumation pizza){
        super("Cheese",0.69, 92.0);
        this.decoratedPizza = pizza;
    }
    @Override
    public String getName() {
        return decoratedPizza.getName()+ " con extra Cheese";
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
