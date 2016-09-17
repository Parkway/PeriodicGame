import java.util.Random;
import java.util.Scanner;

public class PeriodicGame {
    public static void main(String[] args) {
        String[] elementList = {"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen" +
        "Oxygen","Fluorine","Neon","Sodium"};
        int elementLength = elementList.length;
        int elementName = (int) (Math.random() * elementLength);
        System.out.println("The element is " + elementName);


        Random element = new Random();
        Scanner scn = new Scanner(System.in);
        int elementNum = element.nextInt(118) + 1;
        System.out.println("This is a game designed to help players learn the periodic table.\n" +
                "The computer will randomly select an atomic number of any element,\n" +
                "and you must guess which element it is by entering the correct abbreviation. You have 20 tries.\n" +
                "Good luck.");
        int count = 20;

        while(count > 0) {
            count--;
            int yourEle = scn.nextInt();
            if(yourEle == elementNum) {
                System.out.println("You got it. Element number " + elementNum + ", also known as " + elementName + " is");
            }
        }

    }
}
