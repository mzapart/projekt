package pl.jhard.creditcard;



public class CreditCard {
    private double limit;
    private boolean isblock=false;
    private double balance;
    
    public double getBallance() {
         return limit;
    }   
    public void assignLimit(double money) {
        this.limit=money;
        this.balance = money;
    }
    public void block(){
        this.isblock=true;
    }
    public boolean isBlocked(){
        return isblock;
    }
    public void withdraw(double money){
        this.balance=balance-money;
    }
    
    public double getBalance2XD(){
        return balance;
    }
    public void repay(double money) {
        if(balance >= money) {
            this.limit = limit - money;
            balance = balance - money;
        }
    } 
}