public class Tile {
    private Tile parent;
    private String name;
    private MovementRule[] moves;
    private int numMoves;

    public Tile(String name){
        this.name = name;
    }

    public Tile getParent(){
        return parent;
    }

    public void setParent(Tile parent){
        this.parent = parent;
    }

    public String getName(){
        return name;
    }

    public MovementRule getMove(int index){
        return moves[index];
    }

    public int getNumMoves(){
        return numMoves;
    }

    public void setMoves(MovementRule a, MovementRule b){
        moves = new MovementRule[]{a,b};
        numMoves = 2;
    }

    public void setMoves(MovementRule a, MovementRule b, MovementRule c){
        moves = new MovementRule[]{a,b,c};
        numMoves = 3;
    }

    public void setMoves(MovementRule a, MovementRule b, MovementRule c, MovementRule d){
        moves = new MovementRule[]{a,b,c,d};
        numMoves = 4;
    }

}
