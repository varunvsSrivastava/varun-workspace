import java.util.*;
public class MenuDriven{
	double num1,num2;
	static double result;
	public MenuDriven(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
	}
	void add() {
		result=this.num1+this.num2;
	}
	void Subtract() {
		result=this.num1-this.num2;
	}
	void Multiply() {
		result=this.num1*this.num2;
	}
	void Divide() {
		if(this.num2!=0) {
			result=this.num1/this.num2;
		}
		else {
			System.out.println("false");
		}
	}
	public static void display() {
		System.out.println("Result: "+result);
	}
	public static void reset() {
		result=0.0;
		System.out.println("Result: "+result);
	}
	public static void exit() {
		exit();
	}
	public static void main(String args[]){
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		num1=sc.nextDouble();
		System.out.println("Enter your second number:");
		num2=sc.nextDouble();
		MenuDriven ob=new MenuDriven(num1,num2);
		int choice;
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Reset");
			System.out.println("Press 6 for Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Addtion of two numbers: ");
				ob.add();
				display();
				break;
			case 2:
				System.out.println("Subtraction of two numbers: ");
				ob.Subtract();
				display();
				break;
			case 3:
				System.out.println("Multiplication of two numbers: ");
				ob.Multiply();
				display();
				break;
			case 4:
				System.out.println("Division of two numbers: ");
				ob.Divide();
				display();
				break;
			case 5:
				reset();
				break;
			case 6:
				exit();
				break;
			default:
				System.out.println("Please check! there is no option");
			}
			sc.close();
		}
	}

