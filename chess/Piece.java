package chess;

public class Piece {
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

    public boolean isLegitmove(int i1, int j1, int i2, int j2){
        return true;
    }
}
