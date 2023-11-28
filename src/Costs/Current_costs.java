package Costs;

import Cheques.Cheque;

public class Current_costs{
    private String name;
    private double price;
    public Current_costs(){
        this.name=null;
        this.price= 0;
    }

    public Current_costs(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
