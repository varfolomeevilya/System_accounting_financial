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

    private  Scanner scanner = new Scanner(System.in);

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
           credit_card.deleteCredit_cards("Tinroff", 125);
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
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }
                break;
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

                break;
            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(2000);
                } else {
                    System.out.println("Удаление деньги  кошелька");
                }
                break;
            }
        }
    }

    public void onWallet2(int i) {
        switch (i) {
            case 1 -> {

                System.out.println("Открыть кошелек");
                break;
            }
            case 2 -> {
                menu02();
                System.out.println("Получение деньги кошелька");

                break;
            }
            case 3 -> {
                menu03();
                wallet.addCheques(3100);
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
                if (menu07() == 7) {
                    credit_card.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление редактирование информацию кредитной карты");
                }
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
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }
                break;
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
                    wallet.addCheques(3100);
                } else {
                    System.out.println("Добавление деньги в кошелька");
                }
                break;
            }
            case 4 -> {
                if (menu04() == 4) {
                    wallet.deleteCheques(300);
                } else {
                    System.out.println("Удаление деньги информации кошелька");
                }
                break;
            }
            case 5 -> {
                if (menu05() == 5) {
                    System.out.println("Открыть кредитную карту");
                }
                break;
            }
            case 6 -> {
                if (menu06() == 6) {
                    credit_card.addCredit_cards("Visa", 25000);
                } else {
                    System.out.println("Добавить редактирование информацию кредитной карты");
                }
                break;
            }
            case 7 -> {
                if (menu07() == 7) {
                    credit_card.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление редактирование информацию кредитной карты");
                }
                break;
            }
            case 8 -> {
                if (menu08() == 8) {
                    current_costs.getStr();
                } else {
                    System.out.println(" Работа со списком текущих затрат\n");
                }
                break;
            }
            case 9 -> {
                if (menu09() == 9) {
                    potential_costs.setPrice(1.215000);
                } else {
                    System.out.println(" Работа со списком потенциальный затрат\n");
                }
                break;
            }
            case 10 -> {
                if (menu10() == 10) {
                    potential_income.setPrize(10);

                    potential_income.setSalary(15000);
                } else {
                    System.out.println(" Работа со списком потенциальный доход");
                }
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
                if (menu01() == 1) {
                    System.out.println("Открыть кошелек");
                }

                break;
            }
            case 2 -> {
                menu02();
                System.out.println("Получение деньги кошелька");

                break;
            }
            case 3 -> {
                menu03();
                wallet.addCheques(3100);
                System.out.println("Добавление деньги в кошелька");
                break;
            }
            case 4 -> {
                menu04();
                System.out.println("Удаление деньги информации кошелька");
                break;
            }
            case 5 -> {
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
                if (menu07() == 7) {
                    credit_card.deleteCredit_cards("Mastercard", 50000);
                } else {
                    System.out.println("Удаление редактирование информацию кредитной карты");
                }
                break;
            }
            default -> {
                System.out.println("Неверный пункт");

            }
        }
    }

    public void WalletMenu2(int i) {
        switch (i) {
            switch (i) {
                case 1 -> {
                    if (menu01() == 1) {
                        System.out.println("Открыть кошелек");
                    }

                    break;
                }
                case 2 -> {
                    menu02();
                    System.out.println("Получение деньги кошелька");

                    break;
                }
                case 3 -> {
                    menu03();
                    wallet.addCheques(3100);
                    System.out.println("Добавление деньги в кошелька");
                    break;
                }
                case 4 -> {
                    menu04();
                    System.out.println("Удаление деньги информации кошелька");
                    break;
                }
                case 5 -> {
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
                    if (menu07() == 7) {
                        credit_card.deleteCredit_cards("Mastercard", 50000);
                    } else {
                        System.out.println("Удаление редактирование информацию кредитной карты");
                    }
                    break;
                }
                default -> {
                    System.out.println("Неверный пункт");

                }
            }
        }


        public void WalletMenu3 (int i2 ){
            switch (i2) {
                case 1 -> {
                    if (menu01() == 1) {
                        System.out.println("Открыть кошелек");
                    }
                    break;
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
                        wallet.addCheques(3100);
                    } else {
                        System.out.println("Добавление деньги в кошелька");
                    }
                    break;
                }
                case 4 -> {
                    if (menu04() == 4) {
                        wallet.deleteCheques(300);
                    } else {
                        System.out.println("Удаление деньги информации кошелька");
                    }
                    break;
                }
                case 5 -> {
                    if (menu05() == 5) {
                        System.out.println("Открыть кредитную карту");
                    }
                    break;
                }
                case 6 -> {
                    if (menu06() == 6) {
                        credit_card.addCredit_cards("Visa", 25000);
                    } else {
                        System.out.println("Добавить редактирование информацию кредитной карты");
                    }
                    break;
                }
                case 7 -> {
                    if (menu07() == 7) {
                        credit_card.deleteCredit_cards("Mastercard", 50000);
                    } else {
                        System.out.println("Удаление редактирование информацию кредитной карты");
                    }
                    break;
                }
                case 8 -> {
                    if (menu08() == 8) {
                        current_costs.getStr();
                    } else {
                        System.out.println(" Работа со списком текущих затрат\n");
                    }
                    break;
                }
                case 9 -> {
                    if (menu09() == 9) {
                        potential_costs.setPrice(1.215000);
                    } else {
                        System.out.println(" Работа со списком потенциальный затрат\n");
                    }
                    break;
                }
                case 10 -> {
                    if (menu10() == 10) {
                        potential_income.setPrize(10);

                        potential_income.setSalary(15000);
                    } else {
                        System.out.println(" Работа со списком потенциальный доход");
                    }
                    break;
                }
                default -> {
                    System.out.println("Неверный пункт");

                }
            }
        }
    }
}



