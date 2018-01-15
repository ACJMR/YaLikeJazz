import java.util.ArrayList;

public class Player{
    private String _name;
    private int _number;
    public ArrayList<Card> _hand;
    
    public Player(String name, int num){
        _name = name;
        _number = num;
        _hand = new ArrayList<Card>();
    }
    
    public ArrayList<Card> getHand(){
        return _hand;    
    }
    
    public String getName(){
        return _name;
    }
    
    public int getNumber(){ 
        return _number;
    }
    
    
    public boolean isWinner(){
        return _hand.size()==0;
    }
    
     public void sortHand(){
	int handOriginalSize = _hand.size();
	int removedCards = 0; 
	ArrayList<Card> greenHand = new ArrayList<Card>();
	ArrayList<Card> blueHand = new ArrayList<Card>();
	ArrayList<Card> redHand = new ArrayList<Card>();
	ArrayList<Card> yellowHand = new ArrayList<Card>();
	ArrayList<Card> blackHand = new ArrayList<Card>();
	while(removedCards != handOriginalSize){
	    if (_hand.get(0).getSuite() == 0){
		redHand.add(_hand.remove(0));
	    }
	    else if (_hand.get(0).getSuite() == 1){
		blueHand.add(_hand.remove(0));
	    }
	    else if (_hand.get(0).getSuite() == 2){
		greenHand.add(_hand.remove(0));
	    }
	    else if (_hand.get(0).getSuite() == 3){
		yellowHand.add(_hand.remove(0));
	    }
	    else if (_hand.get(0).getSuite() == 4){
		blackHand.add(_hand.remove(0));
	    }
	    removedCards ++;
	}
	int greenHandOriginalSize = greenHand.size(); 
	int blueHandOriginalSize = blueHand.size();
	int redHandOriginalSize = redHand.size();
	int yellowHandOriginalSize = yellowHand.size(); 
	int blackHandOriginalSize = blackHand.size();

	for (int i = 0; i < greenHandOriginalSize; i++){
	    _hand.add(greenHand.remove(0));
	}

	for (int i = 0; i < blueHandOriginalSize; i++){
	    _hand.add(blueHand.remove(0));
	}

	for (int i = 0; i < redHandOriginalSize; i++){
	    _hand.add(redHand.remove(0));
	}

	for (int i = 0; i < yellowHandOriginalSize; i++){
	    _hand.add(yellowHand.remove(0));
	}

	for (int i = 0; i < blackHandOriginalSize; i++){
	    _hand.add(blackHand.remove(0));
	}
     }

    
    public int playCard(){
        return 0;
    }
    
    public boolean anyPlayableCard(){
        return true;
        
    }
    
    public boolean handFull(){
        if (_hand.size() >= 7){
            return true;
        }
        return false;
    } 
    
    public String toString(){
        String s = "Your Hand: ";
        for (int i = 0; i < _hand.size(); i++){
            Card c = _hand.get(i);
            s += "(" + (i+1) + ")" + c.toString();
        }
        return s;
    }
    
}

