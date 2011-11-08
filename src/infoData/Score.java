package infoData;

import players.Player;

public class Score {

	private Player player;
	private int points;
	
	public Score(Player player) {
		this.player = player;
		this.points = 0;
	}
	
	/**
	 * computes the score of this player by counting the point value
	 * of each card in his hand. If the player has no cards then he 
	 * is this turn's winner and thus receives 0 points for this turn.
	 */
	public void computeScore() {
		//LinkedList<Card> hand =  player.getHand();
		
		//for(Card c : hand)
			//this.points += c.getPointValue();

	}
}
