package Model;


public class Credit_card extends Wallet1{
    private String str;
    private int summa;

    public Credit_card() {
        this.str = "Tinkoff";
        this.summa = 135;
    }

    public Credit_card(String str, int summa) {
        super(str, summa);
        this.str = str;
        this.summa = summa;
    }

    public void add(int summa) {
        this.summa += summa;
    }

    public void Summa(int summa) {
        this.summa -= summa;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public String toString() {
        return "Credit_card{" +
                "str='" + str + '\'' +
                ", summa=" + summa +
                '}';
    }
}
