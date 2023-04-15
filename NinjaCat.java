import java.awt.*;
public class NinjaCat extends Critter{
    private int moveCount = 0;
    private boolean inStealth = true;
    public NinjaCat(){
    }
    public Color getColor(){
        if(inStealth){
            return Color.CYAN;
        }else{
            return Color.MAGENTA;
        }
    }
    public String toString(){
        if(inStealth){
            return "@";
        }else{
            return "M";
        }
    }
    public Action getMove(CritterInfo info){
        moveCount++;
        if(info.getFront() == Neighbor.OTHER) {
            inStealth = false;
            return Action.INFECT;
        }else if(info.getFront() == Neighbor.EMPTY){
            inStealth = true;
            return Action.HOP;
        }else{
            return Action.LEFT;
        }
    }
}