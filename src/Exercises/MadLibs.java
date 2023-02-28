package Exercises;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner wordInput = new Scanner(System.in);

        String[] sentence = new String[5];

            System.out.println("Enter a superpower => ");
            sentence[0] = wordInput.nextLine();
            System.out.println();
            System.out.println("Enter a city => ");
            sentence[1] = wordInput.nextLine();
            System.out.println();
            System.out.println("Pick either superhero or supervillain = >");
            sentence[2] = wordInput.nextLine();
            System.out.println();
            System.out.println("Pick 'rule' or 'save' => ");
            sentence[3] = wordInput.nextLine();
            System.out.println();
            System.out.println("Enter your alter ego name =>");
            sentence[4] = wordInput.nextLine();

            System.out.println("My name is " + sentence[4] + " , a " + sentence[2] + " who's about to " + sentence[3] + " " + sentence[1]
            + " with my ultimate quirk: " + sentence[0] + "!");

    }

}
