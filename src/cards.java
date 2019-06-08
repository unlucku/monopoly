
public class cards {
   public static void effect(int move) {
	   int a = (int) (Math.random() * 3);
	   if (a==0) {
		   System.out.println("You won $200!");
		   util.getPlayer(move).increaseBalance(200);
	   }
	   else if (a==1) {
		   System.out.println("You lost $200!");
		   util.getPlayer(move).decreaseBalance(200); 
	   }
	   else {
		   System.out.println("You have been moved to go. Get your salary!");
		   util.getPlayer(move).increaseBalance(2000);
		   util.getPlayer(move).newPos(0);
	   }
   }
}
