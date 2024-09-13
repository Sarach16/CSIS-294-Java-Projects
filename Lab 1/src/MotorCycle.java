
// Child MotorCycle extends MotorVehicle
public class MotorCycle extends MotorVehicle{
    //Special class feature hasThreeWheels
    private boolean hasThreeWheels;
    //Setters and Getters for hasThreeWheels
    public void setHasThreeWheels(boolean hasThreeWheels){
        this.hasThreeWheels= hasThreeWheels;
    }
    public boolean getHasThreeWheels(){
        return hasThreeWheels;
    }

    //Start and Stop methods
    public void Start(){
        setRunning(true);
        System.out.println("Ruunning Status: "+ getRunning());
        System.out.println("Color: "+ getColor());
        System.out.println("Does it have Three Wheels ? " + getHasThreeWheels());
        System.out.println("Motorcycle");
        System.out.println("has been Started");
    }
    public void Stop(){
        setRunning(false);
        System.out.println("Ruunning: "+ getRunning());
        System.out.println("Color: "+ getColor());
        System.out.println("Does it have Three Wheels ? " + getHasThreeWheels());
        System.out.println("Motorcycle");
        System.out.println("has been Stopped");
    }
}
