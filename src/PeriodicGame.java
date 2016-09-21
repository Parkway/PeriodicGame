import java.util.Scanner; //Text input

public class PeriodicGame { //Starts class PeriodicGame
    public static void main(String[] args) { //Starts main method
        System.out.println("There are 118 elements. How many do you know?"); //Displays text to user
        game(); //Calls game method to allow for recursion.
    }
    private static void game() { //Game method
        Scanner scn = new Scanner(System.in); //Scanner for Sys.in
        int guessCount = 3; //Number of guesses
        String[] elementList = {"","Hydrogen","Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "" +
                "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorous", "Sulfur", "" +
                "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "" +
                "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "" +
                "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "" +
                "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "" +
                "Caesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "" +
                "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "" +
                "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "" +
                "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "" +
                "Uranium", "Neptunium","Plutonium","Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "" +
                "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "" +
                "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "" +
                "Livermorium", "Tennessine", "Oganesson"}; //Ordered list of allllll the elements to allow for selections.

        int elementLength = elementList.length; //Determines length of elementList{}
        int elementNumber = (int) (Math.random() * elementLength); //Pulls random number from elementLength()
        String elementName = elementList[elementNumber]; //Converts number back to string for initial input.

        System.out.println("Which do you need practice with, Atomic Numbers, or Element Names?" + elementLength);
        String gameType = scn.nextLine();
        if (gameType.toLowerCase().contains("atom".toLowerCase()) || gameType.toLowerCase().contains("num".toLowerCase())) {
            /*If user enters any text containing "atom" or "num", start Atomic Number game.
            ATOMIC GAME */
            System.out.println("In this game, you have to enter the atomic number of the element to win."
                    + "\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe element is: " + elementName);
            while (guessCount > 0) { //While loop. While guessCount is more than 0(Starts at 3), do that stuff down below.
                guessCount--; //Decrements one from guessCount variable.
                int numGuess = scn.nextInt();
                if (numGuess == elementNumber) { // If guess = the correct number:
                    System.out.println("You got it! The atomic number for " + elementName + " is " + elementNumber + "!");
                    System.out.println("Would you like to continue playing? Enter [1] for yes, and [2] for no."); //Can't do strings because InputMismatch exceptions. Not sure how to fix.
                    int again = scn.nextInt();
                    if (again == 1) {
                        game(); //Recursively calls function to start game over.
                    } else if (again == 2) {
                        System.out.println("Good bye.");
                        System.exit(0); //Kill program :'(
                    }
                } else {
                    System.out.println("Not quite right. " + guessCount + " guesses remaining.");
                }
                if (guessCount == 0) {
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
            }
        } else if (gameType.toLowerCase().contains("ele".toLowerCase()) || gameType.toLowerCase().contains("nam")) {
            /*If user enters any text containing "ele" or "nam", start Element Name game.
              ELEMENT GAME*/
            System.out.println("In this game, you need to enter the name of the element represented by the atomic number to win."
                    + "\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe atomic number is: " + elementNumber);
            while(guessCount > 0) {
                guessCount--;
                String eleGuess = scn.nextLine();
                if(eleGuess.toLowerCase().equals(elementName.toLowerCase())) {
                    System.out.println("You won! The Element with Atomic Number " + elementNumber + " is " + elementName + ".");
                    System.out.println("Would you like to continue playing?");
                    String again = scn.nextLine();
                    if (again.toLowerCase().contains("y".toLowerCase())) { //If answer has "y" in it, interpret as yes.
                        // Too many variations of "Yeah","Yes","Yah","Ya","etc"
                        game();
                    } else if (again.toLowerCase().contains("n".toLowerCase())) { //If answer has "n", interpret as no.
                        // Look up three lines for reasoning.
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