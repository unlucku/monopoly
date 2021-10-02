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
		else if(board.game[util.getPlayer(move).getPos()].hasOwner()) {
			System.out.println("You have to pay rent of: $" + board.game[util.getPlayer(move).getPos()].getRent());
			util.getPlayer(move).payRent();
		}
		else if(board.game[util.getPlayer(move).getPos()].isSpecial()) {
			specialProperties.effect(board.game[util.getPlayer(move).getPos()], move);
		}
		while(true) {
		System.out.println(util.getPlayer(move).toString());
		System.out.println("Choose one of the following options");
		System.out.println("1. End turn");
		System.out.println("2. Sell property");
		System.out.println("3. Add mortgage");
		System.out.println("4. Remove mortgage");
		System.out.println("5. Build House");
		int option = s.nextInt();
		s.nextLine();
		if (option == 1) break;
		else if (option == 2) {
			System.out.println("Which property would you like to sell?");
			util.getPlayer(move).displayNumericalList();
			int prop = s.nextInt();
			s.nextLine();
			util.getPlayer(move).sellProperty(prop);
		 }
		else if (option == 3) {
			System.out.println("Which property would you like to mortgage?");
			util.getPlayer(move).displayNumericalList();
			int prop = s.nextInt();
			s.nextLine();
			util.getPlayer(move).mortgageProperty(prop);
		 }
		else if (option == 4) {
			System.out.println("Which property would you like to unmortgage?");
			util.getPlayer(move).displayNumericalListM();
			int prop = s.nextInt();
			s.nextLine();
			util.getPlayer(move).unMortgageProperty(prop);
		 }
		else if (option == 5) {
			System.out.println("Which property would you like to buy a house?");
			util.getPlayer(move).displayNumericalList();
			int prop = s.nextInt();
			s.nextLine();
			util.getPlayer(move).buildHouse(prop);
		 }
		}
		board.displayBoard();
		util.checkWin();
		if (move == 1 && !player2.getJail()) {
			move = 2;
		} else if (move == 1 && player2.getJail()) {
			player2.decreaseJail();
		}
		else if (move == 2 && player1.getJail()) {
			player1.decreaseJail();
		}
		else if (move == 2 && !player1.getJail()) {
			move = 1;
		}
		continue;
	}
 }
}
