package MyTypes;

public class Player extends Enemy{

    private int choice;
    public int setChoice(int sc){
        choice = sc;
        return sc;
    }

    public int getChoice(){
        return choice;
    }

}