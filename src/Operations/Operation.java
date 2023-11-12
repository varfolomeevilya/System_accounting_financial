package Operations;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Model.Credit_card;
import Model.Wallet;
import Views.Menu;

public class Operation {
    private Menu menu;
    public Operation() {
    }

    public Menu menu(Wallet wallet) {
        Menu menu = new Menu();
       menu.menu01();
       menu.menu02();
       menu.menu03();
       menu.menu04();
        return menu;
    }

    public Menu menu(Credit_card credit_card) {
        Menu menu = new Menu();
        menu.menu05();
        menu.menu06();
        menu.menu07();
        return menu;
    }

    public Menu menu(Current_costs current_costs) {
        Menu menu = new Menu();
        menu.menu08();
        menu.menu09();

        return menu;
    }

    public Menu menu(Potential_costs potential_costs) {
        Menu menu = new Menu();
        menu.menu10();
        menu.menu11();
        return menu;
    }

    public Menu menu(Potential_income potential_income) {
        Menu menu = new Menu();
        menu.menu12();
        menu.menu13();
        return menu;
    }
   public void menu1(){
       System.out.println("1:Открыть кошелёк");
       System.out.println("2:Получение деньги по всем кошелькам");

       System.out.println("3:Добавить редактирование информацию кошелька");
       System.out.println("4:Удаление редактирование информации кошелёк");
   }
   public void menu2(){
       System.out.println("1: Открыть кошелёк\n" +
               "2: Получение деньги по всем кошелькам\n" +
               "3: Добавить редактирование информацию кошелька\n" +
               "5:Получение деньги по всем картам" +
               "6:Открыть кредитную карту" +
               "7:Получение деньги по всем картам"
       );
   }
   public void menu3(){
       System.out.println("1: Открыть кошелёк\n" +
               "2: Получение деньги по всем кошелькам\n" +

               "5:Открыть кредитную карту\n" +
               "7:Получение деньги по всем картам\n" +
               "8:Получение деньги по всем кошелькам картам\n" +
               "9:Добавить редактирование информацию кредитной карты\n" +

               "11: Работа со списком потенциальный затрат\n" +
               "12: Работа со списком текущих затрат\n" +
               "13: Работа со списком потенциальный доход\n");
   }
   public void menu4(){
       System.out.println("3: Добавить редактирование информацию кошелька\n" +
               "4:Удаление редактирование информации кошелька\n");
   }
    public void menu5(){
        System.out.println("5:Получение деньги по всем картам\n");
    }
    public void menu6(){
        System.out.println("6:Добавить кредитную карту\n");
    }
    public void menu7(){
        System.out.println("7:Удаление редактирование информации кошелька\n");
    }
    public void menu8(){
        System.out.println("8: Работа списком текущего затрат\n");
    }
    public void menu9(){
        System.out.println("9:Работа списком текущего затрат\n");
    }
    public void menu10(){
        System.out.println("10: Работа со списком текущих затрат\n");
    }
    public void menu11(){
        System.out.println("11: Работа со списком потенциальный затрат\n");
    }
    public void menu12(){
        System.out.println("12: Работа со списком текущих затрат\n");
    }
    public void menu13(){
        System.out.println("13: Работа со списком потенциальный доход\n");
    }
}
