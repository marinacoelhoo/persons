package com.personas.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Student extends Person {
    private int numberStudent = 2;
    private BigDecimal average;

    @Override
    public String toString() {
        return "" + "\n------- ESTUDANTE -------"+
                "\nNome do Estudante: " + this.getName() +
                "\nMedia do Estudante: " + this.getAverage() +
                "\nNumero do Estudante: " + this.getNumberStudent();

    }
}
