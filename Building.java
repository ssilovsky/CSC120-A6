public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /** 
     * Building class constructor  
     * @param name String, name of building
     * @param address String, address of building
     * @param nFloors int, number of floors in building
     * 
    */
    public Building(String name, String address, int nFloors) {
        if (name != null) {
            this.name = name;
        }
        if (address != null) {
            this.address = address;
        }
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Returns the house's name
     * 
     * @return String getter for Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the house's address
     * 
     * @return String getter for Address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Returns the number of house floors
     * 
     * @return String getter for number of house floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns string stating house name, number of floors, and address
     * 
     * @return String description of house attributes
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
