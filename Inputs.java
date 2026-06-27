import java.util.Scanner;

public class Inputs{
    public static void main(String[] args){

        double Width = 0;
        double Height = 0;
        double Area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        Width = scanner.nextDouble();

        System.out.print("Enter the Height: ");
        Height = scanner.nextDouble();

        Area = Width * Height;

        System.out.print("The area is " + Area + "cm2")





        scanner.close();
    }
}
