package Cheques;

public class Cheque {
    private String str;
    private double price;
    public Cheque(){
      this.str="Купить вещи";
      this.price=79.20;
    }
    public Cheque(String str, double price){
        this.str=str;
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
        return "Cheque{" +
                "str='" + str + '\'' +
                ", price=" + price +
                '}';
    }
}
