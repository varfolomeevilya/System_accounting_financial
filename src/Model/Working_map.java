package Model;


import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Menu.Menu;
import Operations.Operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Working_map {
    private String str; // создал два поле
    private int summa;

    private ArrayList<Integer> cheques = new ArrayList<>();
    private ArrayList<Credit_card> credit_cards = new ArrayList<>();
    private ArrayList<Potential_income> potential_incomes = new ArrayList<>();
    private ArrayList<Current_costs> current_costs = new ArrayList<>();
    private ArrayList<Potential_costs> potential_costs = new ArrayList<>();
    private ArrayList<Wallet> wallets = new ArrayList<>();
    private Menu menu = new Menu();
    private Operation operation = new Operation();

    public Working_map() { // создал конструктор
        this.str = "Tinkoff";
        this.summa = 135;
    }

    public Working_map(String str, int summa) { // создал конструктор по умолчанию
        this.str = str;
        this.summa = summa;

    }

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

    public void Current_costs(Current_costs current_costs) {
        current_costs.setStr("Купить одежду");
        current_costs.setPrice(79.12);
    }

    public void Potential_costs(Potential_costs potential_costs) {

        potential_costs.setPrice(1.1250000);
        potential_costs.setStr("Купить машину");
    }

    public void Potential_income(Potential_income potential_income) {

        potential_income.setSalary(15000);
        potential_income.setPrize(10);
    }

    public void Menu(Menu menu) {
        int i = 0;
        menu.menuController();
        menu.menu01();
        menu.menu02();
        menu.menu03();
        menu.menu04();
        menu.menu05();
        menu.menu06();
        menu.menu07();
        menu.menu08();
        menu.menu09();
        menu.menu10();
        menu.menu11();
        menu.onWallet1(i);
        menu.onWallet2(i);
        menu.onWallet3(i);
        menu.WalletMenu1(i);
        menu.WalletMenu2(i);
        menu.WalletMenu3(i);
        menu.toString();
    }
    public void menuController(){

    }
    public void Operation(Operation operation) {
        operation.menu1();
        operation.menu2();
        operation.menu3();
        operation.menu4();
        operation.menu5();
        operation.menu6();
        operation.menu7();
        operation.menu8();
        operation.menu9();
        operation.menu10();
        operation.menu11();
        operation.toString();
    }
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

    public int walletsSumma() {
        int sum = 0;
        for (Wallet a : wallets) {
            sum += a.getSumma();
        }
        return sum;
    }

    public int credit_cardsSumma() {
        int sum = 0;
        for (Credit_card a : credit_cards) {
            sum += a.getSumma();
        }
        return sum;
    }

        public int allSumma(){
        return chequesSumma() + credit_cardsSumma();
    }
    public Credit_card credit_cardsName(String str) {
        Credit_card credit_card = new Credit_card();
        for (Credit_card a : credit_cards) {
            if (a.getStr().equals(str)) {
                credit_card = a;
            }
        }
        return credit_card;
    }

    public Wallet walletsName(String str) {
        Wallet wallet = new Wallet();
        for (Wallet a : wallets) {
            if (a.getStr().equals(str)) {
                wallet = a;
            }
        }
        return wallet;
    }

//    public int allSumma() {
//        return walletsSumma() + credit_cardsSumma();
//    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
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

//    public ArrayList<Credit_card> getCredit_cards() {
//        return credit_cards;
//    }

    public void setCredit_cards(Credit_card credit_cards) { //создал сетер кредитную карта
        this.credit_cards.add(credit_cards);
    }
    public void setCredit_cards(String str, int summa){
       Credit_card credit_card = new Credit_card();
       credit_card.setStr(str);
       credit_card.setSumma(summa);
       this.credit_cards.add(credit_card);
    }
    public ArrayList<Current_costs> getCurrent_costs() {
        return current_costs;
    }

    public void setCurrent_costs(String str, double price) {
        Current_costs current_costs = new Current_costs();
        current_costs.setStr("Купить одежду");
        current_costs.setPrice(79.12);
        this.current_costs.add(current_costs);
    }

    public void setPotential_costs(String str, double price) {

        Potential_costs potential_costs = new Potential_costs();
        potential_costs.setStr("Купить одежду");
        potential_costs.setPrice(1.1250000);
        this.potential_costs.add(potential_costs);
    }

    public void setPotential_incomes(int prize, int salary) {
        Potential_income potential_incomes = new Potential_income();
        potential_incomes.setPrize(10);
        potential_incomes.setSalary(15000);
        this.potential_incomes.add(potential_incomes);

    }

    public ArrayList<Potential_income> getPotential_incomes() {
        return potential_incomes;
    }

    public ArrayList<Potential_costs> getPotential_costs() {
        return potential_costs;
    }

    public void setWallets(Wallet wallets) {
        this.wallets.add(wallets);
    }
    public void setWallets(String str, int summa){
        Wallet wallet = new Wallet();
        wallet.setStr(str);
        wallet.setSumma(summa);
        this.wallets.add(wallet);
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }

    @Override
    public String toString() {
        return "Working_map{" +
                "str='" + str + '\'' +
                ", summa=" + summa +
                ", cheques=" + cheques +
                ", credit_cards=" + credit_cards +
                ", potential_incomes=" + potential_incomes +
                ", current_costs=" + current_costs +
                ", potential_costs=" + potential_costs +
                ", wallets=" + wallets +
                ", menu=" + menu +
                ", operation=" + operation +
                '}';
    }
}
