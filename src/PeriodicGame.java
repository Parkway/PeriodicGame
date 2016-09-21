import java.util.Scanner; //Text input

public class PeriodicGame { //Starts class PeriodicGame
    public static void main(String[] args) { //Starts main method
        print("There are 118 elements. How many do you know?"); //Displays text to user
        game(); //Calls game method to allow for recursion.
    }
    private static void print(String s){ //I am far too lazy to type System.out.println(); this man times. This ought to speed it up.
        System.out.println(s);
    }
    private static void stringRepeat() { //Removes four separate code blocks by making one method.
        Scanner stringRep = new Scanner(System.in);
        print("Would you like to continue playing?");
        String again = stringRep.nextLine();
        if (again.toLowerCase().contains("y".toLowerCase())) { //If answer has "y" in it, interpret as yes.
            // Too many variations of "Yeah","Yes","Yah","Ya","etc"
            game();
        } else if (again.toLowerCase().contains("n".toLowerCase())) { //If answer has "n", interpret as no.
            // Look up three lines for reasoning.
            System.exit(0);
        }
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

        print("Which do you need practice with, Atomic Numbers, or Element Names?");
        String gameType = scn.nextLine();
        if (gameType.toLowerCase().contains("atom".toLowerCase()) || gameType.toLowerCase().contains("num".toLowerCase())) {
            /*If user enters any text containing "atom" or "num", start Atomic Number game.
            ATOMIC GAME */
            print("In this game, you have to enter the atomic number of the element to win."
                    + "\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe element is: " + elementName);
            while (guessCount > 0) { //While loop. While guessCount is more than 0(Starts at 3), do that stuff down below.
                guessCount--; //Decrements one from guessCount variable.
                int numGuess = scn.nextInt();
                if (numGuess == elementNumber) { // If guess = the correct number:
                    print("You got it! The atomic number for " + elementName + " is " + elementNumber + "!");
                    stringRepeat(); //Call repeat method.
                } else {
                    print("Not quite right. " + guessCount + " guesses remaining.");
                }
                if (guessCount == 0) {
                    print("You lose. The correct answer was: " + elementNumber);
                    stringRepeat();
                }
            }
        } else if (gameType.toLowerCase().contains("ele".toLowerCase()) || gameType.toLowerCase().contains("nam")) {
            /*If user enters any text containing "ele" or "nam", start Element Name game.
              ELEMENT GAME*/
            print("In this game, you need to enter the name of the element represented by the atomic number to win."
                    + "\nYou have " + guessCount + " tries. Good luck."
                    + "\nThe atomic number is: " + elementNumber);
            while(guessCount > 0) {
                guessCount--;
                String eleGuess = scn.nextLine();
                if(eleGuess.toLowerCase().equals(elementName.toLowerCase())) {
                    print("You won! The Element with Atomic Number " + elementNumber + " is " + elementName + ".");
                    stringRepeat();
                    } else {
                    print("Not quite. " + guessCount + " guesses left.");
                    } if (guessCount == 0) {
                    print("You lose. The correct answer was: " + elementName);
                    stringRepeat();
                }
            }
        } else { //If input is not one of the options, do this:
            print(gameType + " is not an option. Try again.");
            game();
        }
    }
}