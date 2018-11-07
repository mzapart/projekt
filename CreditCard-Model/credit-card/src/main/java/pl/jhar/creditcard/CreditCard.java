package pl.jhard.creditcard;



public class CreditCard {
    private double limit;
    private boolean isblock=false;
    public double getBallance() {
         return limit;
    }   
    public void assignLimit(double money) {
        this.limit=money;
    }
    public void block(){
        this.isblock=true;
    }
    public boolean isBlocked(){
        return isblock;
    }
    public void withdraw(double money){
        this.limit=limit-money;
    }
}