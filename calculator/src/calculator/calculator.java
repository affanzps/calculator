package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
float a;
float b;
char operation;

Scanner keyboard =new Scanner(System.in);
System.out.println("Enter first number");
a =keyboard.nextFloat();

System.out.println("Enter Second number");
b =keyboard.nextFloat();

System.out.println("Enter the opertation :");
operation =keyboard.next().charAt(0);

System.out.println(a+" "+ operation +" " +b +" =");

keyboard.close();

switch(operation) {

case'+':
	add(a,b);
	break;
	
case'-':
	subtract(a,b);
	break;
	
case'/':
	divide(a,b);
	break;
	
case'*':
	multiply(a,b);
	break;
	


}
	
	}

	private static void multiply(float a, float b) {
		// TODO Auto-generated method stub
		float c=a*b;
		System.out.println(a+"*"+ b +"="+c );
		
	}

	private static void divide(float a, float b) {
		// TODO Auto-generated method stub
		float c=a/b;
		System.out.println(a+"*"+ b +"="+c );
	}

	private static void subtract(float a, float b) {
		
		// TODO Auto-generated method stub
		float c=a-b;
		System.out.println(a+"*"+ b +"="+c );
	}

	private static void add(float a, float b) {
		// TODO Auto-generated method stub
		float c=a+b;
		System.out.println(a+"*"+ b +"="+c );
	}

}