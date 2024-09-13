import java.security.SecureRandom;
import java.util.Scanner;

public class GameGrid {
    final int iWallChance = 20; //Chance of there being a wall
    public void run(){
        int [] [] gameGrid = new int[10][10]; //Creating Game Grid of 10 10
        SecureRandom rand = new SecureRandom();

        for(int y=0; y< gameGrid.length; y++){
            for(int x=0; x<gameGrid[y].length; x++){
                int iChance = rand.nextInt(100);
                if(iChance < iWallChance) {
                    gameGrid[y][x] = 1;
                }
                else{
                    gameGrid[y][x] = 0;
                }


            }
        } //Closing bracket of the outer loop
        gameGrid[0][0]=0;
        int iUserRow = 0, iUserCol = 0; //variables for the user's position
        //boolean moving = true;
        char move;
        Scanner scnr = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to move down (D/d) or right (R/r): ");
            move= scnr.nextLine().charAt(0);
            if (move == 'D'|| move=='d'){
                iUserRow++;//Move down
            }
            else if (move =='R'||move=='r'){
                iUserCol++;//Move right
            } else{
                System.out.println("Invalid input.Please enter D or d for down, R or r for right.");
                continue;
            }
            //Checking if the player hits a wall
            if(gameGrid[iUserRow][iUserCol]==1){
                System.out.println("You have lost the game!");
                break;
            }
            //Checking for the win
            if(iUserCol==9 || iUserRow==9){
                System.out.println("You have won the game!");
                break;
            }
        }

        //Displaying the Game Grid
        System.out.println("Game Grid: ");

        for(int y=0; y< gameGrid.length; y++){
            System.out.print("+");
            for(int x=0; x<gameGrid[y].length; x++) {
                System.out.print("---+");
            }
            System.out.println();

            System.out.print("|");
            for(int x =0; x<gameGrid[y].length; x++){
                if (y== iUserRow && x == iUserCol){
                    System.out.print(" X |");
                } else{
                    System.out.printf(" %d |",gameGrid[y][x]);
                }
            }
            System.out.println();
        }
        System.out.print("+");
        for(int x = 0; x<gameGrid[0].length; x++){
            System.out.print("---+");
        }
        System.out.println();


    }

}
