import java.awt.*;
public class Giant extends  Critter{

    private int moveCount = 0;
    public Giant() {
    }
    public Color getColor(){
        return Color.GRAY;
    }
    public String toString(){
        if(moveCount >= 24){
            moveCount = 0;
        }
        if(moveCount <= 6){
            return "fee";
        } else if(moveCount <= 11){
            return "fie";
        } else if(moveCount <= 17){
            return "foe";
        }else{
            return "fum";
        }
    }
    public Action getMove(CritterInfo info){
        moveCount++;
        if(info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }else{
            return Action.RIGHT;
        }
    }
}