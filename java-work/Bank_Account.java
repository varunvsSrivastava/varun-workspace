import java.util.Scanner;


public class Bank_Account {
	//	instance variables
	static double balance;
	double initial_deposit;
	String account_name;
	String account_type;
	String transaction_type;
	static int total_no_of_account;
//	demostrating multiple constructor for different use cases
	Bank_Account(String account_name)	{
		this.account_name=account_name;
		account_type="saving";
		balance=0.0;
		total_no_of_account++;
	}
	Bank_Account(String account_name, double initial_deposit){
		this.account_name=account_name;
		this.initial_deposit=initial_deposit;
		total_no_of_account++;
	}
	Bank_Account(String account_name, double initial_deposit, String account_type){
		this.account_name=account_name;
		this.initial_deposit=initial_deposit;
		this.account_type=account_type;
		total_no_of_account++;
	}
	
	static void deposit(double initial_deposit) {
		//double balance=0.0;
		System.out.println("Balance before deposit: "+balance);
		balance=balance+initial_deposit;
		System.out.println("Balance after deposit: "+balance);
	}
	static void deposit(double initial_deposit, String transaction_type) {
		if(transaction_type=="cash") {
			System.out.println("Balance before deposit: "+balance);
			balance=balance+initial_deposit;
			System.out.println("Balance after deposit: "+balance);
		}
		else {
			System.out.println("Balance before deposit: "+balance);
			balance=balance+initial_deposit;
			System.out.println("Balance after deposit: "+balance);
		}
	}
	
	static void display() {
		System.out.println("Total nunber of account created: "+total_no_of_account);
	}
	
	public static void main(String arg[]) {
		double initial_deposit=0.0;
		String account_name;
		String account_type;
		String transaction_type;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your account name: ");
		account_name=sc.next();
		System.out.print("Enter account_type: ");
		account_type=sc.next();
		System.out.print("Please enter your transaction type Cash/Cheque: ");
		transaction_type=sc.next();
		if(transaction_type.equalsIgnoreCase("cash")) {
			System.out.print("Enter amount you want to deposit: ");
			initial_deposit=sc.nextInt();
//			deposit(initial_deposit,transaction_type);
		}
		else if(transaction_type.equalsIgnoreCase("cheque")	){
			System.out.println("Enter your cheque detial: ");
			System.out.print("Enter your cheque number: ");
			int cheque_no=sc.nextInt();
			System.out.print("Enter amount you want to deposit through cheque: ");
			initial_deposit=sc.nextDouble();
			System.out.print("Enter date of issue DD/MM/YYYY format: ");
			int DOB=sc.nextInt();
			System.out.println("|Cheque number: "+cheque_no+"|Initial deposit: "+initial_deposit+"|Date of Issue: "+DOB);
//			deposit(initial_deposit,transaction_type);
		}
		else {
			System.out.println("Invalid input");
		}
		
		Bank_Account bnk_acc=new Bank_Account(account_name);
		Bank_Account bnk_acc_TwoPara=new Bank_Account(account_name, initial_deposit);
		Bank_Account bnk_acc_ThreePara=new Bank_Account(account_name, initial_deposit, account_type);
		deposit(initial_deposit);
		deposit(initial_deposit,transaction_type);
		System.out.println("1st Account");
		System.out.println("Account Name: "+bnk_acc.account_name);
		System.out.println("2nd Account");
		System.out.println("Account Name: "+bnk_acc_TwoPara.account_name);
		System.out.println("Initial deposit: "+bnk_acc_TwoPara.initial_deposit);
		System.out.println("3rd Account");
		System.out.println("Account Name: "+bnk_acc_ThreePara.account_name);
		System.out.println("Initial Deposit: "+bnk_acc_ThreePara.initial_deposit);
		System.out.println("Transaction Type: "+transaction_type);
		display();
		sc.close();
	}

}
