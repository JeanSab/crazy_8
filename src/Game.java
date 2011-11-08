import infoQuerry.Console;
import java.util.LinkedList;
import players.Player;

//you just lost it
public class Game {

	private boolean state = true;
	//private Deck deck;
	//private DiscardPile dpile;
	private LinkedList<Player> players;
	private Console c = new Console();
	
	public void play() {
		
		for(Player p : players)
			p.playCard();
	}
}
