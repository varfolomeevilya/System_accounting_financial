package Costs;

import Cheques.Cheque;

public class Potential_income {
    private String name;  // создал два поля
    private double summa;
    public Potential_income(){ // создал конструктор пустой
        this.name = null;
        this.summa= 0;
    }

    public Potential_income(String name, double summa) { // создал конструктор по умолчание
        this.name = name;
        this.summa = summa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Potential_income{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}
