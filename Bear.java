import java.awt.*;

public class Bear extends Critter {

    private boolean polar;
    private int moves;

    public Bear (boolean polar){
        this.polar=polar;
        getColor();
    }
    public Color getColor(){
        if (this.polar){
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString(){
        if(moves%2==0){
            return "/";
        } else {
            return "\\";
        }
    }
    public Critter.Action getMove(CritterInfo info) {
        moves++;
        if (info.getFront() == Critter.Neighbor.OTHER) {
            return Critter.Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY) {
            return Critter.Action.HOP;
        } else{
            return super.getMove(info);
        }
    }


}
