package chess;
import java.util.ArrayList;
/*
white U+2658
black U+265E
*/

public class Knight extends Piece{
    Knight(PieceColour colourOfPiece){
        this.colour = colourOfPiece;
    }

    public boolean isLegitmove(int i1, int j1, int i2, int j2){
        // create list of possible moves and see if new coordinate is in it

        ArrayList<ArrayList<Integer>> validSquares = new ArrayList<ArrayList<Integer>>();
        int checki = i1;
        int checkj = j1;

        if (checki-2 >= 0 && checkj+1 <= 7){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki-2);
            squareToAdd.add(checkj+1);

            validSquares.add(squareToAdd);
        }

         if (checki-1 >= 0 && checkj+2 <= 7){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki-1);
            squareToAdd.add(checkj+2);

            validSquares.add(squareToAdd);
        }
        
         if (checki+1 <= 7 && checkj+2 <= 7){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki+1);
            squareToAdd.add(checkj+2);

            validSquares.add(squareToAdd);
        }
        
         if (checki+2 <= 7 && checkj+1 <= 7){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki+2);
            squareToAdd.add(checkj+1);

            validSquares.add(squareToAdd);
        }
        
         if (checki+2 <= 7 && checkj-1 >= 0){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki+2);
            squareToAdd.add(checkj-1);

            validSquares.add(squareToAdd);
        }
        
         if (checki+1 <= 7 && checkj-2 >= 0){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki+1);
            squareToAdd.add(checkj-2);

            validSquares.add(squareToAdd);
        }
        
         if (checki-1 >= 0 && checkj-2 >= 0){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki-1);
            squareToAdd.add(checkj-2);

            validSquares.add(squareToAdd);
        }
        
         if (checki-2 >= 0 && checkj-1 >= 0){
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki-2);
            squareToAdd.add(checkj-1);

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
