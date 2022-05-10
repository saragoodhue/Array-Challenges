import java.util.Scanner;
public class fourDigitNumber
	{

		public static void main(String[] args)
			{
				fourDigitNumbers();

			}
		public static void fourDigitNumbers()
			{
				int [] digits = new int[4];
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Enter a four-digit number");
				int number = userIntInput.nextInt();

				for(int i = 0; i < digits.length; i++)
					{
						digits [i] = number % 10;
						number = number / 10;
					}
				
				for(int reverse : digits) {
					System.out.println(reverse);
				}
			}
	}
