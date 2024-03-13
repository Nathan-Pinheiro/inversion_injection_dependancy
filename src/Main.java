package src;
import java.util.Scanner;

import src.fuel.Biogaz;
import src.fuel.Electricity;
import src.fuel.Gazoline;
import src.interfaces.Fuel;
import src.interfaces.MovementType;
import src.interfaces.Weapon;
import src.movementTypes.FourLegMovement;
import src.movementTypes.Track;
import src.movementTypes.TwoLegMovement;
import src.movementTypes.Wheels;
import src.weapons.Blade;
import src.Bot;

public class Main {

	private static final String THIS_CHOICE_IS_IMPOSSIBLE = "This choice is impossible";

	public static void main(String[] args)
	{
		int choice;
		Scanner scanner = new Scanner(System.in);

		Fuel fuel;
		Weapon weapon;
		MovementType movementType;

		System.out.println("Welcome in the bot workshop");
		System.out.println("Here you can personalize your bot");
		System.out.println("Do you want to continue ? (type y to continue)");

		scanner.next();

		do
		{
			System.out.println("Start by choosing the movement type :");
			System.out.println("1 - Weels");
			System.out.println("2 - Track");
			System.out.println("3 - 2 legs");
			System.out.println("4 - 4 legs");
			choice = scanner.nextInt();
		}
		while (choice < 0 || choice > 4);
		
		switch (choice) {
			case 1 :
				movementType = new Wheels();
				break;
			case 2 :
				movementType = new Track();
				break;
			case 3 :
				movementType = new TwoLegMovement();
				break;
			case 4 :
				movementType = new FourLegMovement();
				break;
			default :
				scanner.close();
				throw new IllegalArgumentException(THIS_CHOICE_IS_IMPOSSIBLE);
		}

		do
		{
			System.out.println("Now, choose the fuel :");
			System.out.println("1 - Electricity");
			System.out.println("2 - Gazoline");
			System.out.println("3 - Biogaz");
			choice = scanner.nextInt();
		}
		while (choice < 0 || choice > 3);

		switch (choice) {
			case 1 :
				fuel = new Electricity();
				break;
			case 2 :
				fuel = new Gazoline();
				break;
			case 3 :
				fuel = new Biogaz();
				break;
			default :
				scanner.close();
				throw new IllegalArgumentException(THIS_CHOICE_IS_IMPOSSIBLE);
		}

		do
		{
			System.out.println("To finish, choose the weapons :");
			System.out.println("1 - Laser gun");
			System.out.println("2 - Rocket launcher");
			System.out.println("3 - Blades");
			System.out.println("4 - Grenades");
			choice = scanner.nextInt();
		}
		while (choice < 0 || choice > 4);

		switch (choice) {
			case 1 :
				weapon = new Blade();
				break;
			case 2 :
				weapon = new Blade();
				break;
			case 3 :
				weapon = new Blade();
				break;
			case 4 :
				weapon = new Blade();
				break;
			default :
				scanner.close();
				throw new IllegalArgumentException(THIS_CHOICE_IS_IMPOSSIBLE);
		}

		scanner.close();

		Bot bot = new Bot(fuel, weapon, movementType);
		System.out.println(bot.getDescription());
	}

}
