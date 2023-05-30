package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j

public class ExtraPizzaFamilySizeDecorator extends ExtraPizzaDecorator{
    public ExtraPizzaFamilySizeDecorator(){
        super("Family Size",4.15, 1.95);

    }
    public ExtraPizzaFamilySizeDecorator(Consumation pizza){
        super("Family Size",4.15, 1.95);
        this.decoratedPizza = pizza;
    }
    @Override
    public String getName() {
        return decoratedPizza.getName() + " Family Size";
    }
    @Override
    public Double getPrice() {
        return decoratedPizza.getPrice() + this.price;
    }
    @Override
    public Double getcalories() {
        return decoratedPizza.getCalories() * this.calories;
    }
    public String print() {
        return "{" +
                "name=Family Size for pizza "  +
                "calories= x" + this.calories +
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
