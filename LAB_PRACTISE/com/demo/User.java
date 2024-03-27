package com.demo;

public class User {
    
    String name;
    Account acc;
    public User(String name, Account acc) {
        this.name = name;
        this.acc = acc;
    }
    public void AccDetails(){
        System.out.println("Hello Mr. "+ name );
        System.out.println(acc.showDetail()); 
    }
    public void debit(int amount){
        acc.setBal(acc.getBal() - amount);
        // logic to find bal and debit/message
        System.out.println(amount + "Rs debited");
        System.out.println("Updated Balance is "+acc.getBal());
    }
    public void deposit(int amount){
        // logic to deposit
        acc.setBal(acc.getBal()+amount );
        System.out.println("Updated Balance is "+acc.getBal());
    }
    
    public void showBal(){
        System.out.println("Your Balance is "+acc.getBal()); 
    }
}
    

