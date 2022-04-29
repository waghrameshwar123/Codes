package com;

public class BankAccount {
    int accNo;
    String custName;
    String accType;
    double balance;
   
   
   
    public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is low :"+balance);
        }
        }
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }//end setter and getter

    public BankAccount() {
       
        this.accNo = 50100;
        this.custName = "Ram";
        this.accType = "Saving";
        this.balance = 50000;
    }
   
   
    public BankAccount(int account_number, String name, String account_type,
            double balance) {
       
        this.accNo = account_number;
        this.custName = name;
        this.accType = account_type;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negative Amount can't be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("YOU CAN'T WITHDRAW AMOUNT");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(-2000);
        bankAccount.display();
        bankAccount.withdraw(500);
        bankAccount.display();
        bankAccount.withdraw(5000);
        bankAccount.getBalance();
        bankAccount.display();

	}

}
