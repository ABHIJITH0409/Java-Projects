import java.util.Scanner;
public class Madlib {
    public static void main(String[] args){
        String adjective1;
        String verb1;
        String adjective2;
        String noun1;
        String noun2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter adjective1: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter adjective2: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter verb1: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter noun1: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter noun2: ");
        noun2 = scanner.nextLine();

        System.out.println("==== BRAVE EXPLORER : MYSTERIOUS TREASURE ====");
        System.out.println("The " + adjective1 + "  explorer decided to " + verb1 + " towards the " + adjective2 + " treasure, but a giant " + noun1 + 
        " suddenly appeared from the shadows. Using courage and quick thinking, the explorer escaped the dragon and finally reached the hidden treasure, becoming the "+ noun2 +" of the adventure!");

        scanner.close();

    }
    
}
