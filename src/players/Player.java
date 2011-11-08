package players;

import infoData.Rank;
import infoData.Score;
import java.util.LinkedList;
import cards.Card;

/**
 * @author jean
 * 
 */
public abstract class Player {
	
	private String name;
	private LinkedList<Card> hand;///list of cards belonging to this player
	private Score score;
	private Rank rank;
	//private Game game;
	
	
	public Player(String name) {
		this.name = name;
		//this score = new Score(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Enables a player to play a card from his hand
	 */
	public abstract void playCard();
	
	/**
	 * enables a player to pick a given number of cards from
	 * the standard stack of cards.
	 * @param number
	 */
	public void pickCardFromStack(int number) {
			
		//game.getDeck().pick(number);
	}
	
	/**
	 * return this player's hand
	 * @return the linkedList of cards belonging to a player
	 */
	public LinkedList<Card> getHand() {
		return hand;
	}
}
