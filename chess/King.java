package chess;
import java.util.ArrayList;
/*
white U+2654
black U+265A
 */

public class King extends Piece{
    public King(PieceColour colourOfPiece){
        this.colour = colourOfPiece;
    }

    public boolean isLegitMove(int i1, int j1, int i2, int j2){
        // create list of possible moves and see if new coordinate is one of these moves

        ArrayList<ArrayList<Integer>> validSquares = new ArrayList<ArrayList<Integer>>();
        int checki = i1;
        int checkj = j1;
        Square[][] b = Board.getBoard();

        // up
        if (checki-1 >= 0){
            if(b[checki-1][checkj].hasPiece()){
                if(b[checki-1][checkj].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki - 1);
                    squareToAdd.add(checkj);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki - 1);
                squareToAdd.add(checkj);
    
                validSquares.add(squareToAdd);
            }
        }

         // up right
         if (checki-1 >= 0 && checkj+1 <= 7){
            if(b[checki-1][checkj+1].hasPiece()){
                if(b[checki-1][checkj+1].getPiece().colour == this.colour){     
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki-1);
                    squareToAdd.add(checkj+1);
        
                    validSquares.add(squareToAdd);

                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki-1);
                squareToAdd.add(checkj+1);
    
                validSquares.add(squareToAdd);
            }
        }
        
         // right
         if (checkj+1 <= 7){
            if(b[checki][checkj+1].hasPiece()){
                if(b[checki][checkj+1].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki);
                    squareToAdd.add(checkj+1);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki);
                squareToAdd.add(checkj+1);
    
                validSquares.add(squareToAdd);
            }
        }
        
         // down right
         if (checki+1 <= 7 && checkj+1 <= 7){
            if(b[checki+1][checkj+1].hasPiece()){
                if(b[checki+1][checkj+1].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki+1);
                    squareToAdd.add(checkj+1);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki+1);
                squareToAdd.add(checkj+1);
    
                validSquares.add(squareToAdd);
            }
        }
        
         // down
         if (checki+1 <= 7){
            if(b[checki+1][checkj].hasPiece()){
                if(b[checki+1][checkj].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki+1);
                    squareToAdd.add(checkj);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki+1);
                squareToAdd.add(checkj);
    
                validSquares.add(squareToAdd);
            }

        }
        
         // down left
         if (checki+1 <= 7 && checkj-1 >= 0){
            if(b[checki+1][checkj-1].hasPiece()){
                if(b[checki+1][checkj-1].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki+1);
                    squareToAdd.add(checkj-1);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki+1);
                squareToAdd.add(checkj-1);
    
                validSquares.add(squareToAdd);
            }
        }
        
         // left
         if (checkj-1 >= 0){
            if(b[checki][checkj-1].hasPiece()){
                if(b[checki][checkj-1].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki);
                    squareToAdd.add(checkj-1);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki);
                squareToAdd.add(checkj-1);
    
                validSquares.add(squareToAdd);
            }
        }
        
         // up left
         if (checki-1 >= 0 && checkj-1 >= 0){
            if(b[checki-1][checkj-1].hasPiece()){
                if(b[checki-1][checkj-1].getPiece().colour == this.colour){
                    
                }
                else{
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(checki-1);
                    squareToAdd.add(checkj-1);
        
                    validSquares.add(squareToAdd);
                }
            }
            else{
                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                squareToAdd.add(checki-1);
                squareToAdd.add(checkj-1);
    
                validSquares.add(squareToAdd);
            }
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
