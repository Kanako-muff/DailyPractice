import java.io.*;
import java.lang.Object.*;

public class CheckingAccount {
    
    //Field
    private double balance;
    private int number;

    //Constractor
    public CheckingAccount(int number){
        this.number = number;
    }

    //Deposit method
    public void deposit(double amount){
        balance += amount;
    }

    //Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    //Getter method
    public double getBalanve(){
        return balance;
    }

    public int getNumber(){
        return number;
    }
}