import java.util.Scanner;

public class PeriodicGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int guessCount = 3;
        String[] elementList = {"Testhere", "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "" +
                "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorous", "Sulfur", "" +
                "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "" +
                "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "" +
                "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "" +
                "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "" +
                "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "" +
                "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "" +
                "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "" +
                "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "" +
                "Uranium", "Neptunium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "" +
                "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "" +
                "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "" +
                "Livermorium", "Tennessine", "Oganesson"};

        int elementLength = elementList.length;
        int elementNumber = (int) (Math.random() * elementLength);
        String elementName = elementList[elementNumber];
        System.out.println("Which do you need practice with, Atomic Numbers, or Element Names?");
        String gameType = scn.nextLine();
        if (gameType.toLowerCase().contains("atom".toLowerCase()) || gameType.toLowerCase().contains("num".toLowerCase())) {
            System.out.println("In this game, you have to enter the atomic number of the hidden element to win.\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe element is: " + elementName);

            while (guessCount > 0) {
                guessCount--;
                int numGuess = scn.nextInt();
                if(numGuess == elementNumber) {
                    System.out.println("You got it! The atomic number for " + elementName + " is " + elementNumber + "!");
                    System.exit(0);
                } else {
                    System.out.println("Not quite. You have " + guessCount + " guesses remaining.");
                } if (guessCount == 0) {
                    System.out.println("You lose. The correct answer was: " + elementNumber);
                }
            }
        } else if (gameType.toLowerCase().contains("ele".toLowerCase()) || gameType.toLowerCase().contains("nam")) {

            System.out.println("In this game, you need to enter the name of the element represented by the atomic number to win.\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe atomic number is: " + elementNumber);
            while(guessCount > 0) {
                guessCount--;
                String eleGuess = scn.nextLine();
                if(eleGuess.toLowerCase().equals(elementName.toLowerCase())) {
                    System.out.println("You won! The Element with Atomic Number " + elementNumber + " is " + elementName + ".");
                    System.exit(0);
                } else {
                    System.out.println("Not quite. " + guessCount + " guesses left.");
                } if (guessCount == 0) {
                    System.out.println("You lose. The correct answer was: " + elementName
                    + "\nYou entered: " + eleGuess);
                }
            }
        } else {
            System.out.println(gameType + " is not an option. Try again.");
        }
    }
}