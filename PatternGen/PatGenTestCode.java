//  Class author:  Raley
//  Date created:  10/30/2024
//  General description: Makes different triangles based on what is put in using the PatGenCode Class.

import java.util.Scanner;
public class PatGenTestCode {
    public static void main(String[] args) {
        
        boolean playingNow = true;

    try (Scanner newScan = new Scanner(System.in)) {
    /* 
        Ask if the user wants to make triangles.
    */
    System.out.println("Hello! Would you like to print some triangles? Type '1' if yes! :D");
    System.out.println("");
    String inPut = newScan.nextLine();
    
    if (inPut.equals("1")) {
        /* 
            Out put if user says yes to making triangles.
        */
        System.out.println("Great! One thing to note is that you will imput a number to slect a triangle and then another number to decide how many rows get printed.");
        System.out.println("Please remember to type slow, if you type too fast your imput might not be recognized.");
        System.out.println("To get started, here are what each triangle looks like:");
        System.out.println("");
        System.out.println("Type '1' to make a star triangle like this one:");
        PatGenCode.stars(7);
        System.out.println("");
        System.out.println("");
        System.out.println("Type '2' to make a number triangle like this one:");
        PatGenCode.triangle(9);
        System.out.println("");
        System.out.println("Type '3' to make an odd number triangle like this one:");
        System.out.println("");
        PatGenCode.odds(9);
        System.out.println("");
        System.out.println("Type '4' to make an odd/even number triangle like this one:");
        System.out.println("");
        PatGenCode.eo(6);
        System.out.println("Type '5' to make a number triangle like this one:");
        System.out.println("");
        PatGenCode.pyramid(5);


        while (playingNow == true) {
            System.out.println("");
            System.out.println("Ready to get started? Great! Type 1-5 to make a triangle, type 6 to quit.");
            System.out.println("");
            /* 
                Allow the user to make their own triangles.
            */
            inPut = newScan.nextLine();
            int inPutNumber;
            if (inPut.equals("1")) {
                /* 
                    Make a star triangle with amout of rows dictated by user.
                */
                System.out.println("How many rows do you want?");
                inPutNumber = newScan.nextInt();
                PatGenCode.stars(inPutNumber);
                System.out.println("");
                System.out.println("");
            } else if (inPut.equals("2")) {
                /* 
                    Make a number triangle with amout of rows dictated by user.
                */
                System.out.println("How many rows do you want?");
                inPutNumber = newScan.nextInt();
                PatGenCode.triangle(inPutNumber);
                System.out.println("");
            } else if (inPut.equals("3")) {
                /* 
                    Make a odd triangle with amout of rows dictated by user.
                */
                System.out.println("How many rows do you want?");
                inPutNumber = newScan.nextInt();
                System.out.println("");
                PatGenCode.odds(inPutNumber);
                System.out.println("");
            } else if (inPut.equals("4")) {
                /* 
                    Make a 'E/O' triangle with amout of rows dictated by user.
                */
                System.out.println("How many rows do you want?");
                inPutNumber = newScan.nextInt();
                System.out.println("");
                PatGenCode.eo(inPutNumber);
                System.out.println("");
            } else if (inPut.equals("5")) {
                /* 
                    Make a pyramid with amout of rows dictated by user.
                */
                System.out.println("How many rows do you want?");
                inPutNumber = newScan.nextInt();
                System.out.println("");
                PatGenCode.pyramid(inPutNumber);
                System.out.println("");
            } else if (inPut.equals("6")){
                /* 
                    Allow user to stop making triangles
                */
                System.out.println("Are you sure you want to quit? If you do, type '1', if no type anything else.");
                System.out.println("");
                inPut = newScan.nextLine();
                if (inPut.equals("1")) {
                    /* 
                        Accept that user wants to quit and quit.
                    */
                    playingNow = false;
                } else {
                    /* 
                        If user quits quiting, out put following line and go back to making triangles.
                    */
                    System.out.println("Lovely! What would you like to do now?");
                }
            } else {
                /* 
                    Reset so there are no errors.
                */
                inPutNumber = 0;
                inPut = "";
            }
        }
        

    } 
    /* 
            Out put if user says no to making triangles or is done making triangles.
    */
    System.out.println("Alright! Bye! :D");
    System.out.println("");
    }
    }
}