package chess.chessv1;

public class ChessGameV1 {
	public static final int BLACK = 0, RED = 1;
	Chess[] black;
	Chess[] red;

	public static void main(String args[]) {
		// initialize the game
		ChessGameV1 game = new ChessGameV1();
		game.generateChess();
		game.showAllChess();
	}

	void showAllChess() {
		for (Chess c : black) {
			System.out.println(c);
		}
		for (Chess c : red) {
			System.out.println(c);
		}
	}

	void generateChess() {
		black = new Chess[] { new Chess("bKing", 1, BLACK, 0),
				new Chess("bGuard", 2, BLACK, 1),
				new Chess("bGuard", 2, BLACK, 2),
				new Chess("bElephant", 3, BLACK, 3),
				new Chess("bElephant", 3, BLACK, 4),
				new Chess("bRook", 3, BLACK, 5),
				new Chess("bRook", 3, BLACK, 6),
				new Chess("bHorse", 3, BLACK, 7),
				new Chess("bHorse", 3, BLACK, 8),
				new Chess("bCannon", 3, BLACK, 9),
				new Chess("bCannon", 3, BLACK, 10),
				new Chess("bSolider", 3, BLACK, 11),
				new Chess("bSolider", 3, BLACK, 12),
				new Chess("bSolider", 3, BLACK, 13),
				new Chess("bSolider", 3, BLACK, 14),
				new Chess("bSolider", 3, BLACK, 15), };

		red = new Chess[] { new Chess("rKing", 1, RED, 16),
				new Chess("rGuard", 2, RED, 17),
				new Chess("rGuard", 2, RED, 18),
				new Chess("rElephant", 3, RED, 19),
				new Chess("rElephant", 3, BLACK, 20),
				new Chess("rRook", 3, BLACK, 21),
				new Chess("rRook", 3, BLACK, 22),
				new Chess("rHorse", 3, BLACK, 23),
				new Chess("rHorse", 3, BLACK, 24),
				new Chess("rCannon", 3, BLACK, 25),
				new Chess("rCannon", 3, BLACK, 26),
				new Chess("rSolider", 3, BLACK, 27),
				new Chess("rSolider", 3, BLACK, 28),
				new Chess("rSolider", 3, BLACK, 29),
				new Chess("rSolider", 3, BLACK, 30),
				new Chess("rSolider", 3, BLACK, 31), };

		// change black's location
		for (int i = 0; i < 16; i++) {
			int target = (int) (Math.random() * 32);
			if (target < 16) {
				int originalLoc = black[i].loc;
				black[i].loc = target;
				black[target].loc = originalLoc;
			} else if (target < 32) {
				target -= 16;
				int originalLoc = black[i].loc;
				black[i].loc = target;
				red[target].loc = originalLoc;
			} else {
				System.out.println("Location Error");
			}
		}

	}
}

class Chess {
	public Chess(String name, int weight, int side, int loc) {
		this.name = name;
		this.weight = weight;
		this.side = side;
		this.loc = loc;
	}

	String name;
	int weight;
	int side;
	int loc;

	public String toString() {
		return name + ", " + weight + ", loc=" + loc;
	}

}