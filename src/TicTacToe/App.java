package TicTacToe;

public class App {

	public static void main(String[] args) {
		
		Board board = new Board();
		Player x = new Player('x');
		Player o = new Player('o');
		Game game = new Game(board, x, o);
		
		
	}

}
