package com.nt.bank;

public class BankAccount {
	public static final double MIN_BAL=5000;
	private final long accNo;
	private String accHName;
	private double balance;
	private String email;
	private long mobNo;
	
	//create bankAccount Constructor to initilize accno,acchname and balance 
	public BankAccount(long accNo,String accHName, double balance)
			throws IllegalArgumentException {
		if(accNo<=0) {
			throw new IllegalArgumentException (
					"accNum must be a +ve number");
			}
		if(balance<MIN_BAL) {
			throw new IllegalArgumentException(
					"balance must be >="+MIN_BAL); 
		}
		this.accNo=accNo;
		this.accHName = accHName;
		this.balance = balance;
	}//constructor
	
	
	public long getAccNo() {
		return accNo;
	}//get AccNo
	
	
	//to receive other programmer(user) given value(AccHolderName) 
	public void setAccHName(String accHName) {
	       this.accHName=accHName;	
	}
	
	//to get/display given value(AccHolderName)   
	public String getAccHName() {
		return accHName;
	   }
	
	
	//to receive other programmer(user) given value(Mobile No) 
	public void setMobile(long mobNo) throws IllegalArgumentException{
		int digits=String.valueOf(mobNo).length();
		if(digits!=10) {
			throw new IllegalArgumentException("Mobile No must has 10 digits "); 
		}
		this.mobNo=mobNo;
	}
	
	//to get/display given value (Mobile No)
	public long getMobile() {
		return mobNo;
	}
	
	//to receive other programmer(user) given value(Mobile No) 
	public void setEmail(String email)throws IllegalArgumentException {
		int atIndex=email.indexOf('@');
		if(atIndex!=-1) {
			if(email.indexOf('.',atIndex+1)!=-1) {
				this.email=email;
				return;
			}
		}
		throw new IllegalArgumentException ("Invalid Email id");
	}
	
	//to get/display given value (Mobile No)
	public String getEmail() {
		return email;
	}
	
	//implement deposit method
	void deposit(double amt) throws IllegalArgumentException{
		if(amt<=0) {
			throw new IllegalArgumentException("amount must be a '+ve' number");
		}
		this.balance=this.balance+amt;
	}
	
	//implement withdraw method
	public void withdraw(double amt)throws IllegalArgumentException {
		if(amt<=0) {
			throw new IllegalArgumentException("amount must be a '+ve' number");
		}
		if(amt>balance) {
			throw new IllegalArgumentException("Insufficiant funds");
		}
		this.balance=this.balance-amt;
	}
	
	//calculate current balance 
	public double currentBal() {
		System.out.println("Current balance: "+balance);
		return balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accHName=" + accHName + ", balance=" + balance + ", email=" + email
				+ ", mobNo=" + mobNo + "]";
	}
	
	
	
		
	}//BankAcoount class close


