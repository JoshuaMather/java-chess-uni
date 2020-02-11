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
		bp1.setSymbol("U+265F");
		Pawn bp2 = new Pawn(PieceColour.BLACK);
		bp2.setSymbol("U+265F");
		Pawn bp3 = new Pawn(PieceColour.BLACK);
		bp3.setSymbol("U+265F");
		Pawn bp4 = new Pawn(PieceColour.BLACK);
		bp4.setSymbol("U+265F");
		Pawn bp5 = new Pawn(PieceColour.BLACK);
		bp5.setSymbol("U+265F");
		Pawn bp6 = new Pawn(PieceColour.BLACK);
		bp6.setSymbol("U+265F");
		Pawn bp7 = new Pawn(PieceColour.BLACK);
		bp7.setSymbol("U+265F");
		Pawn bp8 = new Pawn(PieceColour.BLACK);
		bp8.setSymbol("U+265F");

		Rook br1 = new Rook(PieceColour.BLACK);
		br1.setSymbol("U+265C");
		Rook br2 = new Rook(PieceColour.BLACK);
		br2.setSymbol("U+265C");

		Knight bk1 = new Knight(PieceColour.BLACK);
		bk1.setSymbol("U+265E");
		Knight bk2 = new Knight(PieceColour.BLACK);
		bk2.setSymbol("U+265E");

		Bishop bb1 = new Bishop(PieceColour.BLACK);
		bb1.setSymbol("U+265D");
		Bishop bb2 = new Bishop(PieceColour.BLACK);
		bb2.setSymbol("U+265D");

		Queen bq1 = new Queen(PieceColour.BLACK);
		King bki1 = new King(PieceColour.BLACK);

		// white
		Pawn wp1 = new Pawn(PieceColour.WHITE);
		wp1.setSymbol("U+2659");
		Pawn wp2 = new Pawn(PieceColour.WHITE);
		wp2.setSymbol("U+2659");
		Pawn wp3 = new Pawn(PieceColour.WHITE);
		wp3.setSymbol("U+2659");
		Pawn wp4 = new Pawn(PieceColour.WHITE);
		wp4.setSymbol("U+2659");
		Pawn wp5 = new Pawn(PieceColour.WHITE);
		wp5.setSymbol("U+2659");
		Pawn wp6 = new Pawn(PieceColour.WHITE);
		wp6.setSymbol("U+2659");
		Pawn wp7 = new Pawn(PieceColour.WHITE);
		wp7.setSymbol("U+2659");
		Pawn wp8 = new Pawn(PieceColour.WHITE);
		wp8.setSymbol("U+2659");

		Rook wr1 = new Rook(PieceColour.WHITE);
		wr1.setSymbol("U+2656");
		Rook wr2 = new Rook(PieceColour.WHITE);
		wr2.setSymbol("U+2656");

		Knight wk1 = new Knight(PieceColour.WHITE);
		wk1.setSymbol("U+2658");
		Knight wk2 = new Knight(PieceColour.WHITE);
		wk2.setSymbol("U+2658");

		Bishop wb1 = new Bishop(PieceColour.WHITE);
		wb1.setSymbol("U+2657");
		Bishop wb2 = new Bishop(PieceColour.WHITE);
		wb2.setSymbol("U+2657");

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
		board[i0][j0].removePiece();
		

		p.updateCoordinates(i1, j1);
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
