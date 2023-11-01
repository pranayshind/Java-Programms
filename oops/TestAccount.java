//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  


package oops;

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float a_1) {
		acc_no = a;
		name = n;
		amount = a_1;
	}
	
    void deposite(float a_2) {
    	amount = amount + a_2;
    	System.out.println(a_2+" deposited");
    	
    }
    
    void withdraw(float a_3) {
    	if(amount<a_3) {
    		System.out.println("insufficient balance");
    	}
    	else {	
    	amount = amount - a_3;
    	System.out.println(a_3+" withdraw");
    }
    } 
    	
   void show_balance(){
	   System.out.println("balance is "+amount);
   }
   
   void display() {
	   System.out.println(acc_no+" "+name+" "+amount);
   }
}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account e1 = new Account();
		e1.insert(12355, "pranay", 10000);
		e1.display();
		e1.show_balance();
		e1.deposite(1000);
		e1.show_balance();
		e1.withdraw(5000);
		e1.show_balance();
		e1.display();
		
		
		
		

	}

}
