package infoQuerry;

import java.util.Scanner;
import players.HumanPlayer;
import cards.Card;

public class Console {

	private static Console instance;
	private static boolean set = false; 
	
	private Scanner sc;
	
	public Console() {
		
		this.sc = new Scanner(System.in);
	}
	
	
	/**
	 * Asks a player to choose a card from his hand on the standard
	 * output, and returns the chosen card.
	 * @param p the HumanPlayer to be questioned
	 * @return the chosen card
	 */
	public Card askPlayerCard(HumanPlayer p) {
		
		System.out.println("choose a card: ");
		
		int count = 1;
		for(Card c : p.getHand()) {
			System.out.println("" + count++ + c);
		}	
		count = sc.nextInt();
		
		return p.getHand().get(count - 1);
	}
	
	
	public static Console getInstance() {
		if(instance == null)
			instance = new Console();
		
		return Console.instance;
	}
}
