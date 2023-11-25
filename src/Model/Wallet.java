package Model;

public class Wallet extends Wallet1 {
    private String str;
    private int summa;

    public Wallet() {
        this.str = "Ozon";
        this.summa = 125;
    }

    public Wallet(String str, int summa) {
        super(str, summa);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int getSumma() {
        return summa;
    }

    @Override
    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "str='" + str + '\'' +
                ", summa=" + summa +
                '}';
    }
}
