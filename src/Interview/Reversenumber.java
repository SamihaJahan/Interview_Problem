package Interview;

public class Reversenumber {


		/*
		 * Write a function that takes input as an integer number and returns the
		 * reverse of the integer. Input = 12547 Output = 74521
		 */
		public static void main(String[] args) {
			int number = 12547;
			
			int rev_number = reverse(number);
			System.out.println("The reverse number is " + rev_number);

		}
		public static int reverse(int number) 
		{
			int rev = 0;
			
			while (number != 0)
				
			{
				rev = rev * 10 + number % 10;   // 0 + 7; 70+4; 740+5; 7450+2; 74520 +1;
				number = number / 10;           // 1254; 125; 12; 1; 0;
			}
			return rev;
		}

		
		
		
	}


