public class MovementRule {
    public static final String MOVE_UP = "UP";
    public static final String MOVE_LEFT = "LEFT";
    public static final String MOVE_RIGHT = "RIGHT";
    public static final String MOVE_DOWN = "DOWN";

    public static final int LEFT_THREE = -3;
    public static final int LEFT_ONE = -1;
    public static final int RIGHT_ONE = 1;
    public static final int RIGHT_THREE = 3;

    private String name;

    //A B C
    //D E F
    //G H I

    //a b c d e f g h i

    //When the blank is on a tile, that tile is "it."
    //That tile has an array of possible moves.
    //We loop through that array to generate the possible children.
    public MovementRule(String name){
        this.name = name;
    }

    //This method
    public int getRule(){
        switch(name){
            case MOVE_UP:
                return LEFT_THREE;
            case MOVE_LEFT:
                return LEFT_ONE;
            case MOVE_RIGHT:
                return RIGHT_ONE;
            case MOVE_DOWN:
                return RIGHT_THREE;
            default:
                return 0;
        }
    }
}
