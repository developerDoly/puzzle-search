/**
 * Tweaking this class allows you to make a different sized tile-puzzle game board.
 */

public class Initializer {
    public MovementRule up;
    public MovementRule down;
    public MovementRule right;
    public MovementRule left;

    public Tile tileA;
    public Tile tileB;
    public Tile tileC;
    public Tile tileD;
    public Tile tileE;
    public Tile tileF;
    public Tile tileG;
    public Tile tileH;
    public Tile tileI;


    //A B C
    //D E F
    //G H I

    //a b c d e f g h i

    public Initializer(){
         initialize();
    }

    public Initializer startGame(){
        return this;
    }

    private void initialize(){
        up = new MovementRule("UP");
        down = new MovementRule("DOWN");
        right = new MovementRule("RIGHT");
        left = new MovementRule("LEFT");

        tileA = new Tile("A");
        tileA.setMoves(right, down);

        tileB = new Tile("B");
        tileB.setMoves(left, right, down);

        tileC = new Tile("C");
        tileC.setMoves(left, down);

        tileD = new Tile("D");
        tileD.setMoves(up, right, down);

        tileE = new Tile("E");
        tileE.setMoves(up, left, right, down);

        tileF = new Tile("F");
        tileF.setMoves(up, left, down);

        tileG = new Tile("G");
        tileG.setMoves(up, right);

        tileH = new Tile("H");
        tileH.setMoves(up, left, right);

        tileI = new Tile("I");
        tileI.setMoves(up, left);
    }
}
