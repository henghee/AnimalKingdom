import java.awt.*;

public class WhiteTiger extends Critter {
    private boolean isChild = true;
    private int moveCount;

    public WhiteTiger() {
    }


    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        while (isChild) {
            return "tgr";
        }
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        moveCount++;
        if (info.getFront() == Neighbor.OTHER) {
            isChild = false;
            return Action.INFECT;
        } else if ((info.getFront() == Neighbor.WALL) || (info.getRight() == Neighbor.WALL))
            return Action.LEFT;
        else if (info.getFront() == Neighbor.SAME)
            return Action.RIGHT;
        else
            return Action.HOP;
    }
}