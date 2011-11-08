package players;

import infoQuerry.Console;
import cards.Card;

public class HumanPlayer extends Player{

	public HumanPlayer(String name) {
		super(name);
	}

	public void playCard() {
		Card c = Console.getInstance().askPlayerCard(this);
		c.action();
	}

}
