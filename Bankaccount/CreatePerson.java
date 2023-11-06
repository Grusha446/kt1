package Bankaccount;
import java.util.Scanner;
public class CreatePerson {
    public static void create() {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в систему нашего банка!\n" +
                "Чтобы пользоваться услугами, необходимо зарегестрироваться!");
        System.out.println("Введите свое имя");
        String name = in.next();
        System.out.println("Введите свой возраст");
        int age = in.nextInt();
        System.out.println("Введите свой логин");
        String login = in.next();
        System.out.println("Введите свой пароль");
        String pasword = in.next();
        Client newClient = new Client(name, age, login, pasword);
        newClient.setName(name);
        newClient.setAge(age);
        newClient.setPassword(pasword);
        newClient.setLogin(login);
        if (newClient instanceof Client) {
            System.out.println("Спасибо, что выбрали наш банк! " + name);
            System.out.println("В течении 24 часов мы рассмотрим вашу заявку.");
        } else {
            System.out.println("Ошибка, попробуйте еще раз!");
        }
    }
}
abstract class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
}
class Client extends Person{
    private String login;
    private String password;
    public Client(String name, int age, String pasword, String login)
    {
        super(name, age);
        this.login = login;
        this.password = pasword;
    }
    public void setLogin(String login){this.login = login;}
    public void setPassword(String password){this.password = password;}
}