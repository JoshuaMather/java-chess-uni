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
		bp1.setSymbol("\u265F");
		board[1][0].setPiece(bp1);
		Pawn bp2 = new Pawn(PieceColour.BLACK);
		bp2.setSymbol("\u265F");
		board[1][1].setPiece(bp2);
		Pawn bp3 = new Pawn(PieceColour.BLACK);
		bp3.setSymbol("\u265F");
		board[1][2].setPiece(bp3);
		Pawn bp4 = new Pawn(PieceColour.BLACK);
		bp4.setSymbol("\u265F");
		board[1][3].setPiece(bp4);
		Pawn bp5 = new Pawn(PieceColour.BLACK);
		bp5.setSymbol("\u265F");
		board[1][4].setPiece(bp5);
		Pawn bp6 = new Pawn(PieceColour.BLACK);
		bp6.setSymbol("\u265F");
		board[1][5].setPiece(bp6);
		Pawn bp7 = new Pawn(PieceColour.BLACK);
		bp7.setSymbol("\u265F");
		board[1][6].setPiece(bp7);
		Pawn bp8 = new Pawn(PieceColour.BLACK);
		bp8.setSymbol("\u265F");
		board[1][7].setPiece(bp8);

		Rook br1 = new Rook(PieceColour.BLACK);
		br1.setSymbol("\u265C");
		board[0][0].setPiece(br1);
		Rook br2 = new Rook(PieceColour.BLACK);
		br2.setSymbol("\u265C");
		board[0][7].setPiece(br2);

		Knight bk1 = new Knight(PieceColour.BLACK);
		bk1.setSymbol("\u265E");
		board[0][1].setPiece(bk1);
		Knight bk2 = new Knight(PieceColour.BLACK);
		bk2.setSymbol("\u265E");
		board[0][6].setPiece(bk2);

		Bishop bb1 = new Bishop(PieceColour.BLACK);
		bb1.setSymbol("\u265D");
		board[0][2].setPiece(bb1);
		Bishop bb2 = new Bishop(PieceColour.BLACK);
		bb2.setSymbol("\u265D");
		board[0][5].setPiece(bb2);

		Queen bq1 = new Queen(PieceColour.BLACK);
		bq1.setSymbol("\u265B");
		board[0][3].setPiece(bq1);
		King bki1 = new King(PieceColour.BLACK);
		bki1.setSymbol("\u265A");
		board[0][4].setPiece(bki1);

		// white
		Pawn wp1 = new Pawn(PieceColour.WHITE);
		wp1.setSymbol("\u2659");
		board[6][0].setPiece(wp1);
		Pawn wp2 = new Pawn(PieceColour.WHITE);
		wp2.setSymbol("\u2659");
		board[6][1].setPiece(wp2);
		Pawn wp3 = new Pawn(PieceColour.WHITE);
		wp3.setSymbol("\u2659");
		board[6][2].setPiece(wp3);
		Pawn wp4 = new Pawn(PieceColour.WHITE);
		wp4.setSymbol("\u2659");
		board[6][3].setPiece(wp4);
		Pawn wp5 = new Pawn(PieceColour.WHITE);
		wp5.setSymbol("\u2659");
		board[6][4].setPiece(wp5);
		Pawn wp6 = new Pawn(PieceColour.WHITE);
		wp6.setSymbol("\u2659");
		board[6][5].setPiece(wp6);
		Pawn wp7 = new Pawn(PieceColour.WHITE);
		wp7.setSymbol("\u2659");
		board[6][6].setPiece(wp7);
		Pawn wp8 = new Pawn(PieceColour.WHITE);
		wp8.setSymbol("\u2659");
		board[6][7].setPiece(wp8);

		Rook wr1 = new Rook(PieceColour.WHITE);
		wr1.setSymbol("\u2656");
		board[7][0].setPiece(wr1);
		Rook wr2 = new Rook(PieceColour.WHITE);
		wr2.setSymbol("\u2656");
		board[7][7].setPiece(wr2);

		Knight wk1 = new Knight(PieceColour.WHITE);
		wk1.setSymbol("\u2658");
		board[7][1].setPiece(wk1);
		Knight wk2 = new Knight(PieceColour.WHITE);
		wk2.setSymbol("\u2658");
		board[7][6].setPiece(wk2);

		Bishop wb1 = new Bishop(PieceColour.WHITE);
		wb1.setSymbol("\u2657");
		board[7][2].setPiece(wb1);
		Bishop wb2 = new Bishop(PieceColour.WHITE);
		wb2.setSymbol("\u2657");
		board[7][5].setPiece(wb2);

		Queen wq1 = new Queen(PieceColour.WHITE);
		wq1.setSymbol("\u2655");
		board[7][3].setPiece(wq1);
		King wki1 = new King(PieceColour.WHITE);
		wki1.setSymbol("\u2654");
		board[7][4].setPiece(wki1);
	}
	
	public void printBoard(){
		System.out.print("\n  a b c d e f g h \n");
		System.out.print("  -----------------\n");
		String wsp=" ";String bar="|";
		
		for (int i=0; i<board[0].length; i++){
			int row=i+1;
				for (int j=0; j<board[1].length; j++){
					if ((j==0) && board[i][j].hasPiece())
						System.out.print(row+" "+board[i][j].getPiece().getSymbol());	
					else if ((j==0) && !board[i][j].hasPiece())
						System.out.print(row+"  " );
					else if (board[i][j].hasPiece())					
						System.out.print("|"+board[i][j].getPiece().getSymbol());					
					else					
						System.out.print("| ");		
				}				
				System.out.print("  "+row+"\n");
		}
		System.out.print("  -----------------");
		System.out.print("\n  a b c d e f g h \n");
	}
	
	
	public boolean movePiece(int i0, int j0, int i1, int j1, Piece p){
		// return true if king captured

			if(board[i1][j1].getPiece() instanceof King){
				board[i1][j1].setPiece(p);
				board[i1][j1].hasPiece();
				
				p.updateCoordinates(i1, j1);
				board[i0][j0].removePiece();

				return true;
			}
			board[i1][j1].setPiece(p);
			board[i1][j1].hasPiece();

			p.updateCoordinates(i1, j1);
			board[i0][j0].removePiece();

		return false;
	}

	public void setPiece(int iIn, int jIn, Piece p){
		board[iIn][jIn].setPiece(p);
	}
	
	public Piece getPiece(int iIn, int jIn){
		return board[iIn][jIn].getPiece();
	}
	
	public boolean hasPiece(int i, int j){		
		return board[i][j].hasPiece();
	}

}
