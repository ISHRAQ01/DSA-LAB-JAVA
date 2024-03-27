package com.demo;

public class Account {
    private int acc_num;
    private int bal;
    public Account(int acc_num, int bal) {
        this.acc_num = acc_num;
        this.bal = bal;
    }
    public int getAcc_num() {
        return acc_num;
    }
    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }
    public int getBal() {
        return bal;
    }
    public void setBal(int bal) {
        this.bal = bal;
    }
    public String showDetail() {
        return "[Account No. = " + acc_num + ", balance =" + bal + "]";
    }
    // public String showDetail(){
    //      return "Account: "+this.acc_num+ ", Bal: "+this.bal;
    // }
    
}
    

