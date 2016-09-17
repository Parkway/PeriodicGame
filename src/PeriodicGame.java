import java.util.Scanner;

public class PeriodicGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] elementList = {"Hydrogen","Helium","Lithium","Beryllium","Boron","Carbon","Nitrogen" +
        "Oxygen","Fluorine","Neon","Sodium","Magnesium","Aluminum","Silicon","Phosphorous","Sulfur" +
        "Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium","Chromium","Manganese" +
        "Iron","Cobalt","Nickel","Copper","Zinc","Gallium","Germanium","Arsenic","Selenium","Bromine" +
        "Krypton","Rubidium","Strontium","Yttrium","Zirconium","Niobium","Molybdenum","Technetium","Ruthenium" +
        "Rhodium","Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tellurium","Iodine","Xenon" +
        "Cesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium","Promethium","Samarium","Europium" +
        "Gadolinium","Terbium","Dysprosium","Holmium","Erbium","Thulium","Ytterbium","Lutetium","Hafnium" +
        "Tantalum","Tungsten","Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead" +
        "Bismuth","Polonium","Astatine","Radon","Francium","Radium","Actinium","Thorium","Protactinium" +
        "Uranium","Neptunium","Americium","Curium","Berkelium","Californium","Einsteinium","Fermium" +
        "Mendelevium","Nobelium","Lawrencium","Rutherfordium","Dubnium","Seaborgium","Bohrium","Hassium" +
        "Meitnerium","Darmstadtium","Roentgenium","Ununbium","Ununtrium","Ununquadium","Ununpentium" +
        "Ununhexium","Ununseptium","Ununoctium"};

        int elementLength = elementList.length;
        int elementName = (int) (Math.random() * elementLength);
        System.out.println("The element is " + elementName +
        "\nWhat element is it?");
        String intToString = elementList[elementName];
        String elementGuess = scn.next();
        if (elementGuess.equals(intToString))
        System.out.println(elementName + ", some shit. " + intToString);
    }
}
