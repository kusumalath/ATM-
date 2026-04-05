class ATM {
    int userName;
    int password;
    int balance = 10000;
    
    void deposit(int amount) {
        balance += amount;
        System.out.println("deposit: " + amount);
    }
    
    void withDraw(int amount) {
        if (amount <= balance) {
        balance -= amount;
        System.out.println("withdraw: " + amount);
        } else {
        System.out.println("insufficient balance");
    }
}
    
    
    
    void checkBalance() {
        System.out.println("checkBalance: " + balance);
    }
}
    

public class Main {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.deposit(500);
        a.withDraw(200);
        a.checkBalance();
    }
}