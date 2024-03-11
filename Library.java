import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
  }

  public void addTitle(String title) {
    this.collection.put(title, true);
  }

  public String removeTitle(String title) {
    if (this.collection.containsKey(title)) {
      this.collection.remove(title);
      System.out.println(title + "has been removed.");
    } else {
      System.out.println("We do not have " + title);
    }
    return title;
  }

  public void checkOut(String title) {
    if (this.collection.containsKey(title)) {
      this.collection.replace(title, false);
      System.out.println(title + " has been checked out by you.");
    } else {
      System.out.println("Sorry, someone else already checked out " + title);
    }

  }

  public void returnBook(String title) {
    if (this.collection.containsKey(title)) {
      System.out.println(title + " is already in the library.");
    } else {
      this.collection.replace(title, true);
      System.out.println("You've returned" + title);
    }
  }

  public boolean containsTitle(String title) {
    if (this.collection.containsKey(title)) {
      System.out.println("We do have " + title);
    } else {
      System.out.println("We do not have " + title);
    }
    return this.collection.containsKey(title);

  }

  // public boolean isAvailable(String title) {
  //   if (this.collection.containsKey(title)) {
  //     if (this.collection.get(title)) {
  //       System.out.println(title + " is available.");
  //     } else {
  //       System.out.println(title + " is not available.");
  //     }

  //   } else {
  //     System.out.println(title + " is not in the library.");
  //   }
  //   return this.collection.get(title);
  // }

  public void printCollection() {
    System.out.println(this.collection.keySet() + "=" + this.collection.values());

  }

  public static void main(String[] args) {
    Library l = new Library("Neilson", "Some Address", 4);
    l.addTitle("Othello by Shakespeare");
    l.addTitle("Jason Derulo by Jason D");
    l.printCollection();
    System.out.println(l.collection.get("Othello by Shakespeare"));
    // l.isAvailable("Othello by Shakepeare");
  }

}