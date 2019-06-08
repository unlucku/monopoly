import java.util.ArrayList;

public class piece {
 int balance;
 int pos;
 int name;
 ArrayList<squareType> owned = new ArrayList<squareType>();
 public piece(int name) {
	 this.name = name;
	 newPos(0);
 }
 public void buyProperty(squareType property) {
	 if (property.getCost() < balance) {
		 balance = balance-property.getCost();
		 owned.add(property);
	 }
	 else {
		 System.out.println("Not enough funds!");
	 }
 }
 public void newPos(int id) {
	 board.setOccupy(id, name);
 }
}
