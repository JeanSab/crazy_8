package players;

import ia.IaStrat;
import cards.Card;

public class IAPlayer extends Player{
	
	private IaStrat strat;
	
	public IAPlayer(String name, IaStrat strat) {
		super(name);
		this.strat = strat;
	}


	public void playCard() {
		
		Card c = strat.chooseCardToPlay();
		//
	}

}
