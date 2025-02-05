//  Class author:  Raley
//  Date created:  10/30/2024
//  General description: The class to make different triangles based on what is put in.



//  Pre-condition: what must be true prior to the method being called
//  including possible limitations on input
//  Post-condition: what the result of executing this method will be. 

public class PatGenCode {


   /*
      Pre-condition: Imput an interger. Only whole, positive numbers.
      Post-condition: Outputs a triangle which is made out
        of '*' characters with as many rows as the imputed
        interger and with colums that start at 1 '*' and 
        increase by 2, going up each time.
    */

    public static void stars(int rows){
        if (rows > 0) {
            int finalRows = rows*2 - 1;
            int i = 0;
            int theColums = 0;
                while (finalRows > 0) {
                    while (theColums%2 != 0){
                        if (theColums <= finalRows){
                            System.out.println(""); 
                            while (i < theColums) {
                                System.out.print("*");
                                i++;
                            }
                            theColums = theColums + 1;
                            i = 0;
                    } else { 
                    return;
                    }
                }
                theColums = theColums + 1;
            }
        } else {
            System.out.print("Apologies, I can't do that. Please insert a positive number.");
        }
    }



    /*
      Pre-condition: Imput an interger. Only whole, positive numbers.
      Post-condition: Outputs a triangle which is made out
        of number characters, going up with each number of 
        rows with as many rows as the imputed interger and 
        with colums that are rowNumber + 1 long, going up
        each time.
    */

    public static void triangle(int rows){
    if (rows > 0) {
        int theColums = 0;
        int i = 0;
            while (rows > 0) {
                if (theColums <= rows){
                    while (i < theColums) {
                        System.out.print(theColums);
                        i++;
                    }
                    System.out.println("");
                    theColums = theColums + 1;
                    i = 0;
                } else { 
                    return;
                }
            }
        } else {
            System.out.print("Apologies, I can't do that. Please insert a positive number.");
        }  
    }



    /*
      Pre-condition: Imput an interger. Only odd, whole, positive numbers.
      Post-condition: Outputs a triangle which is made out
        of number characters, going down with each number of 
        rows with as many rows as the imputed interger and 
        with colums that are rowNumber - 2 long, going down
        each time.
    */
    
    public static void odds(int rows){
        if (rows > 0) {
        if (rows%2 != 0) {
            int theColums = rows;
            int i = 0;
                while (theColums > 0) {
                    if (theColums <= rows){
                        while (i < theColums) {
                            System.out.print(theColums);
                            i++;
                        }
                        System.out.println("");
                        theColums = theColums - 2;
                        i = 0;
                    } else { 
                        return;
                    }
                }
            } else {
                System.out.print("Apologies, I can't do that. Please insert an odd number.");
                return;
            }
        } else {
            System.out.print("Apologies, I can't do that. Please insert a positive number.");
        }
    }   
    
    

    /*
      Pre-condition: Imput an interger. Only whole, positive numbers.
      Post-condition: Outputs a triangle which is made out
        of 'O' and 'E' characters, going up with each number of 
        rows till it reaches as many rows as the imputed interger 
        and then does thhe opposite with colums that are 
        rowNumber - 1 long, evens are 'E' rows and odds are 'O' rows.
    */

    public static void eo(int maxE){
        if (maxE > 0) {
        boolean typeE;
        int rows = 0;
            if (maxE%2 == 1) {
                typeE = true;
            } else {
                typeE = false;
            }
            while (rows < maxE) {
                for (int i = 0; i <= rows; i++){
                    if (typeE) {
                        System.out.print("E");
                    } else {
                        System.out.print("O");
                    }
                }
                rows = rows +1;
                if (typeE == true) {
                    typeE = false;
                } else {
                    typeE = true;
                }
                System.out.println("");
            }
            while (rows > 0) {
                for (int i = rows-1; i > 0; i--){
                    if (typeE) {
                        System.out.print("E");
                    } else {
                        System.out.print("O");
                    }
                }
                rows = rows - 1;
                if (typeE == true) {
                    typeE = false;
                } else {
                    typeE = true;
                }
                System.out.println("");
            }
            return;
        } else {
            System.out.print("Apologies, I can't do that. Please insert a positive number.");
        }
    } 
    
    

    /*
      Pre-condition: Imput an interger. Only whole, positive numbers.
      Post-condition: An upside down pyramid which starts
        large (the first row in ImputNumber long) and gets
        smaller with each iteration. The first number is 
        always 1 and it goes up by 1 for each iteration.
        Using the number of rows already printed it adds
        a number of " "s before each row to make the 
        pyramid centered so that its an actual equilateral
        pyramid and not a right triangle.
    */

    public static void pyramid(int rows){
        if (rows > 0) {
        int manyRows = rows*2 -1;
        int theColums = 1;
        int i = 0;
            while (theColums <= rows) {
                if (theColums <= rows){
                    for (int j = theColums-1; j > 0; j--){
                        System.out.print(" ");
                    }
                    while (i < manyRows) {
                        System.out.print(theColums);
                        i++;
                    }
                    System.out.println("");
                    theColums = theColums + 1;
                    manyRows = manyRows - 2;
                    i = 0;
                } else { 
                    return;
                }
            }
        } else {
            System.out.print("Apologies, I can't do that. Please insert a positive number.");
        }
    }

}