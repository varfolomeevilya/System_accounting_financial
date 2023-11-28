package Model;


import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;


import java.util.ArrayList;


public class Working_map {

    private ArrayList<Integer> cheques = new ArrayList<>();
    private ArrayList<Credit_card> credit_cards = new ArrayList<>();
    private ArrayList<Potential_income> potential_incomes = new ArrayList<>();
    private ArrayList<Current_costs> current_costs = new ArrayList<>();
    private ArrayList<Potential_costs> potential_costs = new ArrayList<>();
    private ArrayList<Wallet> wallets = new ArrayList<>();



    public void addCheques(int chequesSum) { // добавления список чек
        cheques.add(chequesSum);
    }

    public void deleteCheques(int chequeSum) {
        cheques.remove(chequeSum);
    }

    public void delete(Wallet wallets) {
        this.credit_cards.remove(wallets);
    }

    public void delete(Credit_card credit_cards) {
        this.credit_cards.remove(credit_cards);
    }

//    public void Current_costs(Current_costs current_costs) {
//        current_costs.setStr("Купить одежду");
//        current_costs.setPrice(79.12);
//    }
//
//    public void Potential_costs(Potential_costs potential_costs) {
//
//        potential_costs.setPrice(1.1250000);
//        potential_costs.setStr("Купить машину");
//    }
//
//    public void Potential_income(Potential_income potential_income) {
//
//        potential_income.setName();
//        potential_income.setPrize(10);
//    }


//    public int credit_cardsSumma(){
//        int sum=0;
//       for (Iterator<Map.Entry<String, Integer>> iterator = credit_cards.entrySet().iterator(); iterator.hasNext();){
//          Map.Entry<String, Integer> pair = iterator.next();
//          sum += pair.getValue();
//        }
//        return sum;
//    }

    public int chequesSumma() {
        int sum = 0;
        for (int a : cheques) {
            sum += a;
        }
        return sum;
    }

    public int walletsSumma() { // Складывает все суммы кошельков
        int sum = 0;
        for (Wallet a : wallets) {
            sum += a.getSumma();
        }
        return sum;
    }

    public int credit_cardsSumma() { // Складываем все суммы кредитных карт
        int sum = 0;
        for (Credit_card a : credit_cards) {
            sum += a.getSumma();
        }
        return sum;
    }

    public Credit_card credit_cardsName(String name) { // Поиск кредитных карту по название
        Credit_card credit_card = new Credit_card();
        for (Credit_card a : credit_cards) {
            if (a.getName().equals(name)) {
                credit_card = a;
            }
        }
        return credit_card;
    }

    public Wallet walletsName(String name) { // Поиск кошелька по название
        Wallet wallet = new Wallet();
        for (Wallet a : wallets) {
            if (a.getName().equals(name)) {
                wallet = a;
            }
        }
        return wallet;
    }

    public int allSumma() { // Получение общую по кошелькам и кредитной карты
        return walletsSumma() + credit_cardsSumma();
    }


    public ArrayList<Integer> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Integer> cheques) {
        this.cheques = cheques;
    }

//    public ArrayList<Credit_card> getCredit_cards() {
//        return credit_cards;
//    }

//    public void setCredit_cards(Credit_card credit_cards) { //создал сетер кредитную карта
//        this.credit_cards.add(credit_cards);
//    }
    public void setCredit_cards(String name, int summa){ // Добавление кредитной картам
       Credit_card credit_card = new Credit_card();
       credit_card.setName(name);
       credit_card.setSumma(summa);
       this.credit_cards.add(credit_card);
    }
    public ArrayList<Current_costs> getCurrent_costs() {
        return current_costs;
    }

    public void setCurrent_costs(String name, double price) { // Добавление текущих затрат
        Current_costs current_costs = new Current_costs();
        current_costs.setName(name);
        current_costs.setPrice(price);
        this.current_costs.add(current_costs);
    }

    public void setPotential_costs(String name, double price) { // Добавление потенциальных затрат

        Potential_costs potential_costs = new Potential_costs();
        potential_costs.setName(name);
        potential_costs.setPrice(price);
        this.potential_costs.add(potential_costs);
    }

    public void setPotential_incomes(String name, double summa) { // Добавление потенциальных доход
        Potential_income potential_incomes = new Potential_income();
        potential_incomes.setName(name);
        potential_incomes.setSumma(summa);
        this.potential_incomes.add(potential_incomes);

    }
    public ArrayList<Potential_income> getPotential_incomes() {
        return potential_incomes;
    }

    public ArrayList<Potential_costs> getPotential_costs() {
        return potential_costs;
    }

//    public void setWallets(Wallet wallets) {
//        this.wallets.add(wallets);
//    }
    public void setWallets(String name, int summa){ // Добавление кошелька
        Wallet wallet = new Wallet();
        wallet.setName(name);
        wallet.setSumma(summa);
        this.wallets.add(wallet);
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }

    public String current_costsShow(){ // информации текущих затрат
       return current_costs.toString();
    }
    public String potential_costsShow(){ // информации потенциальных затрат
        return potential_costs.toString();
    }
    public String potential_incomeShow(){ // информации потенциальных доходов
        return potential_incomes.toString();
    }
    @Override
    public String toString() {
        return "Working_map{" +
                "cheques=" + cheques +
                ", credit_cards=" + credit_cards +
                ", potential_incomes=" + potential_incomes +
                ", current_costs=" + current_costs +
                ", potential_costs=" + potential_costs +
                ", wallets=" + wallets +
                '}';
    }
}
