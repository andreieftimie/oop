/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;

import java.util.Random;

/**
 *
 * @author alexb
 */
public class Account {
    
    public String owner = "";
    public String iban = "";
    public double balance = 0; //Double amount = 0.0; Integer x = -1;
    public String moneda = "";
    
    private String cnp = "";
    
    public static int AccountCounter = 0;
    
    public Account()
    {
        this.owner = "undefined owner";
        this.iban = "undefined iban";
        this.balance = 0;     
        this.cnp = "";
    }
    
    public Account(int initialBalance)
    {
        this.balance += initialBalance;
    }
    
    public Account(String owner, String moneda)
    {
        this.owner = owner;
        this.moneda = moneda;
    }
    
    public void credit(double amount)
    {
        this.balance = this.balance + amount;
        
        this.printNewBalance();
    }
    
    public void debit(double amount)
    {
        this.balance -= amount;
        
        this.printNewBalance();
    }
    
    public void openAccount(String owner, String moneda)
    {
        this.moneda = moneda;
        this.owner = owner;
        this.balance = 0;
        this.iban = ((Integer)new Random().nextInt()).toString();
        
        AccountCounter++;
    }
    
    public void openAccount(String owner, String moneda, double balance)
    {
        this.moneda = moneda;
        this.owner = owner;
        this.balance = balance;
        this.iban = ((Integer)new Random().nextInt()).toString();
        
        AccountCounter++;
    }
    
    private void printNewBalance()
    {
        System.out.println("New balance: " + this.balance);
    }
    
    public static void getMonthlyCommission(Account account)
    {
        account.debit(10);
    }
    
}
