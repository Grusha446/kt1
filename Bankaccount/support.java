package Bankaccount;
import java.util.Scanner;
public class support {
    public static void support(Users user)
    {
        System.out.println("Здраствуйте "+ user);
        System.out.println("Вы попали на страницу тех.поддержки нашего банка.");
        System.out.println("Введите ваш вопрос (Вклад, Справка, Ошибка, Выписка)!");
        Scanner in = new Scanner(System.in);
        String trouble = in.next();
        switch (trouble)
        {
            case "Вклад":
                vklad(user);
                break;
            case "Справка":
                spravka(user);
                break;
            case "Ошибка":
                error(user);
                break;
            case "Выписка":
                vipiska(user);
                break;
            default:
                System.out.println("Позвоните нам на горячую линию!\n" +
                        "+78005553535");
                Main.operations(user);
                break;
        }
        System.out.println("Ваша жалоба была принята в работу!");
        Main.operations(user);
    }
   private static void vklad(Users user)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите ваш вопрос, связанный с вкладом");
       String quest = in.next();
       System.out.println("В скором времени мы с вами свяжемся!");
       Main.operations(user);
   }
    private static void spravka(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите справку, которая вам нужна");
        String quest = in.next();
        switch (quest)
        {
            case "Счёт":
                spravka schet = spravka.valueOf("Счёт");
                String scht = schet.getSrok();
                System.out.println("Ожидайте справку в течении: " + scht);
                Main.operations(user);
                break;
            case "Задолженность":
                spravka schet1 = spravka.valueOf("Задолженность");
                String scht1 = schet1.getSrok();
                System.out.println("Ожидайте справку в течении: " + scht1);
                Main.operations(user);
                break;
            case "Рефенансирование":
                spravka schet2 = spravka.valueOf("Рефенансирование");
                String scht2 = schet2.getSrok();
                System.out.println("Ожидайте справку в течении: " + scht2);
                Main.operations(user);
                break;
            default:
                System.out.println("Позвоните нам на горячую линию!\n" +
                        "+78005553535");
                Main.operations(user);
                break;
        }
    }
    private static void error(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш вопрос, связанный с ошибкой");
        String quest = in.next();
        System.out.println("В скором времени мы с вами свяжемся!");
        Main.operations(user);
    }
    private static void vipiska(Users user)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш вопрос, связанный с выпиской");
        String quest = in.next();
        System.out.println("В скором времени мы с вами свяжемся!");
        Main.operations(user);
    }
    enum spravka
    {
        Счёт("1 дня"), Задолженность("3 дней"), Рефенансирование("3 дней");

        private String srok;

        spravka(String srok)
        {
            this.srok = srok;
        }
        public String getSrok(){return srok;}
    }
   }

