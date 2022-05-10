import java.util.Scanner;

public class oddAndEvenNumbers
	{

		public static void main(String[] args)
			{
				eightNumbers();
			}
		public static void eightNumbers()
			{
				int evenSum = 0;
				int oddSum = 0;
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Enter eight numbers");	
				int [] orderNumber = new int [8];
				
				for(int i = 0; i < orderNumber.length; i++)
					{
						int numbers = userIntInput.nextInt();						
						orderNumber [i] = numbers;
							
							if (orderNumber [i] % 2 == 0) 
								{
									 evenSum = evenSum + orderNumber [i];
								}
							else
								{
									oddSum = oddSum + orderNumber [i];
								}
					}
				
				System.out.println("The sum of the even numbers is " + evenSum);
				System.out.println("The sum of the odd numbers is " + oddSum);
				
			}
		
	}
