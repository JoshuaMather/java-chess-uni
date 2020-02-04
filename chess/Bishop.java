package chess;
import java.util.ArrayList;
/*
white U+2657	
black U+265D
 */

public class Bishop {
    Bishop(PieceColour colourofPiece){

    }

    public static boolean isLegitmove(int i1, int j1, int i2, int j2){
        /*
        create list of diagonals
        see if second coordinate is in list
        */
        ArrayList<ArrayList<Integer>> validSquares = new ArrayList<ArrayList<Integer>>();
    
        // down right
        int checki = i1;
        int checkj = j1;
        while (checki<7 && checkj<7) {
            checki += 1;
            checkj += 1;
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
            ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
            squareToAdd.add(checki);
            squareToAdd.add(checkj);

            validSquares.add(squareToAdd);

        }
      

        System.out.print(validSquares);
       /* if(validSquares.contains([i2,j2])){
            System.out.print("yes");
            return true;
        }*/

        int arraySize = validSquares.size()
        for(int i; i < validSquares.size(); i++){
            if(validSquares[i][0] == i2 
            System.out.print("yes");
            return true;
        }
        System.out.print("no");
        return false;
    }
}
