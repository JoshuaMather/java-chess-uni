package chess;

public abstract class Piece {
    private  int row, column;
    private  String symbol;
    protected  PieceColour colour;

    Piece(){}

    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String givenSymbol){
        this.symbol = givenSymbol;
    }

    public PieceColour getColour(){
        return colour;
    }

    public void updateCoordinates(int a, int b){
        this.row = a;
        this.column = b;

    }

    public abstract boolean isLegitMove(int i1, int j1, int i2, int j2);
}
