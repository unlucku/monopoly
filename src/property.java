
public class property {
	int id;
  String name;
  int cost;
  int rent;
  String owner;
  Boolean special;
  public property(String name, int cost, int rent, int id, Boolean special) {
	  this.name = name;
	  this.cost = cost;
	  this.rent = rent;
	  this.id = id;
	  this.special = special;
  }
  public Boolean hasOwner() {
	  return (owner != null);
  }
  public String getOwner() {
	  return owner;
  }
  public int getID() {
	  return id;
  }
}
