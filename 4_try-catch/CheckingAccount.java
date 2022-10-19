import java.io.*;

public class CheckingAccount {
    
    //Field
    private double balance; //口座残高
    private int number; //口座番号

    //Constractor
    public CheckingAccount(int number){
        this.number = number;
    }

    //Deposit method
    //入出金額(amount) 
    //【?】なんでamountはフィールドで宣言されていないのに普通に使えているの？→ioで受け取る変数だから？
    public void deposit(double amount){
        balance += amount;
    }

    //Withdraw method (doesn't work without enough money)
    //【?】書いてある通りにコード記述したと思うんだけど、なんで”InsufficientFundsException”が呼べないの？
    //【?】突然登場する"needs"は何者？
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance){  //if the account has enough money to withdrow
            balance -= amount;
        }else{                  //if the account has enough money to withdrow
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