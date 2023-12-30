import java.util.Random;
public class Randomnumbergenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Random random = new Random();
	
	int RandomNumber1 = random.nextInt(10);
	int RandomNumber2 = random.nextInt(10);
	int RandomNumber3 = random.nextInt(10);
	{
		System.out.println("Random number between 1-10: " + RandomNumber1);
		System.out.println("Random number between 1-10: " + RandomNumber2);
		System.out.println("Random number between 1-10: " + RandomNumber3);
		
	}
		if (RandomNumber1 == 7 || RandomNumber2 == 7 || RandomNumber3 == 7)
		{
		System.out.println("You win");
		}
		
		else
		{	
		
		System.out.println("You lose");
		}
		
		for (int counter =5 ; counter > 0 ; counter--)
		{
			System.out.println(counter-1 + "-1e");
		}
		{

			int counter = 0;
			
			while (counter < 1)
			{
				System.out.println(counter);
				counter--;
			}
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
}}
