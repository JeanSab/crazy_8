package ia;

import players.Player;
import cards.Card;


public abstract class IaStrat {

	private Player player;
	
	public IaStrat(Player p) {
		player = p;
	}
	
	public abstract Card chooseCardToPlay();
}
