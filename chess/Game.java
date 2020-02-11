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
			Character j1 = '\u0000';
			int i1 = 0;
			if(CheckInput.checkCoordinateValidity(inputO)){
				i1C = inputO.charAt(0);
				j1 = inputO.charAt(1);

				i1 = i1C - '0';
				i1 = i1 - 1;

				switch(j1){
					case 'a':
						j1 = 0;
						break;
					case 'b':
						j1 = 1;
						break;
					case 'c':
						j1 = 2;
						break;
					case 'd':
						j1 = 3;
						break;
					case 'e':
						j1 = 4;
						break;
					case 'f':
						j1 = 5;
						break;
					case 'g':
						j1 = 6;
						break;
					case 'h':
						j1 = 7;
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
			Character j2 = '\u0000';
			int i2 = 0;
			if(CheckInput.checkCoordinateValidity(inputD)){
				i2C = inputO.charAt(0);
				j2 = inputO.charAt(1);

				i2 = i2C - '0';
				i2 = i2 - 1;

				switch(j2){
					case 'a':
						j2 = 0;
						break;
					case 'b':
						j2 = 1;
						break;
					case 'c':
						j2 = 2;
						break;
					case 'd':
						j2 = 3;
						break;
					case 'e':
						j2 = 4;
						break;
					case 'f':
						j2 = 5;
						break;
					case 'g':
						j2 = 6;
						break;
					case 'h':
						j2 = 7;
						break;
				}

				validDestination = true;
			}
			

			if(validOrigin && validDestination){
				if(b.hasPiece(i1, j1)){
					Piece pieceToMove = b.getPiece(i1, j1);
					b.movePiece(i1, j1, i2, j2, pieceToMove);
					if(b.movePiece(i1, j1, i2, j2, pieceToMove)){
						gameEnd = !gameEnd;
						if(whiteMove){
							System.out.println("White is the winner!");
						}
						else{
							System.out.println("Black is the winner!");
						}
					}
				}
				else{
					System.out.println("No piece on this square\n");
					continue;
				}


			}
			else{
				System.out.println("Invalid input\n");
				continue;
			}

			b.printBoard();
			whiteMove = !whiteMove;
		}		
	}
	
	
	public static void main (String args[]){
		Game g  = new Game();
	}
}
