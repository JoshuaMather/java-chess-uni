package chess;

public class Piece {
    private static int row, column;
    private static String symbol;
    protected static PieceColour colour;

    Piece(){}

    public static String getSymbol(){
        return symbol;
    }

    public void setSymbol(String givenSymbol){
  
    }

    public static PieceColour getColour(){
        return colour;
    }

    public static void updateCoordinates(int a, int b){
        row = a;
        column = b;

    }

    public static boolean isLegitmove(int i1, int j1, int i2, int j2){
        return true;
    }
}
