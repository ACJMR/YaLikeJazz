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

