package Menu;


import Model.Credit_card;
import Model.Wallet;
import Model.Working_map;

import java.util.Scanner;

public class Menu1 {
    public String menuController() {
        String str1 = "1-Создать кошелёк\n" +
                "2-Добавления денег в кошелёк\n" +
                "3-Снятия денег с кошелька\n"+
                "4-Получение  информации кошелька \n"+
                "5-получение деньги по всем кошелькам\n"+
                "6-Создать кредитную карту\n" +
                "7-Добавления денег на кредитную карту\n" +
                "8-Снятия денег с карты\n"+
                "9-Получение деньги по всем кредитным картам\n"+
                "10-Получение информации кредитную карту\n"+
                "11-получения общей суммы по всем кошелькам и картам \n" +
                "12-Работа со списком текущих затрат\n" +
                "13-Работа со списком потенциальный затрат\n" +
                "14-Работа со списком потенциальный доход\n";
        return str1;

    }

   public void menuShow(){
       System.out.println("Введите цифру:");
       Working_map working_map = new Working_map();
//       String temp=null;
       int in;
        while (true){
            Scanner scanner =new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("Создать ");
                     String temp = scanner.nextLine();
                    int a = scanner.nextInt();
                    working_map.setWallets(temp,a);
                    break;
//                case 2:
//                    temp =scanner.nextLine();
//                    in= scanner.nextInt();
//                    working_map.walletsName(temp).add(in);

//                case 3:
//                       temp=scanner.nextLine();
//                       in=scanner.nextInt();
//                     working_map.walletsName(temp).Summa(in);
//                case 4:
//                    temp=scanner.nextLine();
//                     working_map.walletsName(temp).toString();
//                case 5:
//                    working_map.walletsSumma();
//                case 6:
//                    temp=scanner.nextLine();
//                    in=scanner.nextInt();
//                    working_map.setCredit_cards(temp,in);
//
//                case 7:
//                    temp=scanner.nextLine();
//                    in=scanner.nextInt();
//                     working_map.credit_cardsName(temp).add(in);
//                case 8:
//                    temp=scanner.nextLine();
//                    in=scanner.nextInt();
//                     working_map.credit_cardsName(temp).Summa(in);
//                case 9:
//                  working_map.credit_cardsSumma();
//                case 10:
//                    temp= scanner.nextLine();
//                 working_map.credit_cardsName(temp).toString();
//                case 11:
//                working_map.allSumma();
//                case 12:
//                     int v = scanner.nextInt();
//                    if(v==1){
//                        temp=scanner.nextLine();
//                        in= scanner.nextInt();
//                        working_map.setCurrent_costs(temp,in);
//                    }else if(v==2){
//                        working_map.current_costsShow().toString();
//                    }
//                case 13 :
//                    int j= scanner.nextInt();
//                    if(j==1){
//                        temp= scanner.nextLine();
//                        in = scanner.nextInt();
//                        working_map.setPotential_costs(temp,in);
//                    }  else if(j==2){
//                        working_map.potential_costsShow().toString();
//                    }
//                case 14:
//                   int k = scanner.nextInt();
//                    if(k==1){
//                        temp = scanner.nextLine();
//                        in = scanner.nextInt();
//                        working_map.setPotential_incomes(temp,in);
//                    }else if(k==2){
//                        working_map.potential_incomeShow().toString();
//                    }
            }
        }
   }
}
