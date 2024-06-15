package com.personas.model;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class Professor extends Person{

    private BigDecimal salary;

    @Override
    public String toString() {
        return "" + "\n------- PROFESSOR -------"+
                "\nNome do Professor: " + this.getName() +
                "\nSalário do Professor: " + this.getSalary();
    }
}
