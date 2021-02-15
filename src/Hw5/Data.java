package Hw5;

public class Data {

	private String name;
	private int gold;
	private int sell;
	private int mana;
	private int ap;
	private int health;
	private String passive;

	
	public Data(String name, int gold, int sell, int ap, int mana, int health, String passive)
	{
		this.name = name;
		this.gold = gold;
		this.sell = sell;
		this.ap = ap;
		this.mana = mana;
		this.health = health;	
		this.passive = passive;
	}
	
	public void display()
	{System.out.format("Name: %s \nGold cost: %d		Sell Price: %d \nAttack Power: %d	Mana: %d \nHealth: %d \nPassive: %s \n \n", this.name, this.gold, this.sell,this.ap, this.mana, this.health, this.passive);}

}


