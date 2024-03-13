package src;

import src.interfaces.Fuel;
import src.interfaces.MovementType;
import src.interfaces.Weapon;

public class Bot {

	private final Fuel fuel;
	private final Weapon weapon;
	private final MovementType movementType;

	public Bot(Fuel fuel, Weapon weapon, MovementType movementType)
	{
		this.fuel = fuel;
		this.weapon = weapon;
		this.movementType = movementType;
	}

	public String getDescription() {
		return "The Bot is constitued by " + movementType.getDescription() + ", " + weapon.getDescription() + " and is functiuning with " + fuel.getDescription();
	}
}
