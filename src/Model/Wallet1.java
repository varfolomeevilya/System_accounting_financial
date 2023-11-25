package Model;

public abstract class Wallet1 {
    private String name;
    private int summa;
    public Wallet1(){
        this.name="Ozon";
        this.summa= 125;
    }

    public Wallet1(String name, int summa) {
        this.name = name;
        this.summa = summa;
    }
    public void add(int summa){
        this.summa+= summa;
    }
    public void Summa(int summa){
        this.summa-=summa;
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
        return "Wallet{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}

