

import Model.Credit_card;
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

    public static void main(String[] args) {
        Wallet mywallet = new Wallet();
        Credit_card credit_card = new Credit_card("Tinkoff", 5000);

        mywallet.setCredit_cards(credit_card);
        System.out.println(mywallet.toString());
        mywallet.delete(credit_card);
        System.out.println(mywallet.toString());
        System.out.println(mywallet.toString());
        mywallet.delete(mywallet);
        System.out.println(mywallet.toString());
//        Wallet mywallet = new Wallet();
//        Credit_card credit_card = new Credit_card("Tinkoff", 5000);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите пункт");
//        int n= scanner.nextInt();
//        int i=0;
//        System.out.println("1:Открыть кошелёк");
//        System.out.println("2:Получение деньги по всем кошелькам");
//        System.out.println("3:Добавить редактирование информацию кошелька");
//        System.out.println("4:Удаление редактирование информации кошелёк");
//        System.out.println("5:Открыть кредитную карту");
//        System.out.println("6:Добавить кредитную карту\n");
//        System.out.println("7:Получение деньги по всем картам\n");
//        System.out.println("8:получения общей суммы по всем кошелькам и картам\n ");
//        System.out.println("9: Работа списком текущего затрат\n");
//        System.out.println("10:Работа со списком потенциальный затрат\n");
//        System.out.println("11: Работа со списком потенциальный доход\n");
//        System.out.println("12:Удаление редактирование информацию кредитной карты\n");
//        mywallet.addCheques(100);
//        mywallet.addCheques(2000);
//        mywallet.addCheques(300);

//        credit_card.addCredit_cards("MasterCard", 26000);
//        credit_card.deleteCredit_cards("Visa", 15000);
//        credit_card.credit_cardsSumma();
////
//        System.out.println(mywallet.credit_cardsSumma());
//        System.out.println(mywallet.chequesSumma());
//        System.out.println(mywallet.allSumma());
//        mywallet.setCredit_cards(credit_card);
//        mywallet.toString();
//        System.out.println(mywallet.getCurrent_costs());
//        Menu menu = new Menu();
//        menu.menu01();
//        menu.menu02();
//        menu.menu03();
//        menu.menu04();
//        menu.menu05();
//        menu.menu06();
//        menu.menu07();
//        menu.menu08();
//        menu.menu09();
//        menu.menu10();
//        menu.menu11();
//        menu.menu12();
//        menu.toString();
//        Operation operation= new Operation();
//        operation.menu1();
//        operation.menu2();
//        operation.menu3();
//        operation.menu4();
//        operation.menu5();
//        operation.menu6();
//        operation.menu7();
//        operation.menu8();
//        operation.menu9();
//        operation.menu10();
//        operation.menu11();
//        operation.menu12();
//       menu.menuController();
//       menu.onWallet1(i);
//       menu.onWallet2(i);
//       menu.onWallet3(i);
//       menu.WalletMenu1(i);
//       menu.WalletMenu2(i);
//       menu.WalletMenu3(i);


    }
}
