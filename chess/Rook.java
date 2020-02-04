package chess;
/*
white U+2656	
black U+265C	
 */

public class Rook{
    Rook(PieceColour colourofPiece){

    }

    public static boolean isLegitmove(int i1, int j1, int i2, int j2){
        if (i1 == i2 || j1 == j2) {
            return true;
        }
        return false;
    }
}
