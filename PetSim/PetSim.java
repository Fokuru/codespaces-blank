package PetSim;
/* 
 * My name is Raley Wilkin
 * This is the Purrrrrrrrfect Pet Selector Code part 1
 * It deffines the PetSim class and all the methods
 * for PetSim to be able to select a pet.
 * Finished 10/15/2024
 */ 

 public class PetSim {

    //instance variables
   private String color;
   private String season;
   private String name;
   private String cons = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz";
   private String vow = "AEIOYUaeioyu";
   private boolean startCon = true;
   
     //constructors
     // Takes: Nothing
     // Output: Vars to default
     public PetSim() {
        color = "";
        season = "";
        name = "";
        startCon = false;
     }

    // Setting Color
    // Takes: A string imput
    // Output: Sets 'color' to a color
    // Or "Not Possible, Try Again"
    // If the user didn't imput a color option
     public void setColor (String newColor) {
        
        if (newColor.equals("1")) {
            color = "Red";
        } else if (newColor.equals("2")) {
            color = "Green";
        } else if (newColor.equals("3")) {
            color = "Blue";
        } else {
            color = "Not Possible, Try Again";
        }
    }

    // States the color the user picked previously
    public String getColor () {
        return color;
    }


    // Setting Season
    // Takes: A string imput
    // Output: Sets 'season' to a season
    // Or "Not Possible, Try Again"
    // If the user didn't imput a season option
    public void setSeason (String newSeason) {
        if (newSeason.equals("1")) {
            season = "Spring";
        } else if (newSeason.equals("2")) {
            season = "Summer";
        } else if (newSeason.equals("3")) {
            season = "Fall";
        } else if (newSeason.equals("4")) {
            season = "Winter";
        } else {
            season = "Not Possible, Try Again";
        }
    }

    // States the season the user picked previously
    public String getSeason () {
        return season;
    }

    // Setting Name
    // Takes: A string imput
    // Output 1: Sets 'name' to a string
    // Output 2: Sets 'startCon' to true
    // or false based on if the first letter
    // of 'name' is = to "AEIOYUaeioyu" or
    // "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz"
    public void setName (String newName) {
        name = newName;
        if (name.length()>0){
            if (cons.indexOf((name.substring(0,1))) != -1) {
                startCon = true;
            } else if (vow.indexOf((name.substring(0,1))) != -1) {
                startCon = false;
            } else {
                name = "Not Possible, Try Again";
            }
        } else {
            name = "Not Possible, Try Again";
        }
    }

    // States the name the user picked previously
    public String getName () {
        return name;
    } 
    

    // Finds the pet for the user based on data given previously
    public String findPet () {
        String theReturn = "";
        // Set vars to exact
        if ((color.equals("")) || (season.equals("")) || (name.equals(""))) {
            theReturn = "Need More Information";
            return theReturn;
        } else if ((color.equals("Blue")) && (season.equals("Fall"))) {
            theReturn = "alligator";
            return theReturn;
        } else if ((color.equals("Blue")) && (season.equals("Spring"))) {
            theReturn = "ostrich";
            return theReturn;
        } else if ((color.equals("Green")) && (season.equals("Winter")) && (startCon == true)) {
            theReturn = "giraffe";
            return theReturn;
        } else if ((color.equals("Green")) && ((season.equals("Winter")) || (season.equals("Spring")) || (season.equals("Summer")))) {
            theReturn = "dog";
            return theReturn;
        } else if ((color.equals("Red")) && (startCon == true)) {
            theReturn = "panda";
            return theReturn;
        } else if ((color.equals("Red")) && (startCon == false)) {
            theReturn = "porcupine";
            return theReturn;
        } else if ((season == "summer")) {
            theReturn = "pony";
            return theReturn;
        } else if ((startCon == true) && (color.equals("Blue")) && ((season.equals("Winter")) || (season.equals("Spring")))) {
            theReturn = "axolotl";
            return theReturn;
        } else {
            theReturn = "rock";
            return theReturn;
        }
    }

 }