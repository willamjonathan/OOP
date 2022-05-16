public class Account {
    //- is private + is public
    private Double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public Double getBalance(){
        return balance;
    }
    public Boolean deposit(int amt){
        if(amt>0.0){
            this.balance += amt;
            return true;
        }
        return false;
    }
    public Boolean withdraw(int amt){
        if(this.balance>=amt){
            this.balance -= amt;
            return true;
        }
    return false;
    }
}
