package Boxing.Program;

public class AllDataTypes {

	private static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				       
				double d = 19.99;               
				char c = 'A';                  
				boolean flag = true;             
				int[] numbers = {1, 2, 3};      
				Object obj = new Object();     

				
			
				System.out.println("double: " + d);
				System.out.println("char: " + c);
				System.out.println("boolean: " + flag);
				System.out.println("String: " + str);
				System.out.print("Array: ");
				for (int num : numbers) {
					System.out.print(num + " ");
				}
				
			
			}
	

	}

