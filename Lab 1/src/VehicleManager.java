import java.util.Random;
import java.util.Scanner;
// VehicleManageer Class
public class VehicleManager {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random();
    //Arrays to hold car objects, motorcycle objects , colors, airbags and threeWheels choice arrays
    private Car[] cars = new Car[3];
    private MotorCycle[] motorcycles = new MotorCycle[3];
    private final String[] colors = {"Red", "Blue", "White"};
    private final boolean[] airbags = {true,false,true};
    private final boolean[] threeWheels ={false,false,true};

//The run method
    public void run() {
        //For loop to create the 6 vehicles
        for (int i = 0; i < 3; i++) {
            cars[i] = new Car();
            cars[i].setRunning(false);
            cars[i].setColor(colors[rand.nextInt(colors.length)]);
            cars[i].setHasAirBags(airbags[rand.nextInt(airbags.length)]);

            motorcycles[i] = new MotorCycle();
            motorcycles[i].setRunning(false);
            motorcycles[i].setColor(colors[rand.nextInt(colors.length)]);
            motorcycles[i].setHasThreeWheels(threeWheels[rand.nextInt(threeWheels.length)]);
        }
        int carChoice;
        int motorcycleChoice;


        //Car Start Menu with try catch for validating input
        for (int j = 0; j < 3; j++) {
            System.out.println(" Car# " + (j + 1));
        }
        System.out.println("Which of the following cars do you wanna start? (1,2,3)");

        try {
            carChoice = scnr.nextInt();
            cars[carChoice - 1].Start();
        } catch(ArrayIndexOutOfBoundsException r){
            System.out.println("Invalid Input. Please pick 1,2 or 3");
        }
        //Car Stop Menu
        for (int j = 0; j < 3; j++) {
            System.out.println(" Car# " + (j + 1));
        }
        System.out.println("Which of the following cars do you wanna stop? (1,2,3)");
        try {
            carChoice = scnr.nextInt();
            cars[carChoice - 1].Stop();
        } catch(ArrayIndexOutOfBoundsException r){
            System.out.println("Invalid Input. Please pick 1,2 or 3");
        }


        // Motorcycle Start Menu
        for (int j = 0; j < 3; j++) {
            System.out.println(" Motorcycle# " + (j + 1));
        }
        System.out.println("Which of the following motorcycles do you wanna start?(1.2.3)");
        try {
            motorcycleChoice = scnr.nextInt();
            motorcycles[motorcycleChoice - 1].Start();
        } catch(ArrayIndexOutOfBoundsException r){
            System.out.println("Invalid Input. Please pick 1,2 or 3");
        }

        // Motorcycle Stop Menu
        for (int j = 0; j < 3; j++) {
            System.out.println(" Motorcycle# " + (j + 1));
        }
        System.out.println("Which of the following motorcycles do you wanna stop?(1,2,3)");
        try {
            motorcycleChoice = scnr.nextInt();
            motorcycles[motorcycleChoice - 1].Stop();
        } catch(ArrayIndexOutOfBoundsException r){
            System.out.println("Invalid Input. Please pick 1,2 or 3");
        }

        //Display status for all vehicles
        for (int i = 0; i <3 ; i++) {
            System.out.println("Car# "+ (i+1) + " Running: "+ cars[i].getRunning());

        }
        for (int i = 0; i <3 ; i++) {
            System.out.println("Motorcycle# "+(i+1)+" Running: "+ motorcycles[i].getRunning());

        }

    }

}








