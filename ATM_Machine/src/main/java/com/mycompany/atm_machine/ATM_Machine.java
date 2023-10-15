/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm_machine;
import java.util.*;

/**
 *
 * @author Prince
 */
class ATM{
    float balance;
    int pin = 8976;
     Scanner in = new Scanner(System.in);
    public void checkPin(){
       System.out.print("Enter PIN:");
       int p = in.nextInt();
       if(p == pin){
           menu();
    }
       else{
           System.out.println("PIN is Incorrect!");               
       }}
    
    public void menu(){
        System.out.println("\nSelect Operation you want to perform:");
        System.out.println("1.Check Account Balance\n2.Withdraw Money\n3.Deposit Money\n4.Exit");
        int opt = in.nextInt();
        
        switch (opt){
        
            case 1 -> {checkAccountB();
                      break;}
            case 2 -> {withDraw();
                      break;}
            case 3 ->{deposit();
                      break;}
            case 4 ->{break;}
            
            default -> System.out.println("Enter valid choice!!");                      
        }     
    }
    
    public void checkAccountB(){
        System.out.println("Current Balance:"+ balance);
        menu();
    }
    
    public void withDraw(){
        System.out.println("Enter amount:");
        int Enteramt = in.nextInt();
       
        if(Enteramt <= balance){
            balance -=Enteramt;
            System.out.println("Withdrawl Successful");
    }
        else System.out.println("Not sufficient Balance in Account!!");  
        menu();
}
    public void deposit(){
        System.out.println("Enter amount to be Deposit");
        int depamt = in.nextInt();
        balance += depamt;
        System.out.println("Amount Added successfully");
        menu();
    }
    }

public class ATM_Machine {
        public static void main(String args[]){
        ATM obj = new ATM();
        obj.balance = 3000;
        obj.checkPin();
        }
   
}