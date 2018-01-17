import java.util.ArrayList;

public abstract class Card{
    protected int _type; //determines type of card: Zero - Nine have 0 - 9, Wild - 10, WildDrawFour - 11, DrawTwo - 12, Skip -13, Reverse - 14
    protected int _suite; //dettermines suite of card: Red - 0  Blue - 1  Green - 2  Yellow - 3 Special - 4
    
    public static final String ANSI_RESET = "\u001B[0m"; //below is ANSI escape sequences to print out colors in terminal
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
 
    
    
    public int getType(){ //accesor for type
	   return _type;
    }

    public int getSuite(){ //accesor for suite
	   return _suite;
    }

    public void setSuite(int i){ //set card's suite
	   this._suite = i;
    }
    
    public abstract void action(); //each card is forced to instantiate an action, which is called when it is played
    
    public String toString(){
        String s; //String s is the ANSI escape sequence that determines the color of the card
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
            s = "";
        }
        
        String type;
        
        if (_type == 10 && _suite == 4){ 
            type = "Wild";
            return "[" + type + "]"; //if card is an unplayed Wild card, print out in default terminal text. Cannot be black because some terminals have dark backgrounds
        }
        else if (_type == 11 && _suite == 4){
            type = "WildDraw4";
            return "[" + type + "]"; //if card is an unplayed WildDraw4 card, print out in default terminal text 
        }
        else if(_type == 11){
            type = "WildDraw4";
        }
        else if(_type == 10){
            type = "Wild";
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
        return s + "[" + type + "] " + ANSI_RESET; //prints out card's type in brackets in the color of its suite
    }
    
}
