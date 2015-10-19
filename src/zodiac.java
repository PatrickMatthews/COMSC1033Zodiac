import java.util.Scanner;
public class zodiac {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Ask user for birth year.
		System.out.print("Enter your birth year: ");
		int year = input.nextInt();
		System.out.print("Enter your birth month number ie 12 or 7: ");
		int month = input.nextInt();
		System.out.print("Enter your birth day: ");
		int day = input.nextInt();
		
		//Tell them the zodiac of the year they were born in
		System.out.print("You are an: ");
		
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
		
		switch (month % 12){
		case 1: System.out.println("monkey"); break;
		case 2: if (day < 20) {System.out.println("Aquarius"); break;}
		        else {System.out.println("Pisces"); break;} 
		case 3: System.out.println("dog"); break;
		case 4: System.out.println("pig"); break;
		case 5: System.out.println("rat"); break;
		case 6: System.out.println("ox"); break;
		case 7: System.out.println("tiger"); break;
		case 8: System.out.println("rabbit"); break;
		case 9: System.out.println("dragon"); break;
		case 10: System.out.println("snake"); break;
		case 11: System.out.println("horse"); break;
		case 12: System.out.println("sheep"); break;
		}
		
		switch (day % 12){
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
