import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  private boolean hasElevator;

  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    this.residents = new ArrayList<String>();

  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents() {
    return this.residents.size();
  }

  public String toString() {
    String desc = super.toString();

    if (this.hasDiningRoom) {
      desc += "It has a dining room. ";
    }
    if (this.hasElevator) {
      desc += "It has an elevator. ";
    }
    return desc;
  }

  public void moveIn(String name) {
    if (this.residents.contains(name)) {
      System.out.println(name + " is already moved in.");
    } else {
      this.residents.add(name);
      System.out.println(name + " has successfully moved in!");
    }
  }

  public String moveOut(String name) {
    if (this.residents.contains(name)) {
      this.residents.remove(name);
      System.out.println(name + " has moved out.");
    } else {
      System.out.println(name + " is not a resident here.");
    }
    return name;
  }

  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    House h = new House("Lamont", "100 Green Street", 2, true, true);
    System.out.println(h);
    h.moveIn("Jason");
    h.isResident("Jason");
    h.moveOut("Sam");
    h.moveOut("Jason");

  }

}