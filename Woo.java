import java.util.ArrayList;

public class Woo{
    private Card[] _deck; // Container of cards from which players draw from 
    private Card[] _discardPile; // Container of cards already played 
    private Card[] _topcard; // Container for card 
    private Player[] _turnOrder; // _turnOrder
    private Player _currentPlayer; 

    // Default constructor Woo() instantiates  _deck 
    public Woo(){
    }
 
    public void setup(){
    }

    public void playerDraw(Player p){
    }
    
    public boolean anyWinner(){
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
    }
}
