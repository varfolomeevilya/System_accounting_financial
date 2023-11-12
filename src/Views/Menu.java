package Views;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Model.Credit_card;
import Model.Wallet;

import java.util.Scanner;

public class Menu {
    private Wallet wallet;
    private Credit_card credit_card;
    private Current_costs current_costs;
    private Potential_costs potential_costs;
    private Potential_income potential_income;

    private final Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public Menu(Wallet wallet, Credit_card credit_card, Current_costs current_costs, Potential_costs potential_costs, Potential_income potential_income) {
        this.wallet = wallet;
        this.credit_card = credit_card;
        this.current_costs = current_costs;
        this.potential_costs = potential_costs;
        this.potential_income = potential_income;
    }

    public void menuController() {
        if (menu01() == 1) {
            wallet.chequesSumma();
        } else if (menu02() == 2) {
            wallet.allSumma();
        } else if (menu03() == 3) {
            wallet.addCheques(100);
        }
        if (menu04() == 4) {
            wallet.deleteCheques(2000);
        } else if (menu05() == 5) {
            credit_card.credit_cardsSumma();

        } else if (menu06() == 6) {
            credit_card.addCredit_cards("visa", 25000);

        }
        if (menu07() == 7) {
            credit_card.deleteCredit_cards("Mastercard", 50000);
        } else if (menu08() == 8) {
            current_costs.getStr();
        } else if (menu09() == 9) {
            System.out.println("9: Открыть кошелек");
        } else if (menu10() == 10) {
            potential_costs.getStr();
        }
        if (menu11() == 11) {
            potential_costs.getPrice();
        } else if (menu12() == 12) {
            potential_income.getPrize();
        }
        if (menu13() == 13) {
            potential_income.getSalary();
        }
    }

