import java.util.ArrayList;

public class squareType {
	int id;
  String name;
  int cost;
  int rent;
  int owner;
  int occupied;
  Boolean special;
  Boolean active;
  ArrayList<house> houses = new ArrayList<house>();
  public squareType(String name, int cost, int rent, int id, Boolean special) {
	  this.name = name;
	  this.cost = cost;
	  this.rent = rent;
	  this.id = id;
	  this.special = special;
	  this.occupied = 0;
	  this.owner = 0;
	  this.active = true;
  }
  public Boolean hasOwner() {
	  return (owner != 0);
  }
  public String getName() {
	  return name;
  }
  public String getInfoName() {
	  String nameSuffix = name + " ";
	  if (houses.size() >0 && houses.get(0).isHotel()){
		  nameSuffix += "(H)";
	  }
	  else if (houses.size() > 0) {
		  for (int z = 0; z < houses.size(); z++) nameSuffix += "(h)";
	  }
	  return nameSuffix;
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
  public void addHouse() {
	  if (houses.size() == 4) {
		  System.out.println("Reached max houses");
		  return;
	  }  
	  houses.add(new house(id-1));
	  if (houses.size() == 4) {
		  houses = new ArrayList<house>();
		  houses.add(new hotel(id-1));
	  }
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
	if (active) {
	int r = rent;
	if (name.equals("STATION")) {
		ArrayList<squareType> a = util.getPlayer(owner).owned;
		int m = -1;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getName().equals("STATION")) {
				m++;
			}
		}
		r = (int) (r * Math.pow(2, m));
		return r;
	}
	if (houses.size() >0) {
		if (houses.get(0).isHotel()) {
			return (int) (r * 40);
		}
		else {
			return (int) (r * Math.pow(2.5, houses.size()));
		}
	}
	else {
		return r;
	  }
	}
	else {
		return 0;
	}
}
public void removeOwner() {
	owner = 0;
	
}
public void mortgageChange() {
	if (active) {
	active = false;
	}
	else {
	active = true;
	}
 }
public boolean isActive() {
	return active;
 }
}
