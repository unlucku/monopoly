import java.util.ArrayList;

public class piece {
 int balance;
 int pos;
 int name;
 ArrayList<squareType> owned = new ArrayList<squareType>();
 public piece(int name) {
	 this.name = name;
	 this.balance = 1500;
	 board.setOccupy(0, name);
 }
 public int getPos() {
	 return pos;
 }
 public void buyProperty() {
	 if (board.game[pos].getCost() < balance) {
		 balance = balance-board.game[pos].getCost();
		 board.game[board.game[pos].getID()-1].setOwner(name);
		 owned.add(board.game[pos]);
		 System.out.println("Property purchased!");
	 }
	 else {
		 System.out.println("Not enough funds!");
	 }
 }
 public void move(int roll) {
	 board.game[pos].removeOccupy(name);
	 if ((roll + pos) < 40) {
	 board.setOccupy(roll + pos, name);
	 this.pos = roll+pos;
	 }
	 else {
		 board.setOccupy(roll+pos-40, name);
		 this.pos = roll+pos-40; 
	 }
 }
 public void newPos(int id) {
	 board.game[pos].removeOccupy(name);
	 this.pos = id;
	 board.setOccupy(id, name);
 }
 public String toString() {
	 String a = "Player " + name;
	 String b = "Balance: $" + balance;
	 String c = "Properties: ";
	 for (int i = 0; i < owned.size(); i++) c += owned.get(i).getName() + " ";;
	 return a + "\n" + b + "\n" + c;
 }
}
