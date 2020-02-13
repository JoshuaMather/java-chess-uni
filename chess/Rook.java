package chess;
/*
white U+2656	
black U+265C	
 */

public class Rook extends Piece{
    Rook(PieceColour colourOfPiece){
        this.colour = colourOfPiece;
    }

    public boolean isLegitmove(int i1, int j1, int i2, int j2){
        // no need to store list of possible moves as rook always will move in same row or column
        if (i1 == i2 || j1 == j2) {
            return true;
        }
        return false;
    }
}
