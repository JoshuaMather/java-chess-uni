package chess;


//This class is partially implemented 
public class Square {
	private int i;
	private int j;
	private boolean hasPiece;
	private Piece p;
	
	public Square(int iIn, int jIn){
		this.i=iIn;
		this.j=jIn;
	}
	
	
	public boolean hasPiece(){
		return this.hasPiece;
	}

	public Piece getPiece(){
		return this.p;
	}

	public void setPiece(Piece pieceToSet){
		this.p = pieceToSet;
		this.hasPiece = true;
	}

	public void removePiece(){
		this.hasPiece = false;
		this.p = null;
	}

	public int geti(){
		return i;
	}

	public int getj(){
		return j;
	}
	
}
