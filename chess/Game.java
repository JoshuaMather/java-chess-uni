package chess;
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
		while (!gameEnd){
			//write the game logic
			/*System.out.println("------ Whites move -----");

			b.printBoard();
			System.out.println("------ Blacks move -----");
			b.printBoard();*/
			Knight b1 = new Knight(PieceColour.BLACK);
			Knight.isLegitmove(4,4,3,4);
			break;
		}		
	}
	
	
	public static void main (String args[]){
		Game g  = new Game();
	}
}
