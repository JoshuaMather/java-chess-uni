package chess;
/*
white U+2659
black U+265F
*/

public class Pawn extends Piece{	
    Pawn(PieceColour colourOfPiece){
        if(colourOfPiece == PieceColour.BLACK){
            Pawn.colour = PieceColour.BLACK;
           // Pawn.symbol = "U+265F";
        }
    }

    public static boolean isLegitmove(int i1, int j1, int i2, int j2){
        // White
        if (j1 == j2) {
            if (i1 == 1){
                if (i2 == i1 + 1 || i2 == i1 + 2){
                    return true;
                }
            }
            else {
                if (i2 == i1 + 1){
                    return true;
                }
            }
            
        }

        // Black
        if (j1 == j2) {
            if (i1 == 6){
                if (i2 == i1 - 1 || i2 == i1 - 2){
                    return true;
                }
            }
            else {
                if (i2 == i1 - 1){
                    return true;
                }
            }
            
        }
        return false;
    }
}
