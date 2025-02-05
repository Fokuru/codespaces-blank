package AlphaSoup;
/*
 * Code is by Raley Wilkin
 * This is Raley's Alphabet Soup Code
 * Finished 9/26/2024
 */






import java.util.Scanner;

public class AlphaMain {
    public static void main(String[] args) {
        // Making componys
        AlphaSoup tris = new AlphaSoup("Tris Time");
        AlphaSoup dris = new AlphaSoup("Dris Date");
        AlphaSoup cris = new AlphaSoup("Cris Count");

        // Adding things to compony soup
        tris.addWord("Early");
        tris.addWord("Late");
        dris.addWord("Month");
        dris.addWord("Year");
        cris.addWord("More");
        cris.addWord("Less");

        // Tris outputs
        System.out.println(tris.getCompany());
        System.out.println(tris.allLetters());
        System.out.println(tris.randomLetter());

        // Dris outputs
        System.out.println(dris.getCompany());
        System.out.println(dris.allLetters());
        System.out.println(dris.randomLetter());

        // Cris outputs
        System.out.println(cris.getCompany());
        System.out.println(cris.allLetters());
        System.out.println(cris.randomLetter());

        // Extra:
        try (Scanner newScan = new Scanner(System.in)) {
            System.out.println("Hello! Please enter your company name:");
            String newCompanyName = newScan.nextLine();
            AlphaSoup newCompany = new AlphaSoup(newCompanyName);
            System.out.println("Thank you " + newCompanyName + " for joining The Alphabet Soup!");
            System.out.println("Is there anything you would like to do? To check options, type 0, if not type 1.");
            int inPut = newScan.nextInt();
            if (inPut == 0) {
                System.out.println("Type 0 to check options again.");
                System.out.println("Type 1 to rest the file.");
                System.out.println("Type 2 to change the company name.");
                System.out.println("Type 3 to add a word to the alphabet soup.");
                System.out.println("Type 4 to see all words inputed into the alphabet soup with the company name in the middle.");
                System.out.println("Type 5 to get the name of the company you are working with.");
                System.out.println("Type 6 to remove a word.");
                System.out.println("Type 7 to gain a random letter from the alphabet soup.");
            } else {
                System.out.println("You have chosen not to check options. To check options later type 0.");
            }
            System.out.println("What would you like to do?");
            int newInPut = newScan.nextInt();
            while (newCompanyName != "") {
                if (newInPut == 0) {
                    System.out.println("Type 1 to rest the file.");
                    System.out.println("Type 2 to change the company name.");
                    System.out.println("Type 3 to add a word to the alphabet soup.");
                    System.out.println("Type 4 to see all words inputed into the alphabet soup with the company name in the middle.");
                    System.out.println("Type 5 to get the name of the company you are working with.");
                    System.out.println("Type 6 to remove a word.");
                    System.out.println("Type 7 to gain a random letter from the alphabet soup.");
                } else if (newInPut == 1) {
                    System.out.println(newCompanyName + " is being reset");
                    System.out.println("Continue reset? 'true' or 'false'.");
                    boolean yesNo = newScan.nextBoolean();
                    if (yesNo == true) {
                        newCompany.resetAlphaSoup(newCompanyName);
                        System.out.println(newCompanyName + " has been reset.");
                        System.out.println("What would you like to do?");
                        newInPut = newScan.nextInt();

                    } else {
                        System.out.println("Canceling Reset");
                        System.out.println("What would you like to do?");
                        newInPut = newScan.nextInt();
                    }

                } else if (newInPut == 2) {
                    System.out.println("Please insert new company name:");
                    String newName = newScan.nextLine();
                    if (newName != "") {
                        System.out.println("Set " + newCompanyName + " to " + newName + "? 'true' or 'false'.");
                        boolean yesNo = newScan.nextBoolean();
                        if (yesNo == true) {
                            newCompany.setCompany(newName);
                            newCompanyName = newName;
                            System.out.println(newCompanyName + " has been changed.");
                            System.out.println("What would you like to do?");
                            newInPut = newScan.nextInt();

                        } else {
                            System.out.println("Canceling Changing Name");
                            System.out.println("What would you like to do?");
                            newInPut = newScan.nextInt();
                        }
                    } else {

                    }

                } else if (newInPut == 3) {
                    System.out.println("Please insert new word:");
                    String newWord = newScan.nextLine();
                    if (newWord != "") {
                        System.out.println("Add " + newWord + " to company " + newCompanyName
                                + "'s alphabet soup? 'true' or 'false'.");
                        boolean yesNo = newScan.nextBoolean();
                        if (yesNo == true) {
                            newCompany.addWord(newWord);
                            System.out.println(newWord + " has been added.");
                            System.out.println("What would you like to do?");
                            newInPut = newScan.nextInt();

                        } else {
                            System.out.println("Canceling Adding Word");
                            System.out.println("What would you like to do?");
                            newInPut = newScan.nextInt();
                        }
                    } else {
                    }

                } else if (newInPut == 4) {
                    System.out.println("Here is your alphabet soup: " + newCompany.allLetters());
                    System.out.println("What would you like to do?");
                    newInPut = newScan.nextInt();

                } else if (newInPut == 5) {
                    System.out.println("Here is your company's name: " + newCompany.getCompany());
                    System.out.println("What would you like to do?");
                    newInPut = newScan.nextInt();

                } else if (newInPut == 6) {
                    System.out.println("What word would you like to remove?:");
                    String removeWord = newScan.nextLine();
                    if (removeWord != "") {
                        System.out.println("You would like to remove " + removeWord + "? 'true' or 'false'.");
                        boolean yesNo = newScan.nextBoolean();
                        if (yesNo == true) {
                            boolean removed = newCompany.removeWord(removeWord);
                            if (removed == true) {
                                System.out.println(removeWord + " has been removed.");
                                System.out.println("What would you like to do?");
                                newInPut = newScan.nextInt();
                            } else {
                                System.out.println("Could not remove " + removeWord + " as it does not exist in "
                                        + newCompanyName + "'s alphabet soup.");
                                System.out.println("What would you like to do?");
                                newInPut = newScan.nextInt();
                            }
                        } else {
                            System.out.println("Canceling Removing Word");
                            System.out.println("What would you like to do?");
                            newInPut = newScan.nextInt();
                        }

                    }
                } else if (newInPut == 7) {
                    char randomChar = newCompany.randomLetter();
                    System.out.println("Random letter has been generated from " + newCompanyName
                            + "'s alphabet soup. It was " + randomChar + ".");
                    System.out.println("What would you like to do?");
                    newInPut = newScan.nextInt();
                } else {
                    System.out.println("Please insert a valid option.");
                    System.out.println("What would you like to do?");
                    newInPut = newScan.nextInt();
                }
            }

        }

    }
}