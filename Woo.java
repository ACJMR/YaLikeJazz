import java.util.ArrayList;
import cs1.Keyboard;

public class Woo{
    private ArrayList<Card> _deck; // Container of cards from which players draw from 
    private ArrayList<Card> _discardPile; // Container of cards already played 
    private ArrayList<Card>  _topCard; // Container for card 
    private ArrayList<Player> _turnOrder; // _turnOrder
    private Player _currentPlayer; 

    public Woo(){
	_deck = new ArrayList<Card>();
	_turnOrder = new ArrayList<Player>();
	_topCard = new ArrayList<Card>();
	_discardPile = new ArrayList<Card>();
    }
 
    public void setup(){
	Card Zero0 = new Zero(0);
	_deck.add(Zero0);
	Card Zero1 = new Zero(1);
	_deck.add(Zero1);
	Card Zero2 = new Zero(2);
	_deck.add(Zero2);
	Card Zero3 = new Zero(3);
	_deck.add(Zero3);
  
	Card One0A = new One(0);
	_deck.add(One0A);
	Card One1A = new One(1);
	_deck.add(One1A);
	Card One2A = new One(2);
	_deck.add(One2A);
	Card One3A = new One(3);
	_deck.add(One3A);
	
	Card One0B = new One(0);
	_deck.add(One0B);
	Card One1B = new One(1);
	_deck.add(One1B);
	Card One2B = new One(2);
	_deck.add(One2B);
	Card One3B = new One(3);
	_deck.add(One3B);
	Card Two0A = new Two(0);
	_deck.add(Two0A);
	Card Two1A = new Two(1);
	_deck.add(Two1A);
	Card Two2A = new Two(2);
	_deck.add(Two2A);
	Card Two3A = new Two(3);
	_deck.add(Two3A);
	
	Card Two0B = new Two(0);
	_deck.add(Two0B);
	Card Two1B = new Two(1);
	_deck.add(Two1B);
	Card Two2B = new Two(2);
	_deck.add(Two2B);
	Card Two3B = new Two(3);
	_deck.add(Two3B);
	Card Three0A = new Three(0);
	_deck.add(Three0A);
	Card Three1A = new Three(1);
	_deck.add(Three1A);
	Card Three2A = new Three(2);
	_deck.add(Three2A);
	Card Three3A = new Three(3);
	_deck.add(Three3A);
	
	Card Three0B = new Three(0);
	_deck.add(Three0B);
	Card Three1B = new Three(1);
	_deck.add(Three1B);
	Card Three2B = new Three(2);
	_deck.add(Three2B);
	Card Three3B = new Three(3);
	_deck.add(Three3B);
	Card Four0A = new Four(0);
	_deck.add(Four0A);
	Card Four1A = new Four(1);
	_deck.add(Four1A);
	Card Four2A = new Four(2);
	_deck.add(Four2A);
	Card Four3A = new Four(3);
	_deck.add(Four3A);
	
	Card Four0B = new Four(0);
	_deck.add(Four0B);
	Card Four1B = new Four(1);
	_deck.add(Four1B);
	Card Four2B = new Four(2);
	_deck.add(Four2B);
	Card Four3B = new Four(3);
	_deck.add(Four3B);
	Card Five0A = new Five(0);
	_deck.add(Five0A);
	Card Five1A = new Five(1);
	_deck.add(Five1A);
	Card Five2A = new Five(2);
	_deck.add(Five2A);
	Card Five3A = new Five(3);
	_deck.add(Five3A);
	
	Card Five0B = new Five(0);
	_deck.add(Five0B);
	Card Five1B = new Five(1);
	_deck.add(Five1B);
	Card Five2B = new Five(2);
	_deck.add(Five2B);
	Card Five3B = new Five(3);
	_deck.add(Five3B);
	Card Six0A = new Six(0);
	_deck.add(Six0A);
	Card Six1A = new Six(1);
	_deck.add(Six1A);
	Card Six2A = new Six(2);
	_deck.add(Six2A);
	Card Six3A = new Six(3);
	_deck.add(Six3A);
	
	Card Six0B = new Six(0);
	_deck.add(Six0B);
	Card Six1B = new Six(1);
	_deck.add(Six1B);
	Card Six2B = new Six(2);
	_deck.add(Six2B);
	Card Six3B = new Six(3);
	_deck.add(Six3B);
	Card Seven0A = new Seven(0);
	_deck.add(Seven0A);
	Card Seven1A = new Seven(1);
	_deck.add(Seven1A);
	Card Seven2A = new Seven(2);
	_deck.add(Seven2A);
	Card Seven3A = new Seven(3);
	_deck.add(Seven3A);
	
	Card Seven0B = new Seven(0);
	_deck.add(Seven0B);
	Card Seven1B = new Seven(1);
	_deck.add(Seven1B);
	Card Seven2B = new Seven(2);
	_deck.add(Seven2B);
	Card Seven3B = new Seven(3);
	_deck.add(Seven3B);
	Card Eight0A = new Eight(0);
	_deck.add(Eight0A);
	Card Eight1A = new Eight(1);
	_deck.add(Eight1A);
	Card Eight2A = new Eight(2);
	_deck.add(Eight2A);
	Card Eight3A = new Eight(3);
	_deck.add(Eight3A);
	
	Card Eight0B = new Eight(0);
	_deck.add(Eight0B);
	Card Eight1B = new Eight(1);
	_deck.add(Eight1B);
	Card Eight2B = new Eight(2);
	_deck.add(Eight2B);
	Card Eight3B = new Eight(3);
	_deck.add(Eight3B);
	Card Nine0A = new Nine(0);
	_deck.add(Nine0A);
	Card Nine1A = new Nine(1);
	_deck.add(Nine1A);
	Card Nine2A = new Nine(2);
	_deck.add(Nine2A);
	Card Nine3A = new Nine(3);
	_deck.add(Nine3A);
	
	Card Nine0B = new Nine(0);
	_deck.add(Nine0B);
	Card Nine1B = new Nine(1);
	_deck.add(Nine1B);
	Card Nine2B = new Nine(2);
	_deck.add(Nine2B);
	Card Nine3B = new Nine(3);
	_deck.add(Nine3B);
	Card WildA = new Wild();
	_deck.add(WildA);
	Card WildB = new Wild();
	_deck.add(WildB);
	Card WildC = new Wild();
	_deck.add(WildC);
	Card WildD = new Wild();
	_deck.add(WildD);
	Card WildDrawFourA = new WildDrawFour();
	_deck.add(WildDrawFourA);
	Card WildDrawFourB = new WildDrawFour();
	_deck.add(WildDrawFourB);
	Card WildDrawFourC = new WildDrawFour();
	_deck.add(WildDrawFourC);
	Card WildDrawFourD = new WildDrawFour();
	_deck.add(WildDrawFourD);

	shuffle();

	System.out.println("Select number of players (2-4)");
	int numPlayers = Keyboard.readInt();
	
	System.out.println("What is Player1's name?");
	String pName = Keyboard.readString();	    
	Player p0 = new Player(pName, 0);
	_turnOrder.add(p0);
	
	System.out.println("What is Player2's name?");
	pName = Keyboard.readString();	    
	Player p1 = new Player(pName, 1);
	_turnOrder.add(p1);
	
	if (numPlayers > 2){
	System.out.println("What is Player3's name?");
	pName = Keyboard.readString();
	Player p2 = new Player(pName, 2);
	_turnOrder.add(p2);
	}
	
	if (numPlayers == 4){
	System.out.println("What is Player4's name?");
	pName = Keyboard.readString();	    
	Player p3 = new Player(pName, 3);
	_turnOrder.add(p3);
	}

	
    }

