class Bank{
    int accountNumber;
    double balance;
    String name;
    
    Bank(int a, double b, String n){
        accountNumber = a;
        balance = b;
        name = n;
    }
    
    double getBalance(){
        return balance;
    }
    
    void deposit(double amount){
        System.out.println("You have deposited : " + amount);
        balance += amount;
    }
    
    boolean withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            return true;
        }else{
            return false;
        }
    }
}

public class Atm{
    public static void main(String[] args){
        Bank a = new Bank(1234,50000,"Saharsha");
        System.out.println(a.getBalance());
        a.deposit(200);
        if(a.withdraw(200) == true){
            System.out.println("You're rich");
        } else{
            System.out.println("You're poor");
        }
    }
}