/*
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here is the scanner method used.

        //Variables used.
        double height;
        double weight;
        double BMI;

        System.out.print("Enter your height in inches: ");
        height = in.nextDouble(); //Inputting the height in inches.

        System.out.print("Enter your weight in pounds: ");
        weight = in.nextDouble(); //Inputting the weight in pounds

        BMI = (weight / (height * height)) * 703; //Here we are calculating the IBM

        System.out.printf("Your BMI is %.1f." ,BMI);
        System.out.println(" ");

        if (BMI >= 18.5 && BMI <= 25) //Here we are finding if is in the ideal weight
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI > 25) //Here we are finding if is overweight
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else //If is not in the ideal range, and not overweight; then is underweight.
        {
            System.out.println("You are underweight. You should see your doctor.");
        }

    }
}
