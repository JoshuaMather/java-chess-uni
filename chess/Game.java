package chess;
import java.io.Console;
/*path 
/mnt/d/University/Year\ 1/Computer\ Science/GitRepos/comp16412-coursework-1_p54507jm

git
/d/University/Year\ 1/Computer\ Science/GitRepos/comp16412-coursework-1_p54507jm
*/

public class Game {
	private static boolean gameEnd=false;

	public Game(){
		Board b = new Board();
		b.initialisePieces();
		b.printBoard();
		boolean whiteMove = true;
		while (!gameEnd){
			//write the game logic
			b.getPiece(1,2);
			if (whiteMove){
			System.out.println("------ Whites move -----");
			}
			else{
			System.out.println("------ Blacks move -----");

			}

			Console keyboardConsole = System.console();

			String inputO = keyboardConsole.readLine("Enter Origin: ");
			if (inputO.equals("END")){
				gameEnd = true;
			}

			boolean validOrigin = false;
			Character i1C = '\u0000';
			Character j1C = '\u0000';
			int i1 = 0;
			int j1 = 0;
			if(CheckInput.checkCoordinateValidity(inputO)){
				i1C = inputO.charAt(0);
				j1C = inputO.charAt(1);

				i1 = i1C - '0';
				i1 = i1 - 1;

				switch(j1C){
					case 'a':
						j1C = '0';
						j1 = j1C - '0';
						break;
					case 'b':
						j1C = '1';
						j1 = j1C - '0';
						break;
					case 'c':
						j1C = '2';
						j1 = j1C - '0';
						break;
					case 'd':
						j1C = '3';
						j1 = j1C - '0';
						break;
					case 'e':
						j1C = '4';
						j1 = j1C - '0';
						break;
					case 'f':
						j1C = '5';
						j1 = j1C - '0';
						break;
					case 'g':
						j1C = '6';
						j1 = j1C - '0';
						break;
					case 'h':
						j1C = '7';
						j1 = j1C - '0';
						break;
				}


				validOrigin = true;
			}

			String inputD = keyboardConsole.readLine("Enter Destination: ");
			if (inputO.equals("END")){
				gameEnd = true;
			}

			boolean validDestination = false;
			Character i2C = '\u0000';
			Character j2C = '\u0000';
			int i2 = 0;
			int j2 = 0;
			if(CheckInput.checkCoordinateValidity(inputD)){
				i2C = inputD.charAt(0);
				j2C = inputD.charAt(1);

				i2 = i2C - '0';
				i2 = i2 - 1;

				switch(j2C){
					case 'a':
						j2C = '0';
						j2 = j2C - '0';
						break;
					case 'b':
						j2C = '1';
						j2 = j2C - '0';
						break;
					case 'c':
						j2C = '2';
						j2 = j2C - '0';
						break;
					case 'd':
						j2C = '3';
						j2 = j2C - '0';
						break;
					case 'e':
						j2C = '4';
						j2 = j2C - '0';
						break;
					case 'f':
						j2C = '5';
						j2 = j2C - '0';
						break;
					case 'g':
						j2C = '6';
						j2 = j2C - '0';
						break;
					case 'h':
						j2C = '7';
						j2 = j2C - '0';
						break;
				}

				validDestination = true;
			}
			

			if(validOrigin && validDestination){
				if(b.hasPiece(i1, j1)){
					Piece pieceToMove = b.getPiece(i1, j1);
					if((whiteMove && pieceToMove.colour == PieceColour.WHITE) || (!whiteMove && pieceToMove.colour == PieceColour.BLACK)){
						if(pieceToMove.isLegitMove(i1, j1, i2, j2)){
							if(b.movePiece(i1, j1, i2, j2, pieceToMove)){
								gameEnd = !gameEnd;
								if(whiteMove){
									System.out.println("White is the winner!");
								}
								else{
									System.out.println("Black is the winner!");
								}
							}
							whiteMove = !whiteMove;

						}
						else{
							System.out.println("Invalid move");
							System.out.println("");
							continue;
						}
					}
					else{
						System.out.println("Invalid piece to move");
						System.out.println("");
						continue;
					}

				}
				else{
					System.out.println("No piece on this square\n");
					System.out.println("");
					continue;
				}


			}
			else{
				System.out.println("Invalid input\n");
				System.out.println("");
				continue;
			}

			b.printBoard();
			System.out.println("");
		}		
	}
	
	
	public static void main (String args[]){
		Game g  = new Game();
	}
}
