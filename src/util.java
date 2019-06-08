
public class util {
 public static int rollDice() {
	 int dice1 = (int)(Math.random() * 6 + 1);
	 int dice2 = (int)(Math.random() * 6 + 1);
	 return 5;
 }
 public static piece getPlayer(int p) {
	 if (p == 1) {
		 return monopoly.player1;
	 }
	 else {
		 return monopoly.player2;
	 }
 }
public static boolean getInput() {
	if (monopoly.s.nextLine().toLowerCase().equals("yes"))
	return true;
	else 
	return false;
}
public static void checkWin() {
	if (monopoly.player1.getBalance() < 0) {
		System.out.println("Player 2 Won!");
		Thread.currentThread().stop();
	}
	if (monopoly.player2.getBalance() < 0) {
		System.out.println("Player 1 Won!");
		Thread.currentThread().stop();
	}
}
}
