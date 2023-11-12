package Costs;

import Cheques.Cheque;

public class Current_costs extends Cheque {
    private String str;
    private double price;
    public Current_costs(){
        this.str="Купить одежду";
        this.price= 79.50;
    }

    public Current_costs(String str, double price) {
        this.str = str;
        this.price = price;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Current_costs{" +
                "str='" + str + '\'' +
                ", price=" + price +
                '}';
    }
}
