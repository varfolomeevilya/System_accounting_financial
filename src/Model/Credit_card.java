package Model;


public class Credit_card {
    private String name;
    private int summa;

    public Credit_card() {
        this.name = "Tinkoff";
        this.summa = 135;
    }

    public Credit_card(String name, int summa) {
        this.name = name;
        this.summa = summa;
    }

    public void add(int summa) {
        this.summa += summa;
    }

    public void Summa(int summa) {
        this.summa -= summa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}
