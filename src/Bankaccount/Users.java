package Bankaccount;
public enum Users {
    Grusha("qwerty12345", 15000000, 0, 1500, 644234532, 600000, 1000000,321, "03/25"),
    Chelovek("parolll", 1000, 15000, 500, 532123453, 100000, 120000, 863, "07/26");
    private String password;
    private int sum;
    private int credit;
    private int vklad;
    private long cardnumber;
    private int hispop;
    private int hisperevodov;
    private int cvv;
    private String godnost;
    Users(String password, int sum, int credit, int vklad, long cardnumber, int hispop, int hisperevodov, int cvv, String godnost){
        this.password = password;
        this.sum = sum;
        this.credit = credit;
        this.vklad = vklad;
        this.cardnumber = cardnumber;
        this.hispop = hispop;
        this.hisperevodov= hisperevodov;
        this.cvv = cvv;
        this.godnost = godnost;
    }
    public String getPassword(){
        return password;
    }
    public int getVklad(){return vklad;}
    public long getCardnumber(){return cardnumber;}
    public void setVklad(int vklad){this.vklad=vklad;}
    public int getCredit(){return credit;}
    public void setCredit(int credit){this.credit=credit;}
    public int getSum(){
        return sum;
    }
    public void setSum(int sum){this.sum = sum;}
    public int getHispop(){
        return hispop;
    }
    public void setHispop(int hispop){this.hispop = hispop;}
    public int getHisperevodov(){
        return hisperevodov;
    }
    public void setHisperevodov(int hisperevodov){this.hisperevodov = hisperevodov;}
    public int getCvv(){return cvv;}
    public String getGodnost(){return godnost;}

    }