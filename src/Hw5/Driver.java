package Hw5;

public class Driver {
	public static void main(String[] args) 
	{
		Data item1 = new Data("Dark Seal", 350, 140, 15, 0, 40, "AP Stacks");
		item1.display();
		
		Data item2 = new Data("Doran's Ring", 400, 160, 15, 0, 70, "Mana for Minion Kills" );
		item2.display();
		
		Data item3 = new Data("Tear of the Goddess", 400, 280, 0, 240, 0, "Dmg to Minions \n	 and Max mana gain");
		item3.display();


	}

}
