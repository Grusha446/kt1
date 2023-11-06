package Bankaccount;
import java.util.Scanner;
public class Operacii {
    public static void popolnenye(Users user){
        Scanner in = new Scanner(System.in);
        System.out.println("Баланс вашего счета составляет:" + user.getSum() + " рублей!\n" +
                "Введите сумму пополнения:");
        int a = in.nextInt();
        int summa = user.getSum() + a;
        user.setSum(summa);
        System.out.println("Баланс пополнен на: " + a + " рублей\n" +
        "Итоговый баланс:" + user.getSum() + " рублей");
        user.setSum(summa);
        user.setHispop(user.getHispop() + a);
        Main.operations(user);
    }
    public static void paymentzkh(Users user)
    {
        int summa = user.getSum();
        Scanner in = new Scanner(System.in);
        System.out.println("Баланс вашего счета составляет:" + user.getSum() + " рублей!\n");
        System.out.println("Введите номер договора жкх");
        int number = in.nextInt();
        System.out.println("Введите сумму оплаты");
        int sum = in.nextInt();
        if(sum > summa){
            errormessage();
            Main.operations(user);
        }
        else if(sum <= 0){
            minsum();
            Main.operations(user);
        }
        else
        {
            perevod(user, sum);
        }
    }
    public static void transfer(Users user){
        int summa = user.getSum();
        Scanner in = new Scanner(System.in);
        System.out.println("Баланс вашего счета составляет:" + summa + " рублей!\n" +
                "Введите сумму перевода:");
        int a = in.nextInt();
        if(a > summa){
            errormessage();
            Main.operations(user);
        }
        else if(a <= 0){
            minsum();
            Main.operations(user);
        }
        else{
            perevod(user, a);
        }
    }
    private static void perevod(Users user, int a){
        int summ = user.getSum() - a;
        user.setSum(summ);
        System.out.println("Перевод выполнен: " + a + " рублей!\n" +
                "Итоговый баланс:" + user.getSum() + " рублей");
        user.setHisperevodov(user.getHisperevodov() + a);
        Main.operations(user);
    }
    public static void errormessage()
    {
        System.out.println("На карте не хватает денег!");
    }
    public static void minsum(){
        System.out.println("Минимальная сумма ввода - 1 рубль!");
    }
}
