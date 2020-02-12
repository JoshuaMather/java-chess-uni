package chess;
/*
white U+2659
black U+265F
*/

public class Pawn extends Piece{	
    Pawn(PieceColour colourOfPiece){
        Pawn.colour = colourOfPiece;
    }

    public boolean isLegitmove(int i1, int j1, int i2, int j2){
        // White
        if(Pawn.colour == PieceColour.WHITE){
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
        }

        // Black
        if(Pawn.colour == PieceColour.BLACK){
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
        }
        return false;
    }
}
