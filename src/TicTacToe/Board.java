package TicTacToe;

public class Board {

	private char[][] grid = new char[3][3];
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				result.append((grid[i][j] == null ? "_" : grid [i][j] )+ " ");
			}
			result.append("\n");
		}
		return result.toString();
	}
	
	public Board() {
		System.out.println(grid[1][1]);
	}
	
	public boolean placeCharacter(char c, int x, int y) {
		if (grid[x][y] == null) {
			grid[x][y] = c;
			return true;
	}
	return false;
	}
}
