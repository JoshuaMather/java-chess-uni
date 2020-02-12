package chess;


//This class is partially implemented 
public class Square {
	private int i;
	private int j;
	private boolean hasPiece = false;
	private Piece p;
	
	public Square(int iIn, int jIn){
		i=iIn;
		j=jIn;
	}
	
	
	public boolean hasPiece(){
		return hasPiece;
	}

	public Piece getPiece(){
		return p;
	}

	public void setPiece(Piece pieceToSet){
		p = pieceToSet;
		hasPiece = !hasPiece;
	}

	public void removePiece(){
		hasPiece = false;
		System.out.println(hasPiece);
		p = null;
	}

	public int geti(){
		return i;
	}

	public int getj(){
		return j;
	}
	
}
