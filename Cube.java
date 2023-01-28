//It has a private integer variable called side, which represents the length of a side of the cube,
// a getter method called getSide(),
// a setter method called setSide(int side),
// a method that returns the surface area of the cube called getSurfaceArea(),
// a method that returns the volume of the cube called getVolume()
// a toString method that returns a String in the format

//Cube{side=4}. The Cube class has two constructors.
// One takes no arguments (has no parameters) and sets side to 1.
// The other will take a single integer argument that is used to initialize the side property.
// Side should never be less than 1.
// If a user attempts to create a Cube with a side length less than 1, an IllegalArgumentException will be thrown.
// The message “A cube’s side length cannot be less than 1!” will be displayed in the console.
// If a user attempts to change the side length of an already existing Cube to a value less than 1,
// again, an IllegalArgumentException will be thrown, and the message “A cube’s side length cannot be less than 1!”
// will be displayed in the console when the exception occurs.

public class Cube{

    int side;

    public Cube(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    public Cube(){
        side = 1;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    public int getSurfaceArea(){
        return side * side * 6;
    }

    public int getVolume(){
        return side * side * side;
    }

    public String toString(){
        return("This cube has the side length of " + this.getSide() +
                " units, a surface area of " + this.getSurfaceArea() +
                " units, and a volume of " + this.getVolume() + " units.");
    }

}




