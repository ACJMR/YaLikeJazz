import java.util.ArrayList;

public class Player{
    private String _name;
    private int _number;
    private ArrayList<Card> _hand;
    
    public ArrayList<Card> getHand(){
        return _hand;    
    }
    
    public String getName(){
        return _name;
    }
    
    public int getNumber(){ 
        return _number;
    }
    
    public void addtoHand(){    
        
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
    
    }

