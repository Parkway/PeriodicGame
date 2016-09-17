import java.util.Scanner;

public class PeriodicGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int guessCount = 15;
        String[] elementList = {"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen","" +
        "Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminum","Silicon","Phosphorous","Sulfur","" +
        "Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese","" +
        "Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine","" +
        "Krypton","Rubidium","Strontium","Yttrium","Zirconium","Niobium","Molybdenum","Technetium","Ruthenium","" +
        "Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon","" +
        "Cesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium","Promethium","Samarium","Europium","" +
        "Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Ytterbium","Lutetium","Hafnium","" +
        "Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead","" +
        "Bismuth","Polonium","Astatine","Radon","Francium","Radium","Actinium","Thorium","Protactinium","" +
        "Uranium","Neptunium","Americium","Curium","Berkelium","Californium","Einsteinium","Fermium","" +
        "Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium","" +
        "Meitnerium","Darmstadtium","Roentgenium","Ununbium","Ununtrium","Ununquadium","Ununpentium","" +
        "Ununhexium","Ununseptium","Ununoctium"};

        int elementLength = elementList.length;
        int elementNumber = (int) (Math.random() * elementLength);
        String elementName = elementList[elementNumber];
        System.out.println("This program randomly selects an element. You have to guess which element it is.\n" +
                "You have 15 chances to get it, or you lose. Good Luck.");
        while (guessCount > 0) {
            guessCount--;
            int elementGuess = scn.nextInt();
            if (elementGuess == elementNumber) {
                System.out.println("You got it! " + elementNumber + " is the atomic number for " + elementName + ".");
            } else if (elementGuess > elementNumber) {
                System.out.println("Too high, try again.");
            } else if (elementGuess < elementNumber) {
                System.out.println("Too low, guess again.");
            }
        }
    }
}
