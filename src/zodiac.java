import java.util.Scanner;
public class zodiac {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Ask user for birth year.
		System.out.print("Enter your birth year: ");
		//Create scanner variable for year.
		int year = input.nextInt();
		//Tell them the zodiac of the year they were born in
		System.out.print("You were born in the year of the: ");
		
		//Divide birth year by 12 and use the remainder.
		switch (year % 12){
		case 0: System.out.println("monkey"); break;
		case 1: System.out.println("rooster"); break;
		case 2: System.out.println("dog"); break;
		case 3: System.out.println("pig"); break;
		case 4: System.out.println("rat"); break;
		case 5: System.out.println("ox"); break;
		case 6: System.out.println("tiger"); break;
		case 7: System.out.println("rabbit"); break;
		case 8: System.out.println("dragon"); break;
		case 9: System.out.println("snake"); break;
		case 10: System.out.println("horse"); break;
		case 11: System.out.println("sheep"); break;
		}

	}

}
