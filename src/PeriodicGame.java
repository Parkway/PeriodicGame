import java.util.Scanner;

public class PeriodicGame {
    public static void main(String[] args) {
        System.out.println("There are 118 elements. How many do you know?");
        game();
    }
    private static void game() {
        Scanner scn = new Scanner(System.in);
        int guessCount = 3;
        String[] elementList = {"AddOneium","Hydrogen","Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "" +
                "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorous", "Sulfur", "" +
                "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "" +
                "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "" +
                "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "" +
                "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "" +
                "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "" +
                "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "" +
                "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "" +
                "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "" +
                "Uranium", "Neptunium","Plutonium","Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "" +
                "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "" +
                "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "" +
                "Livermorium", "Tennessine", "Oganesson"};

        int elementLength = elementList.length;
        int elementNumber = (int) (Math.random() * elementLength);
        String elementName = elementList[elementNumber];

        System.out.println("Which do you need practice with, Atomic Numbers, or Element Names?");
        String gameType = scn.nextLine();
        if (gameType.toLowerCase().contains("atom".toLowerCase()) || gameType.toLowerCase().contains("num".toLowerCase())) {
            // ATOMIC GAME
            System.out.println("In this game, you have to enter the atomic number of the element to win."
                    + "\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe element is: " + elementName);
            while (guessCount > 0) {
                guessCount--;
                int numGuess = scn.nextInt();
                    if(numGuess == elementNumber) {
                        System.out.println("You got it! The atomic number for " + elementName + " is " + elementNumber + "!");
                        System.out.println("Would you like to continue playing? Enter [1] for yes, and [2] for no.");

                        int again = scn.nextInt();
                        if (again == 1) {
                            game();
                        } else if (again == 2) {
                            System.out.println("Good bye.");
                            System.exit(0);
                        } else {
                            System.out.println("Not quite. You have " + guessCount + " guesses remaining.");
                        }
                    }

                    } if (guessCount == 0) {
                        System.out.println("You lose. The correct answer was: " + elementNumber);
                        System.out.println("Would you like to continue playing? Enter [1] for yes, and [2] for no.");
                        int again = scn.nextInt();
                        if (again == 1) {
                            game();
                        } else if (again == 2) {
                            System.out.println("Good bye.");
                            System.exit(0);
                        }
                }

        } else if (gameType.toLowerCase().contains("ele".toLowerCase()) || gameType.toLowerCase().contains("nam")) {
            // ELEMENT GAME
            System.out.println("In this game, you need to enter the name of the element represented by the atomic number to win.\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe atomic number is: " + elementNumber);
            while(guessCount > 0) {
                guessCount--;
                String eleGuess = scn.nextLine();
                if(eleGuess.toLowerCase().equals(elementName.toLowerCase())) {
                    System.out.println("You won! The Element with Atomic Number " + elementNumber + " is " + elementName + ".");
                    System.out.println("Would you like to continue playing?");
                    String again = scn.nextLine();
                    if (again.toLowerCase().contains("y".toLowerCase())) {
                        game();
                    } else if (again.toLowerCase().contains("n".toLowerCase())) {
                        System.exit(0);
                    }
                    } else {
                    System.out.println("Not quite. " + guessCount + " guesses left.");
                    } if (guessCount == 0) {
                    System.out.println("You lose. The correct answer was: " + elementName);
                    System.out.println("Would you like to continue playing?");

                    String again = scn.nextLine();
                    if (again.toLowerCase().contains("y".toLowerCase())) {
                        game();
                    } else if (again.toLowerCase().contains("n".toLowerCase())) {
                        System.out.println("Good bye.");
                        System.exit(0);
                    }
                }
            }
        } else {
            System.out.println(gameType + " is not an option. Try again.");
            game();
        }
    }
}