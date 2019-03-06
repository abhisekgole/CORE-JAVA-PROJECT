package com.nt.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		//all variable initilize hare 
		long accNo;
		String accHName;
		double balance;
		String email;
		long mobNo;
		double amt;
        Scanner scn =new Scanner(System.in);
        BankAccount acc1=null;
        
        //read input from user
       //set Account Details using keyboard
        while(true) {
        	try {
         System.out.println("Enter Account number:\t\t");
        accNo=scn.nextLong();scn.nextLine();
        
        System.out.println("Enter Account Holder name:\t\t\n");
        accHName=scn.nextLine();
        
        System.out.println("Enter Opening Balance:\t\t\n");
        balance=scn.nextDouble();
        
        acc1=new BankAccount(accNo,accHName,balance); 
        System.out.println("Customer Bank Details are: \t\t\n"+acc1);
        System.out.println("Customer Account Create Successfully but don't forget! attach MOBILE NO and EMAIL ID");
        scn.nextLine();   
        break;
	      }
        	
        	catch(InputMismatchException e) {
        		System.out.println("Don't allow character!only input Number type ");
        		scn.nextLine();

        		break;
        	  }
        	catch(IllegalArgumentException e) {
        		System.out.println(e.getMessage());
        		scn.nextLine();

        	  }
        	}//close While
        
        while(true) {
        	try {
        		System.out.println("Enter Customer Email Id: ");
        		email=scn.nextLine();
        		acc1.setEmail(email);
        		System.out.println("Email Id attachment Successfully ");
        		break;		
        	}//try
        	catch(IllegalArgumentException e) {
        		System.out.println(e.getMessage());
        		scn.nextLine();
        	  }
        	catch(InputMismatchException e) {
        		System.out.println("Don't allow character!only input Number type ");

        	  }
        }//close While
        
        
        while(true) {
        	try {
        		System.out.println("Enter Customer Mobile No: ");
        		mobNo=scn.nextLong();
        		acc1.setMobile(mobNo);
        		System.out.println("Mobile no attachment Successfully ");
        		System.out.println(acc1);
        	    break;
        	}//try
        	catch(IllegalArgumentException e) {
        		System.out.println(e.getMessage());
        		scn.nextLine();
        		}
        	catch(InputMismatchException e) {
        		System.out.println("Don't allow character!only input Number type ");

        	  }
        }//close While
        
        
		//processing the deposit method(-)
		while(true) { 
			try {
				System.out.println("Enter how much amount want to 'DEPOSIT'  ");
				amt=scn.nextDouble();
				acc1.deposit(amt);
				System.out.println("you entered "+amt+" rs for deposit");
			    System.out.println(acc1.currentBal());
				
				//System.out.println("Current balance: "+(balance+amt1));
				break;
		  }//try 
			catch(IllegalArgumentException e) {
        		System.out.println(e.getMessage());
        		scn.nextLine();
        		}
        	catch(InputMismatchException e) {
        		System.out.println("Don't use word type! enter digit only");

        	  }
		}//close while
		//processing the deposit method(-)
				while(true) { 
					try {
						System.out.println("Enter how much amount want to 'withdraw'\t");
						amt=scn.nextDouble();
						acc1.withdraw(amt);
						System.out.println("you entered "+amt+" rs for withdraw");
					    System.out.println(acc1.currentBal());
						
						//System.out.println("Current balance: "+(balance+amt1));
						break;
				  }//try 
					catch(IllegalArgumentException e) {
		        		System.out.println(e.getMessage());
		        		}
		        	catch(InputMismatchException e) {
		        		System.out.println("Don't use word type! enter digit only");
		        		scn.nextLine();
		        		}
				}//close while
				
				//close Scanner
					try {
						if(scn!=null)
							scn.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
		 	
	}//close main(-)

}//close Bank Class
