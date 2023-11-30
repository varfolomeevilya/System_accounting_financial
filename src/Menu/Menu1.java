package Menu;


import Model.Credit_card;
import Model.Wallet;
import Model.Working_map;

import java.util.Scanner;

public class Menu1 {
    public String menuController() {
        String str1 = "1-Создать кошелёк\n" +
                "2-Добавления денег в кошелёк\n" +
                "3-Снятия денег с кошелька\n" +
                "4-Получение  информации кошелька \n" +
                "5-получение деньги по всем кошелькам\n" +
                "6-Отображения информации всем кошельков\n" +
                "7-Создать кредитную карту\n" +
                "8-Добавления денег на кредитную карту\n" +
                "9-Снятия денег с карты\n" +
                "10-Получение деньги по всем кредитным картам\n" +
                "11-Получение информации кредитную карту\n" +
                "12-получения общей суммы по всем кошелькам и картам \n" +
                "13-Отображения информации всем кредитной карты\n" +
                "14-Работа со списком текущих затрат\n" +
                "15-Работа со списком потенциальный затрат\n" +
                "16-Работа со списком потенциальный доход\n";
        return str1;

    }

    public void menuShow() {
        System.out.println("Введите цифру:");
        Working_map working_map = new Working_map();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = null;
        String temp = "";
        int in=0;
        while (true) {
            switch (scanner1.nextInt()) {
                case 1:
                    scanner= new Scanner(System.in);
                    System.out.println("Создать");
                     temp = scanner.nextLine();
                    int a = scanner.nextInt();
                    working_map.setWallets(temp, a);
                    break;
                case 2:
                    scanner= new Scanner(System.in);
                    temp = scanner.nextLine();
                    in = scanner.nextInt();
                    working_map.walletsName(temp).add(in);
                    break;

                case 3:
                    scanner = new Scanner(System.in);
                    System.out.println("Снятия денег кошелька");
                    temp = scanner.nextLine();
                    in = scanner.nextInt();
                    working_map.walletsName(temp).Summa(in);
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Получение информации кошелька");
                    temp = scanner.nextLine();
                    System.out.println(working_map.walletsName(temp).toString());
                    break;
                case 5:
                    scanner = new Scanner(System.in);
                    System.out.println("Получение деньги по всем кoшелькам");
                    working_map.walletsSumma();
                    break;
                case 6:
                    scanner = new Scanner(System.in);
                    System.out.println("отображения информацию всем кошелькам");
                    System.out.println( working_map.walletsShow().toString());
                    break;
                case 7:
                    scanner = new Scanner(System.in);
                    System.out.println("Создать кредитную карту");
                    temp = scanner.nextLine();
                    in = scanner.nextInt();
                    working_map.setCredit_cards(temp, in);
                    break;
                case 8:
                    scanner=new Scanner(System.in);
                    System.out.println("Добавления денег на кредитную карту");
                    temp = scanner.nextLine();
                    in = scanner.nextInt();
                    working_map.credit_cardsName(temp).add(in);
                    break;
                case 9:
                    scanner = new Scanner(System.in);
                    System.out.println("Снятия денег с кредитной карты");
                    temp = scanner.nextLine();
                    in = scanner.nextInt();
                    working_map.credit_cardsName(temp).Summa(in);
                    break;

                case 10:
                    scanner = new Scanner(System.in);
                    System.out.println("Получение денег по всем кредитным картам");
                    working_map.credit_cardsSumma();
                    break;

                case 11:
                    scanner = new Scanner(System.in);
                    System.out.println("Информацию по кредитной карты");
                    temp = scanner.nextLine();
                    working_map.credit_cardsName(temp).toString();
                    break;
                case 12:
                    scanner = new Scanner(System.in);
                    System.out.println("Получение общей суммы");
                    working_map.allSumma();
                    break;
                case 13:
                    scanner = new Scanner(System.in);
                    System.out.println("Отображение информации кредитной карты");
                    System.out.println(working_map.credit_cardsShow().toString());
                    break;
                case 14:
                    scanner = new Scanner(System.in);
                    System.out.println("Работа списком текущщих затрат");
                    int v = scanner.nextInt();
                    if (v == 1) {
                        temp = scanner.nextLine();
                        in = scanner.nextInt();
                        working_map.setCurrent_costs(temp, in);
                    } else if (v == 2) {
                        System.out.println( working_map.current_costsShow().toString());
                    }
                    break;
                case 15:
                    scanner=new Scanner(System.in);
                    System.out.println("Работа списком потенциальных затрат");
                    int j = scanner.nextInt();
                    if (j == 1) {
                        temp = scanner.nextLine();
                        in = scanner.nextInt();
                        working_map.setPotential_costs(temp, in);
                    } else if (j == 2) {
                        System.out.println(working_map.potential_costsShow().toString());
                    }
                    break;
                case 16:
                    scanner=new Scanner(System.in);
                    System.out.println("Работа списком потенциальных доходов");
                    int k = scanner.nextInt();
                    if (k == 1) {
                        temp = scanner.nextLine();
                        in = scanner.nextInt();
                        working_map.setPotential_incomes(temp, in);
                    } else if (k == 2) {
                        System.out.println(working_map.potential_incomeShow().toString());
                    }
                    break;
            }
        }
    }
}
