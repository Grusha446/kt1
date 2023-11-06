package Bankaccount;
import java.util.Scanner;
public class Acc {
    public static void acc(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(user + " Здесь собрана информация про ваш аккаунт!");
        System.out.println("Что вы хотите узнать?\n" +
                "1-Посмотреть информацию счетов\n" +
                "2-Посмотреть информацию карты\n" +
                "3-Посмотреть историю пополнений и расходов\n" +
                "4-Выйти на главную страницу");
        int a = in.nextInt();
        switch (a)
        {
            case 1:
                checkInfo(user);
                break;
            case 2:
                checkCard(user);
                break;
            case 3:
                checkhist(user);
                break;
            case 4:
                Main.operations(user);
                break;
            default:
                System.out.println("Такой операции нет!");
                acc(user);
        }
    }
    private static void checkInfo(Users user)
    {
        System.out.println("Основной счет: " + user.getSum() + " рублей");
        System.out.println("Кредитный счет: " + user.getCredit() + " рублей");
        System.out.println("Вклад: " + user.getVklad() + " рублей");
        acc(user);
    }
    private static void checkCard(Users user)
    {
        System.out.println("Номер карты: " + user.getCardnumber());
        System.out.println("Срок действия: " + user.getGodnost());
        System.out.println("cvv: " + user.getCvv());
        acc(user);
    }
    private static void checkhist(Users user)
    {
        System.out.println("История пополнений: " + user.getHispop() + " рублей");
        System.out.println("История расходов: " + user.getHisperevodov() + " рублей");
        int raz = user.getHispop() - user.getHisperevodov();
        System.out.println("Разница: " + raz + " рублей");
        acc(user);
    }
}
