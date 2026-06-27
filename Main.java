ximport java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello Abhijith");
        System.out.println("Welcome to Java");

        // String name = "Abhijith";
        // int age = 19;
        // double cgpa = 8.84;

        // System.out.println("Name = " + name);
        // System.out.println("Age = " + age);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close();

    }
}


