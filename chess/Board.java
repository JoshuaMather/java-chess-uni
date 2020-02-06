package chess;


//This class is partially implemented. Some methods need to have their body written, some other are fine as they are and other may need to be extended. 

public class Board {
	private static Square [][] board = new Square[8][8];

	public Board(){
		for (int i=0; i<board[0].length; i++){
			for (int j=0; j<board[1].length; j++)
					board[i][j]=new Square(i,j);
		}		
	}	

	public static Square[][] getBoard(){
		return board;
	}
	
	public void initialisePieces(){
		// black
		Pawn bp1 = new Pawn(PieceColour.BLACK);
		Pawn bp2 = new Pawn(PieceColour.BLACK);
		Pawn bp3 = new Pawn(PieceColour.BLACK);
		Pawn bp4 = new Pawn(PieceColour.BLACK);
		Pawn bp5 = new Pawn(PieceColour.BLACK);
		Pawn bp6 = new Pawn(PieceColour.BLACK);
		Pawn bp7 = new Pawn(PieceColour.BLACK);
		Pawn bp8 = new Pawn(PieceColour.BLACK);

		Rook br1 = new Rook(PieceColour.BLACK);
		Rook br2 = new Rook(PieceColour.BLACK);

		Knight bk1 = new Knight(PieceColour.BLACK);
		Knight bk2 = new Knight(PieceColour.BLACK);

		Bishop bb1 = new Bishop(PieceColour.BLACK);
		Bishop bb2 = new Bishop(PieceColour.BLACK);

		Queen bq1 = new Queen(PieceColour.BLACK);
		King bki1 = new King(PieceColour.BLACK);

		// white
		Pawn wp1 = new Pawn(PieceColour.WHITE);
		Pawn wp2 = new Pawn(PieceColour.WHITE);
		Pawn wp3 = new Pawn(PieceColour.WHITE);
		Pawn wp4 = new Pawn(PieceColour.WHITE);
		Pawn wp5 = new Pawn(PieceColour.WHITE);
		Pawn wp6 = new Pawn(PieceColour.WHITE);
		Pawn wp7 = new Pawn(PieceColour.WHITE);
		Pawn wp8 = new Pawn(PieceColour.WHITE);

		Rook wr1 = new Rook(PieceColour.WHITE);
		Rook wr2 = new Rook(PieceColour.WHITE);

		Knight wk1 = new Knight(PieceColour.WHITE);
		Knight wk2 = new Knight(PieceColour.WHITE);

		Bishop wb1 = new Bishop(PieceColour.WHITE);
		Bishop wb2 = new Bishop(PieceColour.WHITE);

		Queen wq1 = new Queen(PieceColour.WHITE);
		King wki1 = new King(PieceColour.WHITE);
	}
	
	public void printBoard(){
		System.out.print("\n  a b c d e f g h \n");
		System.out.print("  -----------------\n");
		String wsp=" ";String bar="|";
		
		for (int i=0; i<board[0].length; i++){
			int row=i+1;
				for (int j=0; j<board[1].length; j++){
					if ((j==0) && board[i][j].hasPiece())
						System.out.print(row+" ");	
					else if ((j==0) && !board[i][j].hasPiece())
						System.out.print(row+"  " );
					else if (board[i][j].hasPiece())					
						System.out.print("|");					
					else					
						System.out.print("| ");		
				}				
				System.out.print("  "+row+"\n");
		}
		System.out.print("  -----------------");
		System.out.print("\n  a b c d e f g h \n");
	
	}
	
	
	public boolean movePiece(int i0, int j0, int i1, int j1, Piece p){
		return false;
	}

	public void setPiece(int iIn, int jIn, Piece p){
	}
	
	public Piece getPiece(int iIn, int jIn){
		return new Piece();
	}
	
	public boolean hasPiece(int i, int j){		
		return false;
	}

}
