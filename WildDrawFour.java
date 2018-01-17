import cs1.Keyboard;
public class WildDrawFour extends Card{ //instantiates the card with neutral _suite 4 and type
     public WildDrawFour(){
        _suite = 4;
        _type = 11;
    }


    public void action(){ //when the card is played, user is prompted to select a suite to change to
        System.out.println("Please indicate the suite you would like to switch to by typing the corresponding number for the suite:");
        System.out.println("\u001B[31m" + "Red--0" + "\u001B[34m" + "    Blue--1" + "\u001B[32m" + "    Green--2" + "\u001B[33m" + "    Yellow--3" + "\u001B[0m");
        setSuite(Keyboard.readInt());
    }
}