package Menu;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Model.Wallet;


import java.util.Scanner;

public class Menu {
    private Wallet wallet;
    private Current_costs current_costs;
    private Potential_costs potential_costs;
    private Potential_income potential_income;
    private final Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public Menu(Wallet wallet, Current_costs current_costs, Potential_costs potential_costs, Potential_income potential_income) {
        this.wallet = wallet;
        this.current_costs = current_costs;
        this.potential_costs = potential_costs;
        this.potential_income = potential_income;
    }

    public void menuController() {
        if (menu01() == 1) {
            System.out.println("Открыть кошелек\n");
        }
        if (menu02() == 2) {
            wallet.allSumma();
        } else {
            System.out.println("Получение деньги кошелька\n");
        }
        if (menu03() == 3) {
            wallet.addCheques(100);
        } else {
            System.out.println("Добавление деньги в кошелька\n");
        }
        if (menu04() == 4) {
            wallet.deleteCheques(2000);
        } else {
            System.out.println("Удаление деньги  кошелька\n");
        }
        if (menu05() == 5) {
            System.out.println("Открыть кредитную карту\n");
        }
        if (menu06() == 6) {
            wallet.addCredit_cards("visa", 25000);
        } else {
            System.out.println("Добавить редактирование информацию кредитной карты\n");
        }
        if (menu07() == 7) {
            wallet.deleteCredit_cards("Mastercard", 50000);
        } else {
            System.out.println("Удаление редактирование информацию кредитной карты\n");
        }
        if (menu08() == 8) {
            wallet.credit_cardsSumma();
        } else {
            System.out.println("получения общей суммы по всем кошелькам и картам \n");
        }
        if (menu09() == 9) {
            current_costs.getStr();
            current_costs.getPrice();
        } else {
            System.out.println(" Работа со списком текущих затрат\n");
        }
        if (menu10() == 10) {
            potential_costs.getStr();
            potential_costs.getPrice();
        } else {
            System.out.println(" Работа со списком потенциальный затрат\n");
        }
        if (menu11() == 11) {
            potential_income.getPrize();
            potential_income.getSalary();
        } else {
            System.out.println(" Работа со списком потенциальный доход\n");
        }
    }

