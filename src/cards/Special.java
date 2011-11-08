package cards;


public abstract class Special extends Card{

	public Special(String nom, int val, String coul, String type){
		super(nom, val, coul, type);
	}
	public abstract void Action();
	
}
