package BankingManagement;

import java.util.Scanner;

public class Account {
    String fullName,stk,phoneNumber,address;
    int money;

    public Account() {
    }

    public Account(String fullName, String stk, String phoneNumber, String address, int money) {
        this.fullName = fullName;
        this.stk = stk;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.money = money;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "fullName='" + fullName + '\'' +
                ", stk='" + stk + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("FUllNAME:");
        fullName = scan.nextLine();
        System.out.println("STK");
        stk = scan.nextLine();
        System.out.println("PHONE:");
        phoneNumber = scan.nextLine();
        System.out.println("ADDRESS:");
        address = scan.nextLine();

        money = 0;





    }


}
