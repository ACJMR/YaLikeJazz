import java.util.ArrayList;

public abstract class Card{
    protected int _type; 
    protected int _suite;
    
    
    public int getType(){
	   return _type;
    }

    public int getSuite(){
	   return _suite;
    }

    public boolean isPlayable(){ //determines whther the card is playable according to the _topCard
        return true;
    }
    
    public abstract void action();
    
    public String toString(){
        return "";
    }
    
}
