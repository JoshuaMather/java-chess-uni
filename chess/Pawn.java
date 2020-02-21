package chess;
import java.util.ArrayList;
/*
white U+2659
black U+265F
*/

public class Pawn extends Piece{	
    public Pawn(PieceColour colourOfPiece){
        this.colour = colourOfPiece;
    }

    public boolean isLegitMove(int i1, int j1, int i2, int j2){
        ArrayList<ArrayList<Integer>> validSquares = new ArrayList<ArrayList<Integer>>();
        Square[][] b = Board.getBoard();

        //white
        if(b[i1][j1].getPiece().colour == PieceColour.WHITE){
            if (i1-1 >= 0){
                if(!b[i1-1][j1].hasPiece()){
                    if(i1==6){
                        if (i1-2 >= 0){
                            if(!b[i1-2][j1].hasPiece()){
                                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                                squareToAdd.add(i1-2);
                                squareToAdd.add(j1);
                    
                                validSquares.add(squareToAdd);
                            }
                        }
                    }
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(i1-1);
                    squareToAdd.add(j1);
                    
                    validSquares.add(squareToAdd);

                }
            }
            if(i1-1 >= 0 && j1-1 >= 0){
                if(b[i1-1][j1-1].hasPiece()){
                    if(b[i1-1][j1-1].getPiece().colour != this.colour){
                        ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                        squareToAdd.add(i1-1);
                        squareToAdd.add(j1-1);
                        
                        validSquares.add(squareToAdd);
                    }

                }

            }
            if(i1-1 >= 0 && j1+1 <= 7){
                if(b[i1-1][j1+1].hasPiece()){
                    if(b[i1-1][j1+1].getPiece().colour != this.colour){
                        ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                        squareToAdd.add(i1-1);
                        squareToAdd.add(j1+1);
                        
                        validSquares.add(squareToAdd);
                    }
            }

        }
    }

        //black
        if(b[i1][j1].getPiece().colour == PieceColour.BLACK){
            if (i1+1 <= 7){
                if(!b[i1+1][j1].hasPiece()){
                    if(i1==1){
                        if (i1+2 <= 7){
                            if(!b[i1+2][j1].hasPiece()){
                                ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                                squareToAdd.add(i1+2);
                                squareToAdd.add(j1);
                    
                                validSquares.add(squareToAdd);
                            }
                        }
                    }
                    ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                    squareToAdd.add(i1+1);
                    squareToAdd.add(j1);
                    
                    validSquares.add(squareToAdd);

                }
            }
            if(i1+1 <= 7 && j1-1 >= 0){
                if(b[i1+1][j1-1].hasPiece()){
                    if(b[i1+1][j1-1].getPiece().colour != this.colour){
                        ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                        squareToAdd.add(i1+1);
                        squareToAdd.add(j1-1);
                        
                        validSquares.add(squareToAdd);
                    }

                }

            }
            if(i1+1 <= 7 && j1+1 <= 7){
                if(b[i1+1][j1+1].hasPiece()){
                    if(b[i1+1][j1+1].getPiece().colour != this.colour){
                        ArrayList<Integer> squareToAdd = new ArrayList<Integer>();
                        squareToAdd.add(i1+1);
                        squareToAdd.add(j1+1);
                        
                        validSquares.add(squareToAdd);
                    }
                }
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
        
