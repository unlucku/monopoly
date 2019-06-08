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
 public void increaseBalance(int b) {
	 balance = b + balance;
 }
 public void decreaseBalance(int b) {
	 balance = balance - b;
 }
 public String toString() {
	 String a = "Player " + name;
	 String b = "Balance: $" + balance;
	 String c = "Properties: ";
	 for (int i = 0; i < owned.size(); i++) c += owned.get(i).getName() + " ";;
	 return a + "\n" + b + "\n" + c;
 }
public void payRent() {
	int rent = board.game[pos].getRent();
	decreaseBalance(rent);
	if (name == 1) {
		monopoly.player2.increaseBalance(rent);
	}
	else {
		monopoly.player1.increaseBalance(rent);
	}
}
public int getBalance() {
	return balance;
}
public void displayNumericalList() {
	 for (int i = 0; i < owned.size(); i++) {
		 if (owned.get(i).isActive()) {
		 System.out.println((i+1) + ". " +  owned.get(i).getName() + " " + owned.get(i).getCost());
		 }
	 }
	}
	
public void sellProperty(int prop) {
	increaseBalance(owned.get(prop-1).getCost());
	owned.get(prop-1).removeOwner();
	owned.remove(prop-1);
}
public void displayNumericalListM() {
	 for (int i = 0; i < owned.size(); i++) {
		 if (!owned.get(i).isActive()) {
		 System.out.println((i+1) + ". " +  owned.get(i).getName() + " " + owned.get(i).getCost());
		 }
	 }
}
public void mortgageProperty(int prop) {
	increaseBalance(owned.get(prop-1).getCost()/2);
	owned.get(prop-1).mortgageChange();
 }
public void unMortgageProperty(int prop) {
	decreaseBalance(owned.get(prop-1).getCost()/2);
	owned.get(prop-1).mortgageChange();
 }
}
