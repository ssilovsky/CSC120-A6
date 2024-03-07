import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  boolean hasElevator;
  
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    //System.out.println("You have built a house: 🏠");
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    this.residents = new ArrayList<String>();

  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }

  public String toString(){
    String desc = super.toString();

    if (this.hasDiningRoom) {
      desc += "It has a dining room. ";
    } 
    if (this.hasElevator) {
      desc += "It has an elevator. ";
    }
    return desc;
  }

  public void moveIn(String name){

  }


  public static void main(String[] args) {
    House h = new House("Lamont", "100 Green Street", 2, true, true);
    System.out.println(h);
    
  }

}