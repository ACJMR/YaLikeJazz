import java.util.ArrayList;
import cs1.Keyboard;

public class Woo{
    private ArrayList<Card> _deck; // Container of cards from which players draw from 
    private ArrayList<Card> _discardPile; // Container of cards already played 
    private ArrayList<Card>  _topCard; // Container for the top card that determines playable cards
    private ArrayList<Player> _turnOrder; //Container of all Players that determines the turn order
    private Player _currentPlayer; //Keeps track of the player who's turn it is
    private int numPlayers; //Number of players
    private static int cardtoPlay; //the index of the card that _currentPlayer will play
 
    public Woo(){ //Constructor instantiates many instance variables as empty ArrayLists
	_deck = new ArrayList<Card>();
	_turnOrder = new ArrayList<Player>();
	_topCard = new ArrayList<Card>();
	_discardPile = new ArrayList<Card>();
    }

    public static boolean isInt(String s){//checks if a String can be converted into int. Helper function checks if the input from the terminal is an int.
     	try {
    	    Integer.parseInt(s); //convert the String into an int
     	    return true; //true if the String can be converted
    	}
   	catch(Exception e){
	    return false; //false if the String can not be converted
	}
    }

    
    public void setup(){         //wrapper class for instantiating Cards, Players, and shuffling deck
	Card Zero0 = new Zero(0);
	_deck.add(Zero0);
	Card Zero1 = new Zero(1); //each card is instantiated, and then added to the _deck
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

	Card DrawTwo0A = new DrawTwo(0);
	_deck.add(DrawTwo0A);
	Card DrawTwo1A = new DrawTwo(1);
	_deck.add(DrawTwo1A);
	Card DrawTwo2A = new DrawTwo(2);
	_deck.add(DrawTwo2A);
	Card DrawTwo3A = new DrawTwo(3);
	_deck.add(DrawTwo3A);
	Card DrawTwo0B = new DrawTwo(0);
	_deck.add(DrawTwo0B);
	Card DrawTwo1B = new DrawTwo(1);
	_deck.add(DrawTwo1B);
	Card DrawTwo2B = new DrawTwo(2);
	_deck.add(DrawTwo2B);
	Card DrawTwo3B = new DrawTwo(3);
	_deck.add(DrawTwo3B);

	Card Reverse0A = new Reverse(0);
	_deck.add(Reverse0A);
	Card Reverse1A = new Reverse(1);
	_deck.add(Reverse1A);
	Card Reverse2A = new Reverse(2);
	_deck.add(Reverse2A);
	Card Reverse3A = new Reverse(3);
	_deck.add(Reverse3A);
	Card Reverse0B = new Reverse(0);
	_deck.add(Reverse0B);
	Card Reverse1B = new Reverse(1);
	_deck.add(Reverse1B);
	Card Reverse2B = new Reverse(2);
	_deck.add(Reverse2B);
	Card Reverse3B = new Reverse(3);
	_deck.add(Reverse3B);

	Card Skip0A = new Skip(0);
	_deck.add(Skip0A);
	Card Skip1A = new Skip(1);
	_deck.add(Skip1A);
	Card Skip2A = new Skip(2);
	_deck.add(Skip2A);
	Card Skip3A = new Skip(3);
	_deck.add(Skip3A);
	Card Skip0B = new Skip(0);
	_deck.add(Skip0B);
	Card Skip1B = new Skip(1);
	_deck.add(Skip1B);
	Card Skip2B = new Skip(2);
	_deck.add(Skip2B);
	Card Skip3B = new Skip(3);
	_deck.add(Skip3B);
	

	shuffle();


	boolean is = true;
	while (is){
	    System.out.println("Select number of players (2-4)");   //user inputs how many players the game will have
	    String input = Keyboard.readString();
	    if (isInt(input)){//tests to see if the user's input is a proper int
	        numPlayers = Integer.parseInt(input); 
		is = false; // end the while loop if the input is a proper int
	    }
	    else{
		System.out.println();
		System.out.println("Please enter an integer."); //otherwise, prompt them to select an int
	    }
	    
	}
	    
	System.out.println("What is Player1's name?"); //creates two players no matter what int the user input
	String pName = Keyboard.readString();	    
	Player p0 = new Player(pName, 0);
	_turnOrder.add(p0); //adds p0 to _turnOrder
	
	System.out.println("What is Player2's name?"); 
	pName = Keyboard.readString();	    
	Player p1 = new Player(pName, 1);
	_turnOrder.add(p1); //adds p1 to _turnOrder
	
	if (numPlayers > 2){    
	    System.out.println("What is Player3's name?");   //if 3 or 4 players, instantiate p2
	    pName = Keyboard.readString();
	    Player p2 = new Player(pName, 2);
	    _turnOrder.add(p2); //adds p2 to _turnOrder
	}
	
	if (numPlayers == 4){
	    System.out.println("What is Player4's name?");  //if 4 players, instantiate p3
	    pName = Keyboard.readString();	    
	    Player p3 = new Player(pName, 3);
	    _turnOrder.add(p3); //adds p3 to _turnOrder
	}

    }

