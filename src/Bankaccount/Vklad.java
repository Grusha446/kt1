package Bankaccount;
import java.util.Scanner;
public class Vklad {
    public static void vklad(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать на страницу с вашими вкладами!");
        int vklad = user.getVklad();
        System.out.println("Сумма вашего вклада: " + vklad + " рублей");
        System.out.println("Какую операцию хотите выбрать?\n" +
                "1-Положить деньги на вклад\n" +
                "2-Снять деньги");
        int a = in.nextInt();
        switch (a)
        {
            case 1:
                replenVklad(user, vklad);
                break;
            case 2:
                tkoffVklad(user, vklad);
                break;
            case 3:
                System.out.println("Такой операции нет");
                Main.operations(user);
        }
    }
    private static void replenVklad(Users user, int vklad)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму, которую вы хотите положить на вклад!");
        int summa = in.nextInt();
        int sum = user.getSum();
        if(summa > sum)
        {
            System.out.println("На вашем счету нет столько денег!");
            replenVklad(user,vklad);
        }
        else
        {
            user.setVklad(user.getVklad() + summa);
            System.out.println("Вы успешно положили деньги на ваш счет!");
            System.out.println("У вас: " + user.getVklad() + " рублей");
            user.setSum(user.getSum() - summa);
            user.setHisperevodov(user.getHisperevodov() + summa);
            Main.operations(user);
        }
    }

    private static void tkoffVklad(Users user, int vklad)
    {
        if(vklad == 0)
        {
            System.out.println("На вашем счету нет денег, которые можно вывести");
            Main.operations(user);
        }
        else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите колличество денег, которые вы хотите вывести");
            int sum = in.nextInt();
            if (sum > vklad)
            {
                System.out.println("На вашем счету нет столько денег!");
                tkoffVklad(user, vklad);
            }
            else
            {
                System.out.println("Вы сняли: " + sum + " рублей!");
                user.setVklad(user.getVklad() - sum);
                user.setSum(user.getSum() + sum);
                System.out.println("Ваш счет: " + user.getSum() + " рублей");
                Main.operations(user);
                user.setHispop(user.getHispop() + sum);
            }
        }
    }
}
