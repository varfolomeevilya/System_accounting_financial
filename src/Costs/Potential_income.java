package Costs;

import Cheques.Cheque;

public class Potential_income {
    private int prize;  // создал два поля
    private int salary;
    public Potential_income(){ // создал конструктор пустой
        this.prize = 10;
        this.salary= 15000;
    }

    public Potential_income(int prize, int salary) { // создал конструктор по умолчание
        this.prize = prize;
        this.salary = salary;
    }

    public int getPrize() {  // создал гет премия
        return prize;
    }

    public void setPrize(int prize) { // создал сет премия
        this.prize = prize;
    }

    public int getSalary() { // создал гет зарплата
        return salary;
    }

    public void setSalary(int salary) {  // создал  сет зарплата
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Potential_income{" +
                "prize=" + prize +
                ", salary=" + salary +
                '}';
    }
}
