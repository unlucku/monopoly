import java.util.Scanner;

public class monopoly {
	static piece player1;
	static piece player2;
	static Scanner s;
public static void main(String[] args) {
	System.out.println("========================Monopoly========================");
	board.initializeBoard();
	player1 = new piece(1);
	player2 = new piece(2);
	board.displayBoard();
	int move = 1;
	s = new Scanner(System.in);
	while(true) {
		System.out.println("Player " + move + " is now rolling!");
		System.out.println(util.getPlayer(move).toString());
		System.out.println("Press enter to roll the dice" );
		s.nextLine();
		int roll = util.rollDice();
		System.out.println("You rolled a " + roll);
		util.getPlayer(move).move(roll);
		System.out.println("You landed on: " + board.game[util.getPlayer(move).getPos()].getName());
		if (!board.game[util.getPlayer(move).getPos()].isSpecial() && !board.game[util.getPlayer(move).getPos()].hasOwner()) {
		System.out.println("Would you like to buy the property?");
		if (util.getInput()) {
			util.getPlayer(move).buyProperty();
		 }
		}
		board.displayBoard();
		if (move == 1) move = 2;
		else move = 1;
		continue;
	}
 }
}