    public void playerDraw(Player p){
	if (_deck.size()==0){            //if there are no cards left in the deck, copy the discard pile into the deck and shuffle the deck
	    for (Card c: _discardPile){
		_deck.add(c);
	    }
	    shuffle();
	}
	p._hand.add(_deck.remove(0)); //remove card from the deck and add it to p's hand
    }
    
    public boolean anyWinner(){ //checks if each player is a winner, if no player is a winner, return false
        for (Player p: _turnOrder){
	    if (p.isWinner()){
		return true;
	    }
	}
	return false;
    }
    
    public void shuffle(){     //loops through deck and swaps the current Card with one at a random index
	int max = _deck.size();
	for (int i = 0; i < _deck.size(); i++){
	    int random = (int) (Math.random() * max);
	    _deck.set(i,_deck.set(random,_deck.get(i)));
	}
    }

    
    public void distribute(){  //deals out 7 cards to each player
	for (int i =0; i < _turnOrder.size(); i++){ //loops through all players in _turnOrder
	    Player focusPlayer = _turnOrder.get(i);
	    while(!focusPlayer.handFull()){  //each player draws until their hand is full, the sorts their hand
	        playerDraw(focusPlayer);	
	    }
	    focusPlayer.sortHand();
	}	
    }
    
    public void playCard(Player p, int i){ //Plays card at pos i in Player p's hand
	p._hand.get(i).action(); //execute card's action (applicable to Wild-Cards only)
	_discardPile.add(_topCard.remove(0));  //move card in _topCard to _discardPile, then move the player's card into _topCard
	_topCard.add(p._hand.remove(i));
    }
    
