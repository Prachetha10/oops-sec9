package Operators;

public class AndXorOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int a = 12; 
		        int b = 5;  
		        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
		        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

		        System.out.println("\nBitwise AND (a & b): " + (a & b)); 
		        System.out.println("Bitwise OR  (a | b): " + (a | b)); 
		        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); 
		        System.out.println("Bitwise Complement (~a): " + (~a)); 
		        System.out.println("Bitwise Complement (~b): " + (~b)); 
		    }

}
