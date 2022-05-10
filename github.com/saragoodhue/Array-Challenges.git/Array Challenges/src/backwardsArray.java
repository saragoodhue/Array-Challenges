
public class backwardsArray
	{

		public static void main(String[] args)
			{
				arrayNumbers();

			}

		public static void arrayNumbers()
		{			
			int [] number = new int [5];
			
			for(int i = number.length - 1; i >= 0; i--)		
				{
					number[i] = (int) (Math.random() * 90) + 10;	
					System.out.println(number[i]);
					
				}
			System.out.println();
			
			for(int n: number)
				{
					System.out.println(n);
				}
			
		}
	}
