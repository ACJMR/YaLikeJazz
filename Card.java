import java.util.ArrayList;

public abstract class Card{
    protected int _type; 
    protected int _suite;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BLACK = "\u001B[30m";
    
    
    public int getType(){
	   return _type;
    }

    public int getSuite(){
	   return _suite;
    }

    
    public abstract void action();
    
    public String toString(){
        String s;
        if (_suite == 0){
            s = ANSI_RED;
        }
        else if (_suite == 1){
            s = ANSI_BLUE;
        }
        else if (_suite == 2){
            s = ANSI_GREEN;
        }
        else if (_suite == 3){
            s = ANSI_YELLOW;
        }
        else{
            s = ANSI_BLACK;
        }
        
        String type;
        
        if (_type == 10){
            type = "Wild";
            return "[" + type + "]"; //prints out in default terminal text 
        }
        else if (_type == 11){
            type = "WildDraw4";
            return "[" + type + "]"; //prints out in default terminal text
        }
        else if (_type == 12){
            type = "Draw2";
        }
        else if (_type == 13){
            type = "Skip";
        }
        else if (_type == 14){
            type = "Reverse";
        }
        else{
            type = _type + "";
        }
        return s + "[" + type + "] " + ANSI_RESET;
    }
    
}
