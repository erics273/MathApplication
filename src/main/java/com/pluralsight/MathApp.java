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

        //variables to represent bob and garys salary
        int bobSalary =  45000;
        int garySalary = 185000;

        //store the higher salary in the highestSalary variable
        int highestSalary = Math.max(bobSalary, garySalary);

        //print out a sentance with the highest salary
        System.out.println("The highest salary is " + highestSalary);



    }

}
