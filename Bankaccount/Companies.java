package Bankaccount;
public enum Companies {
    Apple(16200), Tesla(18400), Yandex(2600), Gazprom(820), Lykoil(7200);
    private int price;
    Companies(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}