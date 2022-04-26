import java.util.Scanner;

public class Poised {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter project number : ");
        int questionP1 = input.nextInt();

        System.out.println("Enter project name : ");
        String questionP2 = input.nextLine();

        System.out.println("What type of building is being designed? exp'house, apartment block or store, ect ");
        String questionP3 = input.nextLine();

        System.out.println("Enter project Address : ");
        String questionP4 = input.nextLine();

        System.out.println("Enter in the ERF number : ");
        int questionP5 = input.nextInt();

        System.out.println("Enter total fee being charged for the project : ");
        int questionP6 = input.nextInt();

        System.out.println("Enter total amount paid to dat : ");
        int questionP7 = input.nextInt();

        System.out.println("Enter deadline for the project : ");
        String questionP8 = input.nextLine();



        System.out.println("Enter Architect Name : ");
        String questionA1 = input.nextLine();

        System.out.println("Enter Architect Telephone Number : ");
        int questionA2 = input.nextInt();

        System.out.println("Enter Architect Email Address  : ");
        String questionA3 = input.nextLine();



        System.out.println("Enter Contractor Name : ");
        String questionCo1 = input.nextLine();

        System.out.println("Enter Contractor Telephone Number : ");
        int questionCo2 = input.nextInt();

        System.out.println("Enter Contractor Email Address  : ");
        String questionCo3 = input.nextLine();




        System.out.println("Enter Client Name : ");
        String questionCl1 = input.nextLine();

        System.out.println("Enter Client Telephone Number : ");
        int questionACl2 = input.nextInt();

        System.out.println("Enter Client Email Address  : ");
        int questionCl3 = input.nextInt();


        project Assignment = new project(questionP1 ,questionP2 ,questionP3 ,questionP4 ,questionP5 ,questionP6 ,questionP7 ,questionP8);
        architect Designer = new architect(questionA1 ,questionA2 ,questionA3);
        contractor Builder = new contractor(questionCo1 ,questionCo2 ,questionCo3);

        System.out.println(Assignment);
        System.out.println(Designer);
        System.out.println(Builder);

    }
}

