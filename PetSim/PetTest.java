package PetSim;
/* 
 * My name is Raley Wilkin
 * This is the Purrrrrrrrfect Pet Selector Code part 2
 * It takes the PetSim class and gets user imputs 
 * to alow PetSim to pick a pet for the user
 * Finished 10/15/2024
 */ 

import java.util.*;

public class PetTest {
    public static void main(String[] args) {
    try (Scanner newScan = new Scanner(System.in)) {

            // Name Stuff Here
            System.out.println("Hello! Please enter your name:");
            String playerName = newScan.nextLine();
            PetSim newPlayer = new PetSim();
            newPlayer.setName(playerName);
            while (newPlayer.getName() == "Not Possible, Try Again") {
                System.out.println("Please insert a name starting with a character from the Latin Alphabet.");
                playerName = newScan.nextLine();
                newPlayer.setName(playerName);
            }
            System.out.println("Thank you " + newPlayer.getName() + " for joining The Purrrrrrrfect Pet Finder System!");

            // Color Stuff Here
            System.out.println("Please pick from the options of 'Red', 'Green', and 'Blue'.");
            System.out.println("Type 1 for 'Red', Type 2 for 'Green', and Type 3 for 'Blue'");
            String inPutColor = newScan.nextLine();
            newPlayer.setColor(inPutColor);
            // Check That That is an Actuall Option
            while (newPlayer.getColor() == "Not Possible, Try Again") {
                System.out.println("Please pick from the options of 'Red', 'Green', and 'Blue'.");
                System.out.println("Type 1 for 'Red', Type 2 for 'Green', and Type 3 for 'Blue'");
                inPutColor = newScan.nextLine();
                newPlayer.setColor(inPutColor);
            } 
            System.out.println("Thank you for picking " + newPlayer.getColor());

            // Season Stuff Here
            System.out.println("Please pick your favorate season from the options of 'Spring', 'Summer', 'Fall', and 'Winter'.");
            System.out.println("Type 1 for 'Spring', Type 2 for 'Summer', Type 3 for 'Fall', and Type 4 for 'Winter'");
            String inPutSeason = newScan.nextLine();
            newPlayer.setSeason(inPutSeason);
            // Check That That is an Actuall Option
            while (newPlayer.getSeason() == "Not Possible, Try Again") {
                System.out.println("Please pick your favorate season from the options of 'Spring', 'Summer', 'Fall', and 'Winter'.");
                System.out.println("Type 1 for 'Spring', Type 2 for 'Summer', Type 3 for 'Fall', and Type 4 for 'Winter'");
                inPutSeason = newScan.nextLine();
                newPlayer.setSeason(inPutSeason);
            }
            System.out.println("Thank you for picking " + newPlayer.getSeason());

            // The End!
            System.out.println("Thank you for playing! We have picked a " + newPlayer.findPet() + 
                               " as your purrrrrrrfect pet! Have fun, " + newPlayer.getName() + "!");
            
    }  
}

}