    public boolean isPlayable(Card c){ //returns true if card is playable according to the rules of JUNO
        if (c.getSuite() == 4){ //if card is a Wild-Card, return true
	    return true;
	}
	else if(c.getSuite() == _topCard.get(0).getSuite()){ //checks if card has same suite as _topCard
	    return true;
	}
	else if(c.getType() == _topCard.get(0).getType()){ //checks if card has same type as _topCard
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
      	System.out.println(p.getName() + "'s turn:");
	System.out.println();
	System.out.println();
	System.out.println("TopCard: " + _topCard.get(0) + "  --playable cards must match this card's suite (color) or type");
	System.out.println();
       	System.out.println();
        System.out.println(p);
        System.out.println();
    }
    
    
    //==========================================
    
    public static void main(String[]args){
    
	Woo game = new Woo();
	game.setup(); //instantiates deck, prompts user to select players, instantiates players, and shuffles deck

	/**for (Card c: game._deck){ //prints out deck for testing purposes
	    System.out.println(c);
	    }**/
       
	game.distribute();  //Distribute cards to all Players 
	game._topCard.add(game._deck.remove(0));  //Populate _topCard with the first card from the deck 

	
	if (game._topCard.get(0).getType() == 10 || game._topCard.get(0).getType() == 11){ //if _topCard is a Wild-Card, then randomly determine it's suite
	    game._topCard.get(0).setSuite((int)(Math.random()*4));
	}
	
	int turnCounter = 0; //counts number of turns
	boolean is;
	
	while (!game.anyWinner()){  //makes the game continue while there are no winners
	
	    
	    if (turnCounter != 0 && game._topCard.get(0).getType() == 13){ //if _topCard (played last turn) is a Skip card, and it is not turn 0, turnCounter incriments, effectively skipping the next player's turn
		turnCounter += 1;
	    }

	    if (turnCounter != 0 && game._topCard.get(0).getType() == 14){ //if _topCard (played last turn) is a Reverse card, and it is not turn 0...
		Player playerBefore = game._turnOrder.get(((turnCounter%game._turnOrder.size()) + game._turnOrder.size() - 1)%game._turnOrder.size());  //stores the player who's turn just ended in playerBefore
		for(int i = 0; i < game._turnOrder.size() / 2; i++){
		    game._turnOrder.set(i,game._turnOrder.set(game._turnOrder.size()-1-i,game._turnOrder.get(i)));	//loops through the array and swaps items equal distances from the ends, reversing the array's contents
		}
	        for (int i = 0; i < game._turnOrder.size(); i++){ //changes turnCounter to be the playerBefore's turn
		    if (game._turnOrder.get(i) == playerBefore){
			turnCounter = i+1;
		    }
		}
	    }
	    
	    
	    game._currentPlayer = game._turnOrder.get(turnCounter%game._turnOrder.size()); //current player is set according to how many turns there have been and how many players there are (turnCounter % numPlayers)
	    
	    System.out.println();
	    System.out.println("Please pass the device to " + game._currentPlayer.getName() + ", it is their turn."); //prints out a message to get the user to give device to next user
	    System.out.println("Type anything and RETURN to continue");
	    Keyboard.readString();

	    if (turnCounter != 0 && game._topCard.get(0).getType() == 11){ //if _topCard (played last turn) is a WildDrawFour card, and it is not turn 0, _currentPlayer draws 4 times
		for (int i = 0; i<4; i++){
		    game.playerDraw(game._currentPlayer);
		}
	    }
	    if (turnCounter != 0 && game._topCard.get(0).getType() == 12){ //if _topCard (played last turn) is a DrawTwo card, and it is not turn 0, _currentPlayer draws 2 times
		for (int i = 0; i<2; i++){
		    game.playerDraw(game._currentPlayer);
		}
	    }

	    
	    game.printUserDisplay(game._currentPlayer); //prints out UserDisplay (user's hand and instructions to play a card)

	    while(!game.anyPlayable(game._currentPlayer)){ //while the user has no playable cards in their hand....
		System.out.println("You have no playable cards, type any key and RETURN to draw a card");
		Keyboard.readString();
		game.playerDraw(game._currentPlayer); //force the user to draw a card
		game._currentPlayer.sortHand(); //player's hand is sorted, then displayed
		game.printUserDisplay(game._currentPlayer);
	    }

	   
        //User selects a card to play:
	    is = true;
	    while (is){ //if input is not a proper int, the while loop keeps going
		System.out.println("Please select a card to play by it's position in your hand.");
		System.out.println("Card position in your hand is indicated by a number in parenthesis.");
		String input = Keyboard.readString();
		if (isInt(input)){ //tests to see if the user's input is a proper int
		    cardtoPlay = Integer.parseInt(input) - 1;
		    is = false; //end the while loop if the input is a proper int
		}
		else{
		    System.out.println("Please enter an integer."); //otherwise, prompt them to select an int
		}
	    }
	    

	    while(!game.isPlayable(game._currentPlayer._hand.get(cardtoPlay))){
		
	        is = true;
		while (is){//if input is not a proper int, the while loop keeps going
		    System.out.println("That card is not playable. Make sure your card matches the Top Card's suite or type.");
		    System.out.println("Please select another card.");
		    String input = Keyboard.readString();
		    if (isInt(input)){//tests to see if the user's input is a proper int
			cardtoPlay = Keyboard.readInt()-1;
			is = false; //end the while loop if the input is a proper int
			}
		    else{
			System.out.println("Please enter an integer.");//otherwise, prompt them to select an int
		    }	    
		}
	    }
	    
	    game.playCard(game._currentPlayer,cardtoPlay); //plays the user-selected card
	    
	    turnCounter += 1; //turn counter Incriments
	}

	System.out.println(game._currentPlayer.getName() + " is the WINNER!!!!!!"); //once the while loops terminates because their is a winner, display a winner's message
    }
	    
}

