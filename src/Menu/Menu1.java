package Menu;


import Model.Wallet;
import Model.Working_map;

import java.util.Scanner;

public class Menu1 {


    public String menuController() {
        String str1 = "Открыть кошелёк\n" +
                "Получение деньги кошелька\n" +
                "Добавление редактирование информацию кошелька\n" +
                "Удаление  редактирование информацию кошелька\n" +
                "Открыть кредитную карту\n" +
                "Добавить редактирование информацию кредитной карты\n" +
                "Получение деньги по всем картам\n" +
                "получения общей суммы по всем кошелькам и картам \n" +
                " Работа со списком текущих затрат\n" +
                "Работа со списком потенциальный затрат\n" +
                " Работа со списком потенциальный доход\n";
        return str1;

    }

   public void menuShow(){
       System.out.println("Введите цифру");
       Working_map working_map = new Working_map();
       Wallet wallet = new Wallet();
        while (true){
            Scanner scanner =new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                 working_map.walletsName("Ozon");
                case 2:
                    working_map.walletsSumma();
                case 3:
                 working_map.addCheques(100);
                 working_map.setWallets("Cber", 0);
                case 4:
                     working_map.delete(wallet);
                case 5:
                  working_map.credit_cardsName("Cber");
                case 6:
                    working_map.setCredit_cards("Alpha", 0);
                case 7:
                     working_map.credit_cardsSumma();
                case 8:
                    working_map.allSumma();
                case 9:
                  working_map.setCurrent_costs("Купить вещи", 79.12);
                case 10:
                 working_map.setPotential_costs("Купить машину", 1.2150000);
                case 11:
                working_map.setPotential_incomes(10, 1500);
            }
        }
   }

   
}