    public void onWallet1(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                System.out.println("Ложить деньги кошелька");
                break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                System.out.println("Получение деньги кошелька");
                break;
            }
            case 3 -> {
                menu03();
                System.out.println("Добавление деньги в кошелька");
                break;
            }
            case 4 -> {
                menu04();
                System.out.println("Удаление деньги информации кошелька");
                break;
            }
        }
    }

    public void onWallet2(int i) {
        switch (i) {
            case 1 -> {
                System.out.println();
                System.out.println("Ложить деньги кошелька");
                break;
            }
            case 2 -> {
                menu02();
                System.out.println("Получение деньги кошелька");

                break;
            }
            case 3 -> {
                menu03();
                System.out.println("Добавление деньги в кошелька");
                break;
            }
            case 4 -> {
                menu04();
                System.out.println("Удаление деньги информации кошелька");
                break;
            }
            case 0 -> {
                menu05();

                System.out.println("Открыть кредитную карту");
                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);

                System.out.println("Добавить редактирование информацию кредитной карты");
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                System.out.println("Удаление редактирование информацию кредитной карты");
                break;
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }

    }

    public void onWallet3(int i) {
        switch (i) {
            case 1 -> {
                menu01();

                System.out.println("Ложить деньги кошелька");
                break;
            }
            case 2 -> {
                menu02();

                System.out.println("Получение деньги кошелька");
                break;
            }
            case 3 -> {
                menu03();

                System.out.println("Добавление деньги в кошелька");
                break;
            }
            case 4 -> {
                menu04();

                System.out.println("Удаление деньги информации кошелька");
                break;
            }
            case 0 -> {
                menu05();
                System.out.println("Открыть кредитную карту");

                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                System.out.println("Добавить редактирование информацию кредитной карты");
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                System.out.println("Удаление редактирование информацию кредитной карты");
                break;
            }
            case 8 -> {


                System.out.println(" Работа со списком текущих затрат\n");
                break;
            }
            case 9 -> {
                System.out.println("9: Открыть кошелек");
                break;
            }
            case 10 -> {

                System.out.println(" Работа со списком потенциальный затрат\n");
                break;
            }
            case 11 -> {
                menu11();
                potential_costs.setPrice(1.215000);
                System.out.println(" Работа со списком потенциальный затрат\n");
                break;
            }
            case 12 -> {
                menu12();
                potential_income.setPrize(10);
                System.out.println(" Работа со списком потенциальный доход");
                break;
            }
            case 13 -> {
                menu13();
                potential_income.setSalary(15000);
                System.out.println(" Работа со списком потенциальный доход");
                break;
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }

    }


    public void WalletMenu1(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                wallet.chequesSumma();
                System.out.println("Ложить деньги кошелька");
                break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                System.out.println("Получение деньги кошелька");
                break;

            }
            case 3 -> {
                menu03();
                wallet.addCheques(3100);
                System.out.println("Добавление деньги информации кошелька");

            }
            case 4 -> {
                menu04();
                wallet.deleteCheques(2000);
                System.out.println("Удаление деньги информации кошелька");

            }
            case 5 -> {
                menu03();
                credit_card.credit_cardsSumma();
                System.out.println("Получение деньги на карту ");
                break;
            }
            case 6 -> {
                menu06();
                System.out.println("Добавить редактирование информацию кредитной карты");
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                System.out.println("Удаление редактирование информацию кредитной карты");
                break;
            }
            default -> {
                System.out.println("Неверный пункт");
            }
        }
    }


    public void WalletMenu2(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                wallet.chequesSumma();
                System.out.println("Ложить деньги кошелька");
                break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                System.out.println("Получение деньги кошелька");
                break;
            }
            case 3 -> {
                menu03();
                wallet.addCheques(3100);
                System.out.println("Добавление деньги информации кошелька");
                break;
            }
            case 4 -> {
                menu04();
                wallet.deleteCheques(2000);
                System.out.println("Удаление деньги информации кошелька");
                break;
            }
            case 5 -> {
                menu03();
                credit_card.credit_cardsSumma();

                System.out.println("Получение деньги по всем картам");
                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                System.out.println("6:Добавить кредитную карту");
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                System.out.println("Удаление редактирование информацию кредитной карты");
                break;
            }

            default -> {
                System.out.println("Неверный пункт");

            }
        }
    }


    public void WalletMenu3(int i) {
        switch (i) {
            case 1 -> {
                menu01();
                wallet.chequesSumma();
                System.out.println("Ложить деньги кошелька");
                break;
            }
            case 2 -> {
                menu02();
                wallet.allSumma();
                System.out.println("Получение деньги кошелька");
                break;
            }
            case 3 -> {
                menu03();
                wallet.addCheques(3100);
                System.out.println("Добавление деньги информации кошелька");
                break;
            }
            case 4 -> {
                menu04();
                wallet.deleteCheques(2000);
                System.out.println("Удаление деньги информации кошелька");

                break;
            }
            case 5 -> {
                menu05();
                credit_card.credit_cardsSumma();

                System.out.println("Получение деньги по всем картам");
                break;
            }
            case 6 -> {
                menu06();
                credit_card.addCredit_cards("Visa", 25000);
                credit_card.addCredit_cards("Mastercard", 50000);
                System.out.println("Добавить редактирование информацию кредитной карты");
                break;
            }
            case 7 -> {
                menu07();
                credit_card.deleteCredit_cards("Mastercard", 50000);
                System.out.println("Удаление редактирование информацию кредитной карты");
                break;
            }
            case 8 -> {
                menu08();
                current_costs.getStr();
                System.out.println("10: Работа со списком текущих затрат\n");
                break;
            }
            case 9 -> {
                menu09();
                System.out.println("9: Открыть кошелек");
                break;
            }
            case 10 -> {
                menu10();
                potential_costs.getStr();
                System.out.println(" Работа со списком потенциальный затрат");
                break;
            }
            case 11 -> {
                menu11();
                System.out.println("11: Работа со списком потенциальный затрат");
                break;
            }
            case 12 -> {
                menu12();
                potential_income.getPrize();
                System.out.println(" Работа со списком потенциальный доход");
                break;
            }
            case 13 -> {
                menu13();
                potential_income.getSalary();
                System.out.println(" Работа со списком потенциальный доход");
                break;
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }
    }

    public int menu01() {

        System.out.println("1:Ложить деньги кошелька");
        wallet.addCheques(100);
        onWallet1(scanner.nextInt());
        return menu01();
    }

    public int menu02() {

        System.out.println("2: Получение деньги по всем кошелькам\n");
        wallet.chequesSumma();
        onWallet2(scanner.nextInt());
        return menu02();
    }

    public int menu03() {

        System.out.println("3: Добавить редактирование информацию кошелька\n");
       wallet.addCheques(100);

        onWallet3(scanner.nextInt());
        
        return menu03();
    }

    public int menu04() {
        System.out.println( "4:Удаление редактирование информации кошелька\n");
       wallet.deleteCheques(3100);
        onWallet1(scanner.nextInt());
        return menu04();
    }

    public int menu05() {
        System.out.println("0:Открыть кредитную карту\n");
        onWallet2(scanner.nextInt());
        return 0;
    }

    public int menu06() {
        System.out.println("6:Добавить кредитную карту");
       credit_card.addCredit_cards( "Tinkoff", 250000);
        onWallet3(scanner.nextInt());
        return menu06();
    }

    public int menu07() {
        System.out.println("7:Получение деньги по всем картам\n");
     credit_card.credit_cardsSumma();
        onWallet2(scanner.nextInt());
        return menu07();
    }

    public int menu08() {
        System.out.println("8: Работа списком текущего затрат");
        current_costs.getStr();

        onWallet3(scanner.nextInt());
        return 0;
    }

    public int menu09() {

        System.out.println("9: Открыть кошелек");

        onWallet3(scanner.nextInt());
        return 0;
    }

    public int menu10() {
        System.out.println("10: Работа со списком потенциальный затрат\n");
        potential_costs.getStr();

        onWallet3(scanner.nextInt());
        return menu10();
    }

    public int menu11() {
        System.out.println("11: Работа со списком потенциальный затрат\n");
        potential_costs.getPrice();

        onWallet3(scanner.nextInt());
        return menu11();
    }

    public int menu12() {
        System.out.println("12: Работа со списком потенциальный доход\n");
        potential_income.getPrize();


        onWallet3(scanner.nextInt());
        return menu12();
    }

    public int menu13() {
        System.out.println("13: Работа со списком потенциальный доход\n");
        potential_income.getSalary();

        onWallet3(scanner.nextInt());

        return menu13();
    }
}



