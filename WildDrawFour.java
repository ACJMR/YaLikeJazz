import cs1.Keyboard;
public class WildDrawFour extends Card{
     public WildDrawFour(){
        _suite = 4;
        _type = 11;
    }


    public void action(){
        System.out.println("Please indicate the suite you would like to switch to by typing the corresponding number for the suite:");
        System.out.println("Red--0    Blue--1    Green--2    Yellow--3");
        setSuite(Keyboard.readInt());
    }
}