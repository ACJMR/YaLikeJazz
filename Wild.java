import cs1.Keyboard;
public class Wild extends Card{
     public Wild(){
        _suite = 4;
        _type = 10;
    }
    
    public void action(){
        System.out.println("Please indicate the suite you would like to switch to by typing the corresponding number for the suite:");
        System.out.println("Red--0    Blue--1    Green--2    Yellow--3");
        setSuite(Keyboard.readInt());    
    }

}