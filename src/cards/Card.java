package cards;


public class Card {

	public String name;
	public int value;
	public String color, type;
	
	public Card(String nom, int val, String coul, String type){
		name = nom;
		value = val;
		color = coul;
		this.type = type;
	}
	
	public void action(){
		
	}
}
