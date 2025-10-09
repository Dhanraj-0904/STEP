class Account {
    String accNo;
    Account(String no){accNo=no;}
    public void process(){System.out.println("Generic account process for " + accNo);}
}
class Savings extends Account {
    Savings(String no){super(no);}
    public void process(){System.out.println("Savings account interest applied for " + accNo);}
}
class Checking extends Account {
    Checking(String no){super(no);}
    public void process(){System.out.println("Checking account overdraft checked for " + accNo);}
}
class Investment extends Account {
    Investment(String no){super(no);}
    public void process(){System.out.println("Investment portfolio managed for " + accNo);}
}
public class BankingSystem {

    public void calculateFee(int amount){System.out.println("Basic fee: " + amount*0.02);}
    public void calculateFee(int amount, boolean priority){System.out.println("Priority fee: " + (priority?amount*0.05:amount*0.02));}

    public static void main(String[] args) {
        Account[] accs = { new Savings("S123"), new Checking("C456"), new Investment("I789") };
        for(Account a: accs) a.process();  // overriding in action

        BankingSystem b = new BankingSystem();
        b.calculateFee(1000);
        b.calculateFee(2000,true);
    }
}
