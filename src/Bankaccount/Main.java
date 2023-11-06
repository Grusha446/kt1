package Bankaccount;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Здраствуйте, у вас уже есть аккаунт?\n" +
                "1-Да, 0 - нет");
        int a1 = in.nextInt();
        if (a1 == 1){
            System.out.println("Добро пожаловать!\n" +
                    "Введите логин:");
            String login = in.next();
            Users user = Users.valueOf(login);
            registration(user);
            System.out.println("Добро пожаловать в систему! " + user);
            int sum = user.getSum();
            operations(user);
        }
        else
        {
            CreatePerson.create();
        }
    }
    public static void operations(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию\n" +
                "1-Пополнение счета\n" +
                "2-Перевести деньги\n" +
                "3-Инвестиции\n" +
                "4-Оплата счета\n" +
                "5-Связь с баноком\n" +
                "6-Кредиты\n" +
                "7-Вклады\n" +
                "8-Информация про аккаунт\n" +
                "9-Выйти из банка");
        int b = in.nextInt();
        switch (b){
            case 1:
                Operacii.popolnenye(user);
                break;
            case 2:
                Operacii.transfer(user);
                break;
            case 3:
                Investitions.investitions(user);
                break;
            case 4:
                Operacii.paymentzkh(user);
                break;
            case 5:
                support.support(user);
                break;
            case 6:
                Credit.credit(user);
                break;
            case 7:
                Vklad.vklad(user);
                break;
            case 8:
                Acc.acc(user);
                break;
            case 9:
                System.exit(1);
            default:
                System.out.println("Такой операции нет!");
                break;
        }
    }
    private static void registration(Users user){
        Scanner in = new Scanner(System.in);
        String password = user.getPassword();
        System.out.println("Введите пароль:");
        String pas = in.next();
        if(pas.equals(password)){
            System.out.println("Вход в систему");
        }
        else{
            System.out.println("пароль введен неправильно");
            registration(user);
        }
    }
}

