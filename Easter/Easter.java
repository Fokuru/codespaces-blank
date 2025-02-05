package Easter;
/*
 * My name is Raley Wilkin
 * This is my Easter Calculator
 * Made 9/4/2024
 */


 public class Easter {
    public static void main(String[] args) {
        // Variables:
        int y = 2025;
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int f = (b+8)/25;
        int g = ((b-f)+1)/3;
        int h = (19*a+b-d-g+15)%30;
        int i = c/4;
        int k = c%4;
        int r = (32+2*e+2*i-h-k)%7;
        int m = (a+11*h+22*r)/451;
        int n = (h+r-7*m+114)/31;
        int p = (h+r-7*m+114)%31;

        // Output:
        System.out.println("y is " + y);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("d is " + d);
        System.out.println("e is " + e);
        System.out.println("f is " + f);
        System.out.println("g is " + g);
        System.out.println("h is " + h);
        System.out.println("i is " + i);
        System.out.println("k is " + k);
        System.out.println("r is " + r);
        System.out.println("m is " + m);
        System.out.println("n is " + n);
        System.out.println("p is " + p);

        String theMonth = "edit";
        if (n==1){
            theMonth = "January";
        } else if (n==2){
            theMonth = "February";
        } else if (n==3){
            theMonth = "March";
        } else if (n==4){
            theMonth = "April";
        } else if (n==5){
            theMonth = "May";
        } else if (n==6){
            theMonth = "June";
        } else if (n==7){
            theMonth = "July";
        } else if (n==8){
            theMonth = "August";
        } else if (n==9){
            theMonth = "September";
        } else if (n==10){
            theMonth = "October";
        } else if (n==11){
            theMonth = "Novermber";
        } else if (n==12){
            theMonth = "December";
        }

        int theDay = p+1;

        System.out.println("Easter will fall on " + theMonth + ", " + theDay + " in the year " + y + ".");
    }
}
