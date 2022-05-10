import java.util.Scanner;

public class favoriteSweets
	{

		public static void main(String[] args)
			{
				howManySweets();

			}

		public static void howManySweets()
			{
				System.out.println("How many favorite sweets do you have?");
				Scanner userIntInput = new Scanner(System.in);
				int numberOfSweets = userIntInput.nextInt();
				String[] sweets = new String[numberOfSweets];
				
				for(int i=0; i<sweets.length; i++) 
					{
						System.out.println("What is the name of the sweet?");
						Scanner userSweetInput = new Scanner(System.in);
						String sweetName = userSweetInput.nextLine();
						sweets[i] = sweetName;
						
					}
				System.out.println();
				System.out.println();
				System.out.println("Your favorite sweets are: ");
				
				for(int i=0; i<sweets.length; i++) 
					{
						System.out.println(sweets[i]);
					}
			}


	}
