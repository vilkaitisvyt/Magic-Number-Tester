package lt.vilkaitisvyt;

import java.util.Scanner;

public class MagicNumberTester {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int originalInput = 0;
		String originalInputString = null;
		String numberHolder = null;
		boolean magic = false;
		int number = 0;
		
		
		System.out.print("> Input a number: ");
		
		try {
			
			originalInput = reader.nextInt();
		
			originalInputString = Integer.toString(originalInput);
		
			if (originalInput > 0 && originalInput <= 2147483647) {
			
				numberHolder = (originalInputString.concat(originalInputString));
			
			} else if (originalInput < 0 && originalInput >= -2147483648) {
			
				originalInput = originalInput * -1;
			
				originalInputString = Integer.toString(originalInput);
			
				numberHolder = (originalInputString.concat(originalInputString));
			
			} else {
			
				System.out.println("Please enter valid integer that is also not zero");
				return;
			}
		
			for(int i = 1; i < originalInputString.length(); i++) {
			
				number = Integer.parseInt(numberHolder.substring(i, i + originalInputString.length()));
			
				if (number % originalInput != 0) {
					
					magic = false;
					break;
					
				} else {
					
					magic = true;
				}
			}
			
			if (magic) {
				
				System.out.println("> It's magic!");
				
			} else {
				
				System.out.println("> It's not magic!");
				
			}
			
		} catch(Exception e) {
			
			System.out.println("Invalid input");
			e.printStackTrace();			
		}
		
		reader.close();
	}
}
