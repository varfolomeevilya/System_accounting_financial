import Model.Wallet;
import Operations.Operation;
import Menu.Menu;


import java.util.Scanner;

// Система хранит следующую информацию:
//        кошельки (название кошелька, сумма в нем и т.д.);
//        кредитные карты (название карты, сумма на ней и т. д.);
//        список текущих затрат;
//        список потенциальных затрат;
//        список потенциальных доходов (премия, зарплата и т. д.).
//        Приложение должно предоставлять интерфейс для:
//        отображения состояния кошелька;
//        получения суммы по всем кошелькам;
//        отображения состояния кредитной карты;
//        получения суммы по всем кредитным картам;
//        получения общей суммы по всем кошелькам и картам;
//        добавления, удаления, редактирования информации кошелька;
//        добавления, удаления, редактирования информации кредитной карты;
//        работы со списком потенциальных затрат;
//        работы со списком текущих затрат;
//        работы со списком потенциальных доходов
public class Main {
    public static void main(String[] args)  {
        Wallet mywallet = new Wallet();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int i=0;
        mywallet.addCheques(100);
        mywallet.addCheques(2000);
        mywallet.addCheques(300);
        mywallet.addCredit_cards("BTB", 25000);
        mywallet.addCredit_cards("Visa", 50000);
        System.out.println(mywallet.credit_cardsSumma());
        System.out.println(mywallet.chequesSumma());
        System.out.println(mywallet.allSumma());
        mywallet.toString();
        System.out.println(mywallet.getCurrent_costs());
        Menu menu = new Menu();
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
        Operation operation= new Operation();
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
       menu.menuController();
       menu.onWallet1(i);
       menu.onWallet2(i);
       menu.onWallet3(i);
       menu.WalletMenu1(i);
       menu.WalletMenu2(i);
       menu.WalletMenu3(i);

    }
}
