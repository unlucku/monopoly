
public class specialProperties {
   public static void effect(squareType a, int move) {
	   if (a.getName().equals("TAX")) {
		   System.out.println("$200 in tax has been deducted!");
		util.getPlayer(move).decreaseBalance(200);
	   }
	   if (a.getName().equals("CHANCE") || a.getName().equals("CHEST")) {
		cards.effect(move);
	   }
	   if (a.getName().equals("JAIL")) {
		   System.out.println("You landed in jail!");
		util.getPlayer(move).setJailed();
	   }
   }
}
