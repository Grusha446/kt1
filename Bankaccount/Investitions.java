package Bankaccount;

import java.util.Scanner;

public class Investitions {
    public static void investitions(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в инвестиции!\n" +
                "Здесь собраны акции компаний.");
        System.out.println("Введите интересующую вас компанию:");
        String company = in.next();
        companys(company, user);
    }
    public static void companys(String company, Users user){
        Scanner in = new Scanner(System.in);
        Companies comp = Companies.valueOf(company);
        int sum = comp.getPrice();
        System.out.println("Стоимость компании " + comp + ": " + sum);
        System.out.println("Желаете купить акции?");
        int a = in.nextInt();
        switch (a)
        {
            case 1:
                buyoperation(user, company);
                break;
            case 0:
                investitions(user);
                break;
            default:
                System.out.println("Такого варианта ответа нет");
                Main.operations(user);
        }
    }
    private static void buyoperation(Users user, String company)
    {
        int summa = user.getSum();
        Companies comp = Companies.valueOf(company);
        int price = comp.getPrice();
        System.out.println("Введите колличество акций");
        Scanner in = new Scanner(System.in);
        int kolvo = in.nextInt();
        int itog = price * kolvo;
        if(itog > summa)
        {
            System.out.println("Не хватает денег!");
            Operacii.errormessage();
            Main.operations(user);
        }
        else
        {
            int sum = summa - itog;
            user.setSum(sum);
            System.out.println("Покупка на сумму: " + itog + " рублей успешна!");
            System.out.println("Итоговый баланc: " + sum);
            user.setHisperevodov(user.getHisperevodov() + itog);
            Main.operations(user);
        }
    }
}
