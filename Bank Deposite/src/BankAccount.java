public class BankAccount implements BankAccountSpecification {
    private int balance;
    public BankAccount(){
        balance = 0;
    }
    @Override
    public void deposit(int amount){
        if(amount > 0) balance += amount;
    }
    @Override
    public boolean withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
    public String toString(){
        return balance + "";
    }
}