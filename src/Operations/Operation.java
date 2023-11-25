package Operations;

import Costs.Current_costs;
import Costs.Potential_costs;
import Costs.Potential_income;
import Model.Credit_card;
import Model.Working_map;
import Menu.Menu;



public class Operation {
    private Menu menu;

    public Operation() {
    }

    public Menu menu(Working_map wallet) {
        Menu menu = new Menu();
        menu.menu01();
        System.out.println("1:Открыть кошелёк");
        menu.menu02();
//       wallet.allSumma();
        System.out.println("2:Получение деньги по всем кошелькам");
       menu.menu03();
       wallet.addCheques(100);
        System.out.println("3:Добавить редактирование информацию кошелька");
       menu.menu04();
       wallet.deleteCheques(2000);
        System.out.println("4:Удаление редактирование информации кошелёк");
        return menu;
    }

    public Menu menu(Credit_card credit_card) {
        Menu menu = new Menu();
        menu.menu05();
        System.out.println("5:Открыть кредитную карту");
        menu.menu06();
        System.out.println("6:Добавить кредитную карту\n");
//        credit_card.addCredit_cards("Tinroff", 25000);
        menu.menu07();
        System.out.println("7:Получение деньги по всем картам\n");
//        credit_card.credit_cardsSumma();
         menu.menu08();
//        credit_card.credit_cardsSumma();
        System.out.println("получения общей суммы по всем кошелькам и картам\n ");
        return menu;
    }

    public Menu menu(Current_costs current_costs) {
        Menu menu = new Menu();
        menu.menu09();
        System.out.println("9: Работа списком текущего затрат\n");
        current_costs.getPrice();
        current_costs.getStr();
        return menu;
    }

    public Menu menu(Potential_costs potential_costs) {
        Menu menu = new Menu();
        menu.menu10();
        System.out.println("10:Работа со списком потенциальный затрат\n");
        potential_costs.getStr();
        potential_costs.getPrice();
        return menu;
    }

    public Menu menu(Potential_income potential_income) {
        Menu menu = new Menu();
        menu.menu11();
        potential_income.getSalary();
        potential_income.getPrize();
        System.out.println("11: Работа со списком потенциальный доход\n");
        return menu;
    }
   public void menu1(){
        System.out.println("1:Открыть кошелёк");

   }
   public void menu2(){
       System.out.println ("2: Получение деньги по всем кошелькам\n");
   }
   public void menu3(){

       System.out.println("3: Добавить редактирование информацию кошелька\n");

   }
   public void menu4(){

       System.out.println("4:Удаление редактирование информации кошелька\n");
   }
    public void menu5(){
        System.out.println("5:Открыть кредитную карту\n");
    }
    public void menu6(){
        System.out.println("6:Добавить кредитную карту\n");
    }
    public void menu7(){
        System.out.println("7:Получение деньги по всем картам\n");
    }
    public void menu8(){
        System.out.println("8:получения общей суммы по всем кошелькам и картам ");
    }
   public void menu9(){
       System.out.println("9:Работа со списком текущих затрат\n");
   }
   public void menu10(){
       System.out.println("10:Работа со списком потенциальный затрат\n");
   }
    public void menu11(){
        System.out.println("11: Работа со списком потенциальный доход\n");
    }

    @Override
    public String toString() {
        return "Operation{" +
                "menu=" + menu +
                '}';
    }
}
