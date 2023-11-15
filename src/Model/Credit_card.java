package Model;


public class Credit_card extends Wallet { // создал класс кредитная карта наследование от класса кошелька
    public Credit_card(String name, int summa) {
        super(name, summa);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
