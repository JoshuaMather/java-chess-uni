package chess;
import java.util.ArrayList;
/*
white U+2657	
black U+265D
 */

public class Bishop extends Piece{
    Bishop(PieceColour colourOfPiece){
        this.colour = colourOfPiece;
    }

    public boolean isLegitmove(int i1, int j1, int i2, int j2){
        /*
        create list of diagonals
        see if second coordinate is in list
        */
        ArrayList<ArrayList<Integer>> validSquares = new ArrayList<ArrayList<Integer>>();
        Square[][] b = Board.getBoard();
    

        // down right
        int checki = i1;
        int checkj = j1;
        while (checki<7 && checkj<7) {
            checki += 1;
            checkj += 1;
            if(b[checki][checkj].hasPiece()){
                if(b[checki][checkj].getPiece().colour == this.colour){
                    break;
                }
            }
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki);
            squareToAdd.add(checkj);

            validSquares.add(squareToAdd);
        }

        // up right
        checki = i1;
        checkj = j1;
        while (checki<7 && checkj>0) {
            checki += 1;
            checkj -= 1;
            if(b[checki][checkj].hasPiece()){
                if(b[checki][checkj].getPiece().colour == this.colour){
                    break;
                }
            }
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki);
            squareToAdd.add(checkj);

            validSquares.add(squareToAdd);
        }

        // down left
        checki = i1;
        checkj = j1;
        while (checki>0 && checkj<7) {
            checki -= 1;
            checkj += 1;
            if(b[checki][checkj].hasPiece()){
                if(b[checki][checkj].getPiece().colour == this.colour){
                    break;
                }
            }
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki);
            squareToAdd.add(checkj);

            validSquares.add(squareToAdd);
        }

        // up left
        checki = i1;
        checkj = j1;
        while (checki>0 && checkj>0) {
            checki -= 1;
            checkj -= 1;
            if(b[checki][checkj].hasPiece()){
                if(b[checki][checkj].getPiece().colour == this.colour){
                    break;
                }
            }
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki);
            squareToAdd.add(checkj);

            validSquares.add(squareToAdd);
        }


        ArrayList<Integer> newCoordinate = new ArrayList<Integer>();
        newCoordinate.add(i2);
        newCoordinate.add(j2);
        for(int i = 0; i < validSquares.size(); i++){
            boolean equal = newCoordinate.equals(validSquares.get(i));
            if(equal) {
                return true;
            }    
        }
        return false;
    }
}
