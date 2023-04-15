import java.awt.*;
import java.util.Random;


public class Tiger extends Critter{

    private Random dice = new Random();
    private int moveCount = 0;
    private Color color;
    private int randomNumber;


    public Tiger(){
        randomizeColor();
    }


    public Color getColor(){
        Color newColor;
        if(moveCount % 3 == 0){
            moveCount = 0;
            do{
                newColor = randomizeColor();
            }while(color == newColor);
            color = newColor;
        }
        return color;
    }
    public Color randomizeColor(){

        randomNumber = dice.nextInt(3);
        if(randomNumber == 0)
            return Color.RED;
        else if(randomNumber == 1)
            return Color.GREEN;
        else
            return Color.BLUE;
    }


    public String toString(){

        /*
            "TGR"
         */

        return "TGR";
    }


    public Action getMove(CritterInfo info){
        moveCount++;
        if(info.getFront() == Neighbor.OTHER)
            return Action.INFECT;
        else if((info.getFront() == Neighbor.WALL) || (info.getRight() == Neighbor.WALL))
            return Action.LEFT;
        else if(info.getFront() == Neighbor.SAME)
            return Action.RIGHT;
        else
            return Action.HOP;
    }
}