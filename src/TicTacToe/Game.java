package TicTacToe;

import java.util.Scanner;

public class Game {
	
	private Board board;
	private Player player1;
	private Player player2;
	private Player turn;
	private Scanner scanner;
	private Player winner;
	}



	public Game(Board board,Player player1, Player player2) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		scanner = new Scanner(System.in);
		this.turn = player1;
		start();
	}
	
	public void start() {
		while(winner == null) {
			move();
			System.out.println(board.toString());
		}
	}
	private boolean checkForWinner() {
		Char grid[][] = board.getGrid();
		return grid[0][0] == (grid[0][1]) && grid[0][0] == (grid[0][2]));
		
	}
	public void move() {
		System.out.println("Player " + turn.getToken() + "'s turn.");
		System.out.println("Enter x: ");
		int x = scanner.nextInt();
		System.out.println("Enter Y: ");
		int y = scanner.nextInt();
		if (board.placeCharacter(turn.getToken(), x, y)) {
			switchTurn();
		} else {
			System.out.println("Please choose and open spot.");
	}
	
