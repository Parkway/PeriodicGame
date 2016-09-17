import java.util.Random;
import java.util.Scanner;

public class PeriodicGame {
    public static void main(String[] args) {
        Random element = new Random();
        Scanner scn = new Scanner(System.in);
        int elementNum = element.nextInt(118) + 1;
        System.out.println("This is a game designed to help players learn the periodic table.\n" +
                "The computer will randomly select an atomic number of any element,\n" +
                "and you must guess which element it is by entering the correct abbreviation. You have 15 tries.\n" +
                "Good luck.");
        int count = 15;
        while(count > 0) {
            count--;
            String yourEle = scn.next();


        }

    }
}