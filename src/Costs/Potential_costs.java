package Costs;

import Cheques.Cheque;

public class Potential_costs {
    private String str;
    private double price;
    public Potential_costs(){
        this.str="Купить машину";
        this.price = 1.1250000;
    }

    public Potential_costs(String str, double price) {
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
        return "Potential_costs{" +
                "str='" + str + '\'' +
                ", price=" + price +
                '}';
    }
}