    public void onWallet1(int i) {
        switch (i) {
            case 1 -> {
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек\n");
                }

            }
            case 2 -> {
                if (menu02() == 2) {
                    wallet.allSumma();

                } else {
                    System.out.println("Получение деньги кошелька\n");
                }
            }
            case 3 -> {
                if (menu03() == 3) {
                    wallet.addCheques(100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }
            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(2000);
                } else {
                    System.out.println("Удаление деньги  кошелька");
                }
            }
            default -> {
                System.out.println("Неверный пункт");
            }
        }
    }

    public void onWallet2(int i) {
        switch (i) {
            case 1 -> {
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }
            }
            case 2 -> {
                if (menu02() == 2) {
                    wallet.allSumma();
                } else {
                    System.out.println("Получение деньги кошелька");
                }

            }
            case 3 -> {
                if (menu03() == 3) {
                    wallet.addCheques(3100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }

            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(300);
                } else {
                    System.out.println("Удаление деньги информации кошелька");
                }
            }
            case 5 -> {
                if (menu05() == 5) {
                    System.out.println("Открыть кредитную карту");
                }
            }
            case 6 -> {
                if (menu06() == 6) {
                    wallet.addCredit_cards("Visa", 25000);
                } else {
                    System.out.println("Добавить редактирование информацию кредитной карты");
                }
            }
            case 7 -> {
                if (menu07() == 7) {
                    wallet.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление редактирование информацию кредитной карты");
                }
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }

    }

    public void onWallet3(int i) {
        switch (i) {
            case 1 -> {
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }

            }
            case 2 -> {
                if (menu02() == 2) {
                    wallet.allSumma();
                } else {
                    System.out.println("Получение деньги кошелька");
                }


            }
            case 3 -> {
                if (menu03() == 3) {
                    wallet.addCheques(3100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }

            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(300);
                } else {
                    System.out.println("Удаление деньги информации кошелька");
                }

            }
            case 5 -> {
                if (menu05() == 5) {
                    System.out.println("Открыть кредитную карту");
                }

            }
            case 6 -> {
                if (menu06() == 6) {
                    wallet.addCredit_cards("Visa", 25000);
                } else {
                    System.out.println("Добавить редактирование информацию кредитной карты");
                }

            }
            case 7 -> {
                if (menu07() == 7) {
                    wallet.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление редактирование информацию кредитной карты");
                }

            }
            case 8 -> {
                if (menu08() == 8) {
                    wallet.credit_cardsSumma();
                } else {
                    System.out.println("получения общей суммы по всем кошелькам и картам ");
                }

            }
            case 9 -> {
                if (menu09() == 9) {
                    current_costs.getStr();
                    current_costs.getPrice();
                } else {
                    System.out.println(" Работа со списком текущих затрат\n");
                }

            }
            case 10 -> {
                if (menu10() == 10) {
                    potential_costs.getStr();
                    potential_costs.getPrice();
                } else {
                    System.out.println(" Работа со списком потенциальный затрат\n");
                }

            }
            case 11 -> {
                if (menu11() == 11) {
                    potential_income.getPrize();
                    potential_income.getSalary();
                } else {
                    System.out.println(" Работа со списком потенциальный доход");
                }
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }

    }


    public void WalletMenu1(int i) {
        switch (i) {
            case 1 -> {
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }

            }
            case 2 -> {
                if (menu02() == 2) {
                    wallet.allSumma();

                } else {
                    System.out.println("Получение деньги кошелька");
                }

            }
            case 3 -> {
                if (menu03() == 3) {
                    wallet.addCheques(100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }

            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(2000);
                } else {
                    System.out.println("Удаление деньги  кошелька");
                }

            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }
    }

    public void WalletMenu2(int i) {
        switch (i) {
            case 1 -> {
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }
            }
            case 2 -> {
                if (menu02() == 2) {
                    wallet.allSumma();

                } else {
                    System.out.println("Получение деньги кошелька");
                }
                break;
            }
            case 3 -> {
                if (menu03() == 3) {
                    wallet.addCheques(100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }
            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(2000);
                } else {
                    System.out.println("Удаление деньги  кошелька");
                }

            }
            case 5 -> {
                if (menu05() == 5) {
                    System.out.println("Открыть кредитную карту");
                }
            }
            case 6 -> {
                menu06();
                wallet.addCredit_cards("Visa", 25000);

                System.out.println("Добавить  кредитной карты");
                break;
            }
            case 7 -> {
                if (menu07() == 7) {
                    wallet.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление  кредитной карты");
                }

            }
            default -> {
                System.out.println("Неверный пункт");
            }
        }
    }


    public void WalletMenu3(int i) {
        switch (i) {
            case 1 -> {
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }

            }
            case 2 -> {
                if (menu02() == 2) {
                    wallet.allSumma();
                } else {
                    System.out.println("Получение деньги кошелька");
                }

            }
            case 3 -> {
                if (menu03() == 3) {
                    wallet.addCheques(3100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }

            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(300);
                } else {
                    System.out.println("Удаление деньги  кошелька");
                }

            }
            case 5 -> {
                if (menu05() == 5) {
                    System.out.println("Открыть кредитную карту");
                }

            }
            case 6 -> {
                if (menu06() == 6) {
                    wallet.addCredit_cards("Visa", 25000);
                } else {
                    System.out.println("Добавить редактирование информацию кредитной карты");
                }

            }
            case 7 -> {
                if (menu07() == 7) {
                    wallet.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление  кредитной карты");
                }

            }
            case 8 -> {
                if (menu08() == 8) {
                    current_costs.getStr();
                } else {
                    System.out.println("получения общей суммы по всем кошелькам и картам");
                }

            }
            case 9 -> {
                if (menu09() == 9) {
                    potential_costs.setPrice(1.215000);
                } else {
                    System.out.println("9 Работа со списком текущих затрат\n");
                }

            }
            case 10 -> {
                if (menu10() == 10) {
                    potential_income.setPrize(10);

                    potential_income.setSalary(15000);
                } else {
                    System.out.println(" Работа со списком потенциальный доход");
                }

            }
            case 11 -> {
                if (menu11() == 11) {
                    potential_income.getPrize();
                    potential_income.getSalary();
                } else {
                    System.out.println(" Работа со списком потенциальный доход");
                }
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }
    }


    public int menu01() {
//        if (menu02() == 2) {
//            wallet.allSumma();
//            System.out.println("Получение деньги кошелька");
//        }
////        else {
////            System.out.println("Получение деньги кошелька");
////        }
        onWallet2(scanner.nextInt());
        return menu01();
    }

    public int menu02() {
//        if (menu01() == 1) {
//            System.out.println("Открыть кошелек");
//        }
////      else{
////         System.out.println("Открыть кошелек");
////        }
        onWallet1(scanner.nextInt());

        return menu02();
    }

    public int menu03() {

//        if (menu04() == 4) {
//            wallet.deleteCheques(300);
//            System.out.println("Удаление деньги  кошелька");
//       }
////        else {
////            System.out.println("Удаление деньги  кошелька");
////        }

        onWallet3(scanner.nextInt());

        return menu03();
    }

    public int menu04() {
//        if (menu03() == 3) {
//            wallet.addCheques(3100);
//            System.out.println("Добавление деньги в кошелька");
//        }
////        else {
////            System.out.println("Добавление деньги в кошелька");
////        }

        onWallet2(scanner.nextInt());
        return menu04();
    }

    public int menu05() {
//        if (menu06()==6) {
//            wallet.addCredit_cards("Visa", 25000);
//            System.out.println("Добавить редактирование информацию кредитной карты");
//        }
////        else {
////            System.out.println("Добавить редактирование информацию кредитной карты");
////        }
        onWallet3(scanner.nextInt());
        return menu05();
    }


    public int menu06() {
//        if (menu05() == 5) {
//            System.out.println("Открыть кредитную карту");
//        }
//        else{
//
//        }
        onWallet2(scanner.nextInt());
        return menu06();
    }

    public int menu07() {
//        if (menu08() == 8) {
//           wallet.credit_cardsSumma();
//            System.out.println("8:получения общей суммы по всем кошелькам и картам\n");
//        }
//        else{
//            System.out.println("8:получения общей суммы по всем кошелькам и картам\n");
//        }
        onWallet3(scanner.nextInt());
        return menu07();
    }

    public int menu08() {
//        if (menu07() == 7) {
//            wallet.deleteCredit_cards("Mastercard", 50000);
//            System.out.println("7Удаление  кредитной карты");
//        }
//        else{
//            System.out.println("7Удаление  кредитной карты");
//        }
        onWallet2(scanner.nextInt());
        return menu08();
    }

    public int menu09() {
//        if (menu10() == 10) {
//            potential_income.getPrize();
//
//            potential_income.getSalary();
//            System.out.println(" Работа со списком потенциальный доход");
//        }
//        else{
//            System.out.println(" Работа со списком потенциальный доход");
//        }
        onWallet3(scanner.nextInt());
        return menu09();
    }

    public int menu10() {
//        if (menu11() == 11) {
//            potential_income.getPrize();
//            potential_income.getSalary();
//            System.out.println(" Работа со списком потенциальный доход");
//        }
//        else{
//            System.out.println(" Работа со списком потенциальный доход");
//        }
        onWallet2(scanner.nextInt());
        return menu10();
    }

    public int menu11() {
//       if (menu09() == 9) {
//            potential_costs.getStr();
//            potential_costs.getPrice();
//           System.out.println(" Работа со списком потенциальный затрат\n");
//        }
//        else {
//           System.out.println(" Работа со списком потенциальный затрат\n");
//         }
        onWallet3(scanner.nextInt());
        return menu11();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "wallet=" + wallet +
                ", current_costs=" + current_costs +
                ", potential_costs=" + potential_costs +
                ", potential_income=" + potential_income +
                '}';
    }
}



