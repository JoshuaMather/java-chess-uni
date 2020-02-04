package chess;

public class Piece {
    private int row, column;
    private String symbol;
    protected PieceColour colour;

    Piece(){}

    public static String getSymbol(){
        return null;
    }

    public void setSymbol(String givenSymbol){
  
    }

    public static PieceColour getColour(){
        return null;
    }

    public static void updateCoordinates(int a, int b){

    }

    public static boolean isLegitmove(int i1, int j1, int i2, int j2){
        return true;
    }
}
