

public class monopoly {
public static void main(String[] args) {
	System.out.println("========================Monopoly========================");
	System.out.println("This is a 2 player game. There are 40 properties.");
	board monopolyBoard = new board();
	monopolyBoard.initializeBoard();
	monopolyBoard.displayBoard();
}
}
