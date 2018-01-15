import java.util.ArrayList;

public class Woo{
    private ArrayList<Card> _deck; // Container of cards from which players draw from 
    private ArrayList<Card> _discardPile; // Container of cards already played 
    private ArrayList<Card>  _topcard; // Container for card 
    private ArrayList<Player> _turnOrder; // _turnOrder
    private Player _currentPlayer; 

    // Default constructor Woo() instantiates  _deck 
    public Woo(){
        Zero Zero0 = new Zero(0);
	_deck.add(Zero0);
	Zero Zero1 = new Zero(1);
	_deck.add(Zero1);
	Zero Zero2 = new Zero(2);
	_deck.add(Zero2);
	Zero Zero3 = new Zero(3);
	_deck.add(Zero3);

	One One0A = new One(0);
	_deck.add(One0A);
	One One1A = new One(1);
	_deck.add(One1A);
	One One2A = new One(2);
	_deck.add(One2A);
	One One3A = new One(3);
	_deck.add(One3A);
	
	One One0B = new One(0);
	_deck.add(One0B);
	One One1B = new One(1);
	_deck.add(One1B);
	One One2B = new One(2);
	_deck.add(One2B);
	One One3B = new One(3);
	_deck.add(One3B);

	Two Two0A = new Two(0);
	_deck.add(Two0A);
	Two Two1A = new Two(1);
	_deck.add(Two1A);
	Two Two2A = new Two(2);
	_deck.add(Two2A);
	Two Two3A = new Two(3);
	_deck.add(Two3A);
	
	Two Two0B = new Two(0);
	_deck.add(Two0B);
	Two Two1B = new Two(1);
	_deck.add(Two1B);
	Two Two2B = new Two(2);
	_deck.add(Two2B);
	Two Two3B = new Two(3);
	_deck.add(Two3B);

	Three Three0A = new Three(0);
	_deck.add(Three0A);
	Three Three1A = new Three(1);
	_deck.add(Three1A);
	Three Three2A = new Three(2);
	_deck.add(Three2A);
	Three Three3A = new Three(3);
	_deck.add(Three3A);
	
	Three Three0B = new Three(0);
	_deck.add(Three0B);
	Three Three1B = new Three(1);
	_deck.add(Three1B);
	Three Three2B = new Three(2);
	_deck.add(Three2B);
	Three Three3B = new Three(3);
	_deck.add(Three3B);

	Four Four0A = new Four(0);
	_deck.add(Four0A);
	Four Four1A = new Four(1);
	_deck.add(Four1A);
	Four Four2A = new Four(2);
	_deck.add(Four2A);
	Four Four3A = new Four(3);
	_deck.add(Four3A);
	
	Four Four0B = new Four(0);
	_deck.add(Four0B);
	Four Four1B = new Four(1);
	_deck.add(Four1B);
	Four Four2B = new Four(2);
	_deck.add(Four2B);
	Four Four3B = new Four(3);
	_deck.add(Four3B);

	Five Five0A = new Five(0);
	_deck.add(Five0A);
	Five Five1A = new Five(1);
	_deck.add(Five1A);
	Five Five2A = new Five(2);
	_deck.add(Five2A);
	Five Five3A = new Five(3);
	_deck.add(Five3A);
	
	Five Five0B = new Five(0);
	_deck.add(Five0B);
	Five Five1B = new Five(1);
	_deck.add(Five1B);
	Five Five2B = new Five(2);
	_deck.add(Five2B);
	Five Five3B = new Five(3);
	_deck.add(Five3B);

	Six Six0A = new Six(0);
	_deck.add(Six0A);
	Six Six1A = new Six(1);
	_deck.add(Six1A);
	Six Six2A = new Six(2);
	_deck.add(Six2A);
	Six Six3A = new Six(3);
	_deck.add(Six3A);
	
	Six Six0B = new Six(0);
	_deck.add(Six0B);
	Six Six1B = new Six(1);
	_deck.add(Six1B);
	Six Six2B = new Six(2);
	_deck.add(Six2B);
	Six Six3B = new Six(3);
	_deck.add(Six3B);

	Seven Seven0A = new Seven(0);
	_deck.add(Seven0A);
	Seven Seven1A = new Seven(1);
	_deck.add(Seven1A);
	Seven Seven2A = new Seven(2);
	_deck.add(Seven2A);
	Seven Seven3A = new Seven(3);
	_deck.add(Seven3A);
	
	Seven Seven0B = new Seven(0);
	_deck.add(Seven0B);
	Seven Seven1B = new Seven(1);
	_deck.add(Seven1B);
	Seven Seven2B = new Seven(2);
	_deck.add(Seven2B);
	Seven Seven3B = new Seven(3);
	_deck.add(Seven3B);

	Eight Eight0A = new Eight(0);
	_deck.add(Eight0A);
	Eight Eight1A = new Eight(1);
	_deck.add(Eight1A);
	Eight Eight2A = new Eight(2);
	_deck.add(Eight2A);
	Eight Eight3A = new Eight(3);
	_deck.add(Eight3A);
	
	Eight Eight0B = new Eight(0);
	_deck.add(Eight0B);
	Eight Eight1B = new Eight(1);
	_deck.add(Eight1B);
	Eight Eight2B = new Eight(2);
	_deck.add(Eight2B);
	Eight Eight3B = new Eight(3);
	_deck.add(Eight3B);

	Nine Nine0A = new Nine(0);
	_deck.add(Nine0A);
	Nine Nine1A = new Nine(1);
	_deck.add(Nine1A);
	Nine Nine2A = new Nine(2);
	_deck.add(Nine2A);
	Nine Nine3A = new Nine(3);
	_deck.add(Nine3A);
	
	Nine Nine0B = new Nine(0);
	_deck.add(Nine0B);
	Nine Nine1B = new Nine(1);
	_deck.add(Nine1B);
	Nine Nine2B = new Nine(2);
	_deck.add(Nine2B);
	Nine Nine3B = new Nine(3);
	_deck.add(Nine3B);

	Wild WildA = new Wild();
	_deck.add(WildA);
	Wild WildB = new Wild();
	_deck.add(WildB);
	Wild WildC = new Wild();
	_deck.add(WildC);
	Wild WildD = new Wild();
	_deck.add(WildD);

	WildDrawFour WildDrawFourA = new WildDrawFour();
	_deck.add(WildDrawFourA);
	WildDrawFour WildDrawFourB = new WildDrawFour();
	_deck.add(WildDrawFourB);
	WildDrawFour WildDrawFourC = new WildDrawFour();
	_deck.add(WildDrawFourC);
	WildDrawFour WildDrawFourD = new WildDrawFour();
	_deck.add(WildDrawFourD);
 
    }
 
    public void setup(){
	
    }

    public void playerDraw(Player p){
	
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
	
    }

    public void distribute(){
	
    }
    
    public void playCard(Player p, int i){
	
    }
    
    public static boolean isPlayable(){
	return false;
    }
    
    public static void main(String[]args){
	Card One = new One(1);

	System.out.println(One.getSuite());
    }
	    
}