    public void playerDraw(Player p){
	p._hand.add(_deck.remove(0));
    }
    
    public boolean anyWinner(){ //checks if each player is a winner, if no player is a winner, return false
        for (Player p: _turnOrder){
	    if (p.isWinner()){
		return true;
	    }
	}
	return false;
    }
    
    public void shuffle(){
	int max = _deck.size();
	for (int i = 0; i < _deck.size(); i++){
	    int random = (int) (Math.random() * max);
	    _deck.set(i,_deck.set(random,_deck.get(i)));
	}
    }

    
    public void distribute(){
	for (int i =0; i < _turnOrder.size(); i++){
	    Player focusPlayer = _turnOrder.get(i);
	    while(!focusPlayer.handFull()){
	        playerDraw(focusPlayer);
		//focusPlayer.sortHand();	
	    }
	}	
    }
    
    public void playCard(Player p, int i){
	p._hand.get(i).action();
	_discardPile.add(_topCard.remove(0));
	_topCard.add(p._hand.remove(i));
    }
    
    public boolean isPlayable(Card c){ //
        if (c.getSuite() == 4){
	    return true;
	}
	else if(c.getSuite() == _topCard.get(0).getSuite()){
	    return true;
	}
	else if(c.getType() == _topCard.get(0).getType()){
	    return true;
	}
	return false;
    }

    public boolean anyPlayable(Player p){ //tests if the player has any playable card in their hand
	for (Card c: p._hand){
	    if (isPlayable(c)){
		return true;
	    }
	}
	return false;
    }


    public void printUserDisplay(Player p){
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
      	System.out.println();
     	System.out.println();
     	System.out.println();
     	System.out.println();
       	System.out.println();
      	System.out.println();
      	System.out.println();
      	System.out.println();
      	System.out.println();
      	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("TopCard: " + _topCard.get(0) + "  --playable cards must match this card's suite (color) or type");
	System.out.println();
	System.out.println(p.getName() + "'s turn:");
       	System.out.println();
        System.out.println(p);
    }
    
    public static void main(String[]args){
	Woo game = new Woo();
	game.setup();
	game.distribute();
	game._topCard.add(game._deck.remove(0));

	int turnCounter = 0;

	while (!game.anyWinner()){
	    //deck is empty mechanics
	    
	    game._currentPlayer = game._turnOrder.get(turnCounter%game._turnOrder.size());
	    
	    System.out.println("Please pass the device to " + game._currentPlayer.getName() + ", it is their turn.");
	    System.out.println("Press any key to continue");
	
	    game.printUserDisplay(game._currentPlayer);

	    while(!game.anyPlayable(game._currentPlayer)){
		System.out.println("You have no playable cards, type any key to draw a card");
		Keyboard.readString();
		game.playerDraw(game._currentPlayer);
		//sorthand
		game.printUserDisplay(game._currentPlayer);
	    }

	    //user selects card to play

	    System.out.println("Please select a card to play by it's position in your hand.");
	    System.out.println("Card position in your hand is indicated by a number in parenthesis.");
	    int cardtoPlay = Keyboard.readInt()-1;

	    while(!game.isPlayable(game._currentPlayer._hand.get(cardtoPlay))){
		System.out.println("That card is not playable. Make sure your card matches the topCard's suite or type.");
		System.out.println("Please select another card.");
		cardtoPlay = Keyboard.readInt()-1;
	    }
	    
	    game.playCard(game._currentPlayer,cardtoPlay); //plays the user-selected card
	    
	    turnCounter += 1;
	}

	System.out.println(game._currentPlayer.getName() + "is the WINNER!!!!!!");
    }
	    
}

