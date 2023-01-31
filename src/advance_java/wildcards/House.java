package advance_java.wildcards;

public class House extends Building {
    public int numberOfRooms = 7;

    @Override
    public String toString() {
        return("house");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

}
