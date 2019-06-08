
public class util {
 public static int rollDice() {
	 int dice1 = (int)(Math.random() * 6 + 1);
	 int dice2 = (int)(Math.random() * 6 + 1);
	 return dice1 + dice2;
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
}
