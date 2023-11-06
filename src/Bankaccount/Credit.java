package Bankaccount;

import java.util.Scanner;

public class Credit {
    public static void credit(Users user) {
        Scanner in = new Scanner(System.in);
        int cred = user.getCredit();
        System.out.println("Здесь находится информация про ваш кредит!");
        System.out.println("Сумма кредита сейчас: " + cred + " рублей\n" +
                "Какую операцию хотите выбрать?\n" +
                "1-взять деньги\n" +
                "2-погасить долг");
        int a = in.nextInt();
        switch (a)
        {
            case 1:
                getMoney(user, cred);
                break;
            case 2:
                giveMoney(user, cred);
                break;
            case 3:
                System.out.println("Такой операции нет");
                Main.operations(user);
        }
    }
    private static void getMoney(Users user, int cred)
    {
        if(cred != 0)
        {
            System.out.println("Оплатите долг прежде чем брать новый!");
            Main.operations(user);
        }
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите колличество денег, которые вы хотите взять");
            int sum = in.nextInt();
            int procent = (sum/100) * 10;
            int dolg = sum + procent;
            System.out.println("Вы взяли: " + sum + " рублей под 10%\n" +
                    "Ваш долг составляет: " + dolg + "рублей");
            user.setCredit(dolg);
            user.setSum(user.getSum() + sum);
            user.setHispop(user.getHispop() + sum);
            Main.operations(user);
        }
    }
    private static void giveMoney(Users user, int cred)
    {
        if(cred == 0)
        {
            System.out.println("У вас нет непогашенного кредита!");
            Main.operations(user);
        }
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите колличество денег, которые вы хотите погасить");
            int sum = in.nextInt();
            if(sum > cred)
            {
                System.out.println("Ваш долг меньше, чем вы собираетесь погасить");
                giveMoney(user, cred);
            }
            else
            {
                int ostatok = cred - sum;
                System.out.println("Вы погасили: " + sum + " рублей\n" +
                        "Ваш долг составляет: " + ostatok + "рублей");
                user.setCredit(ostatok);
                user.setSum(user.getSum() - sum);
                user.setHisperevodov(user.getHisperevodov() + sum);
                Main.operations(user);
            }
        }
    }
}
