
public class squareType {
	int id;
  String name;
  int cost;
  int rent;
  int owner;
  int occupied;
  Boolean special;
  public squareType(String name, int cost, int rent, int id, Boolean special) {
	  this.name = name;
	  this.cost = cost;
	  this.rent = rent;
	  this.id = id;
	  this.special = special;
	  this.occupied = 0;
	  this.owner = 0;
  }
  public Boolean hasOwner() {
	  return (owner != 0);
  }
  public String getName() {
	  return name;
  }
  public int getOwner() {
	  return owner;
  }
  public void removeOccupy(int p) {
	  if (occupied == 1 || occupied == 2) {
		  occupied = 0;
	  }
	  else if (occupied == 3) {
		  if (p == 1) {
			  occupied = 2;
		  }
		  else {
			  occupied = 3;
		  }
	  }
  }
  public void setOwner(int p) {
	  this.owner = p;
  }
  public int getID() {
	  return id;
  }
  public Boolean isSpecial() {
	  return special;
  }
public int getCost() {
	return cost;
 }
public void setOccupy(int p) {
	if (occupied !=0) {
		this.occupied = 3;
	}
	else {
	this.occupied = p;
	}
}
public void clearOccupy() {
	occupied = 0;
}
public String toString() {
	if(occupied == 1) {
		return " P1";
	}
	else if(occupied == 2) {
		return " P2";
	}
	else if(occupied == 3) {
		return " P1 | P2";
	}
	else {
		return " ";
	}
}
public int getRent() {
	return rent;
}
public void removeOwner() {
	owner = 0;
	
}
}
