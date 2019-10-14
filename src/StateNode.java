import java.util.LinkedList;
import java.util.Queue;

public class StateNode {
    private int[] state;
    private Tile it;

    private StateNode parent;
    private Queue<StateNode> possibleNextStates = new LinkedList<>();

    public StateNode(int[] state, Tile containsBlank){
        this.state = state;
        it = containsBlank;
    }

    private void makeChildren(){
        int numMoves = it.getNumMoves();
        MovementRule move;
        for(int i = 0; i < numMoves; i++){
            move = it.getMove(i);
            StateNode child = makeMove(move.getRule());
        }
    }

    private StateNode makeMove(int indexChange){
        Tile it = getNewSpot(indexChange);

    }

    private Tile getNewSpot(int move){
        Tile result;
        switch (move){
            case MovementRule.LEFT_THREE:

                break;
            case MovementRule.LEFT_ONE:

                break;
            case MovementRule.RIGHT_ONE:

                break;
            case MovementRule.RIGHT_THREE:

                break;
            default:

        }
    }
}
