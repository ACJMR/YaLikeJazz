import java.util.ArrayList;

public class Player{
    private String _name;
    private int _number;
    private Card[] _hand;
    
    public Card[] getHand(){
        return _hand;    
    }
    
    public String getName(){
        return _name;
    }
    
    public int getNumber(){ 
        return _number;
    }
 
    public void drawCard(){
        
    }
    
    public boolean isWinner(){
        return true;
    }
    
    public void sortHand(){
        
    }
    
    public int playCard(){
        return 0;
    }
    
    public boolean anyPlayableCard(){
        return true;
        
    }
    
    }

