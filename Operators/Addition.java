package Operators;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter two numbers: ");
		        double a = sc.nextDouble(), b = sc.nextDouble();

		        System.out.println("Add: " + (a + b));
		        System.out.println("Sub: " + (a - b));
		        System.out.println("Mul: " + (a * b));
		        System.out.println("Div: " + (b != 0 ? (a / b) : "Undefined"));
		        System.out.println("Mod: " + (b != 0 ? (a % b) : "Undefined"));

		        sc.close();
		    }
		
}
