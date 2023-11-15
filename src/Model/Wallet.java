package Model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wallet {
    private String name; // создал два поле
    private int summa;
   private ArrayList<Integer> cheques=new ArrayList<>();
    private HashMap<String, Integer> credit_cards= new HashMap<>();
    private ArrayList<Integer> potentail_income = new ArrayList<>();
    private HashMap<String, Double> current_costs = new HashMap<>();

    public Wallet(){ // создал конструктор
        this.name = "Ozon";
        this.summa = 135;
    }

    public Wallet(String name, int summa) { // создал конструктор по умолчанию
        this.name = name;
        this.summa = summa;
    }
    public void addCheques(int chequesSum){ // добавления список чек
        cheques.add(chequesSum);
    }
    public void deleteCheques(int chequeSum){
        cheques.remove(chequeSum);
    }
    public void addCredit_cards(String credit_cards, Integer summa){ // добавления кредитная карта
       this.credit_cards.put(credit_cards, summa);
    }
    public void deleteCredit_cards(String credit_cards, Integer summa){
        this.credit_cards.remove(credit_cards, summa);
    }
    public int credit_cardsSumma(){
        int sum=0;
        for (Iterator<Map.Entry<String, Integer>> iterator = credit_cards.entrySet().iterator(); iterator.hasNext();){
          Map.Entry<String, Integer> pair = iterator.next();
          sum += pair.getValue();
        }
        return sum;
    }

    public int chequesSumma(){
        int sum=0;
        for (int a : cheques){
            sum+=a;
        }
        return sum;
    }
    public int allSumma(){
        return chequesSumma() + credit_cardsSumma();
    }
    public String getName() { // создал гетер название
        return name;
    }

    public void setName(String name) { // создал сетер название
        this.name = name;
    }

    public int getSumma() { // создал гетер сумма
        return summa;
    }

    public void setSumma(int summa) { // создал сетер сумма
        this.summa = summa;
    }

    public ArrayList<Integer> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Integer> cheques) {
        this.cheques = cheques;
    }

    public HashMap<String, Integer> getCredit_cards() {
        return credit_cards;
    }

    public void setCredit_cards(HashMap<String, Integer> credit_cards) {
        this.credit_cards = credit_cards;
    }

    public ArrayList<Integer> getPotentail_income() {
        return potentail_income;
    }

    public void setPotentail_income(ArrayList<Integer> potentail_income) {
        this.potentail_income = potentail_income;
    }

    public HashMap<String, Double> getCurrent_costs() {
        return current_costs;
    }

    public void setCurrent_costs(HashMap<String, Double> current_costs) {
        this.current_costs = current_costs;
    }
    @Override
    public String toString() {
        return "Wallet{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                ", cheques=" + cheques +
                ", credit_cards=" + credit_cards +
                ", potentail_income=" + potentail_income +
                ", current_costs=" + current_costs +
                '}';
    }
}
