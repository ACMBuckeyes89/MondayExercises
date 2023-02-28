package Exercises;

import java.util.Scanner;

public class GradingCalc {
    public static void main(String[] args) {

        int grade;
        //Creating a scanner to input letter grade
        Scanner gradeInput = new Scanner(System.in);
        System.out.print("Enter grade => ");
        grade = Integer.parseInt(gradeInput.nextLine());
        //System.out.println(grade);
        //Creating an if statement to print out correct letter grade
        if (grade >= 93){
            System.out.println("A");
        } else if (grade >= 90 && grade <=92){
            System.out.println("A-");
        } else if (grade >= 87 && grade <=89){
            System.out.println("B+");
        } else if (grade >= 83 && grade <= 86){
            System.out.println("B");
        } else if (grade >= 80 && grade <= 82){
            System.out.println("B-");
        } else if (grade >= 77 && grade <= 79){
            System.out.println("C+");
        } else if (grade >= 73 && grade <= 76){
            System.out.println("C");
        } else if (grade >= 70 && grade <= 72){
            System.out.println("C-");
        } else if (grade >= 65 && grade <= 69){
            System.out.println("D");;
        } else {
            System.out.println("F");;
        }

        //Stretch -> write a loop to accept multiple grades, perhaps only accepting up to 6 grade
    }
}
