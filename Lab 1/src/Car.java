//Child Class Car inherits running and color from MotorVehicle Class
public class Car extends MotorVehicle{
    //special class feature hasAirBags
    private boolean hasAirBags;

    //Setters and Getters for hasAirBags
    public void setHasAirBags(boolean hasAirBags) {
        this.hasAirBags = hasAirBags;
    }
    public boolean getHasAirBags(){
        return hasAirBags;
    }
    // Start and Stop methods
    public void Start(){
        setRunning(true);
        System.out.println("Running: "+ getRunning());
        System.out.println("Color: "+ getColor());
        System.out.println("Does it have Air Bags ? " + getHasAirBags());
        System.out.println("Car");
        System.out.println("has been Started");
    }
    public void Stop(){
        setRunning(false);
        System.out.println("Running: "+ getRunning());
        System.out.println("Color: "+ getColor());
        System.out.println("Does it have Air Bags ? " + getHasAirBags());
        System.out.println("Car");
        System.out.println("has been Stopped");
    }
}
