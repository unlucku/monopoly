

public class monopoly {
public static void main(String[] args) {
	System.out.println("========================Monopoly========================");
	System.out.println("This is a 2 player game. There are 40 properties. Standard rules apply.");
	board.initializeBoard();
	piece player1 = new piece(1);
	piece player2 = new piece(2);
	board.displayBoard();
}
}
