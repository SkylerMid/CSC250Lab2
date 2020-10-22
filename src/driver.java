import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/GolfBag"));

		int four = 0; // What do they yell if they could hit someone?
		
		while(input.hasNext()) 
		{
			four++;
			input.nextLine();
		}
		GolfClub[] mat = new GolfClub[four];
		input.close();
		input = new Scanner(new File(System.getProperty("user.dir") + "/src/GolfBag"));
		int pos = 0;
		while(input.hasNext())
		{
			mat[pos] = new GolfClub(input.nextLine(), pos);
			mat[pos].display();
			pos++;
		}
		input.close();
}
}