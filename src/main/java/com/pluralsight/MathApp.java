package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        /*
            Create two variables to represent the salary for Bob and Gary, name them
            bobSalary and garySalary. Create a new variable named
            highestSalary. Determine whose salary is greater using Math.max() and
            store the answer in highestSalary. Set the initial salary variables to any
            value you want. Print the answer (i.e "The highest salary is …")
         */

        //just printing a visual header
        System.out.println("-- #1 Highest Salary --");

        //variables to represent bob and garys salary
        int bobSalary =  45000;
        int garySalary = 185000;

        //store the higher salary in the highestSalary variable
        int highestSalary = Math.max(bobSalary, garySalary);

        //print out a sentance with the highest salary
        System.out.println("The highest salary is " + highestSalary);

        //print a blank line for separation
        System.out.println();


        /*
            find and display the smallest of two variables named carPrice and
            truckPrice. Set the variables to any value you want.
         */

        //just printing a visual header
        System.out.println("-- #2 lowest vehicle price --");

        //variables to represent vehicle prices
        double carPrice =  54225.76;
        double truckPrice = 62367.82;

        //store the lowest vehicle price
        double lowestPrice = Math.min(carPrice, truckPrice);

        //print out a sentance with the cost of the vehicle displaying the lowest
        System.out.println("The lowest vehicle price is  " + lowestPrice);

        //print a blank line for separation
        System.out.println();


        /*
            Find and display the area of a circle whose radius is 7.25
         */

        //just printing a visual header
        System.out.println("-- #3 area of a circle with a radius of 7.25 --");

        //variables to represent radius and area
        double radius =  7.25;
        double area = Math.PI * radius * radius; //Math.PI * Math.pow(radius, 2);

        //print out a sentance with the area of a circle
        System.out.println("The area of a circle with radius " + radius + " is " + Math.round(area)  );

        //print a blank line for separation
        System.out.println();


        /*
        Find and display the square root a variable after it is set to 5.0
         */

        //just a header for my question
        System.out.println("-- #4 square root of 5.0 --");

        //create variables to work with
        double numberToGetSquareRootOf = 5.0;

        //print out the result
        System.out.println( "The square root of " + numberToGetSquareRootOf + " is " + Math.round( Math.sqrt(numberToGetSquareRootOf) ) );

        System.out.println();

        /*
        Find and display the distance between the points (5, 10) and (85, 50)
        */

        //just printing a visual header
        System.out.println("-- #5 distance between the points (5, 10) and (85, 50)--");

        //variables for coordinates and distance
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        //display the result
        System.out.println("The distance between ("+x1+", "+x2+") and ("+y1+", "+y2+")) is " + distance);

        //print a blank line for separation
        System.out.println();

        /*
        Find and display the absolute (positive) value of a variable after it is set to -3.8
        */

        //just printing a visual header
        System.out.println("-- #6 display the absolute (positive) value of a variable");

        //create the variables
        double negativeNumber = -3.8;

        //display the result
        System.out.println("The absolute (positive) value of " +negativeNumber+ " is " + Math.abs(negativeNumber));

        //print a blank line for separation
        System.out.println();

        /*
        Find and display a random number between 0 and 1
        */

        //just printing a visual header
        System.out.println("-- #7 Random Number");

        double randomNumnber = Math.random();

        //display the result
        System.out.println(randomNumnber + " is a random number between 0 and 1");

        //print a blank line for separation
        System.out.println();

        /*
        Calculate how many minutes are in 24 days, use a variable for each value you
        calculate with. BONUS: How many milliseconds?
        */

        //just printing a visual header
        System.out.println("-- #8 Minutes and milliseconds in 24 days");

       //create variables
        int numDays = 24;
        int hoursInDay = 24;
        int minutesPerHour = 60;

        //calc minutes
        double totalMinutes = numDays * hoursInDay * minutesPerHour;
        //convert to long to get a human readable number (typecasting)
        long totalMilliseconds = (long) totalMinutes * 60 * 1000;

        System.out.println("There are " +totalMinutes+" minutes in " + numDays+ " days");
        System.out.println("There are " +totalMilliseconds+" milliseconds in " + numDays+ " days");

    }

}
