package com.godfathers.pizza.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
public abstract class Ordination {
    protected Consumation consumation;
    protected String note;

    public Ordination(Consumation consumation, String note)
    {
        this.setConsumation(consumation);
        this.setNote(note);
    }

}
