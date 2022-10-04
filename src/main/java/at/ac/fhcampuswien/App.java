package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char zahl1 = 'Z';
        int zahl2  = 0xface;
        int zahl3 = 012;
        long zahl4 = 80L;
        float zahl5 = 44e-1f;
        float zahl6 = 5.5f;
        double zahl7 = 8.88e1;
        double zahl8 = 99.9;


        int ergebnis = zahl1 + zahl2 + zahl3 + (int)zahl4 + (int)zahl5 + (int)zahl6 + (int)zahl7 + (int)zahl8;
        System.out.println(ergebnis);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int number1 = sc.nextInt();
        System.out.print("y: ");
        int number2 = sc.nextInt();
        //XOR Operator (Immer 0 wenn beide Eingaenge gleich sind)
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;
        System.out.println("After Swap:");
        System.out.println("x: " + number1);
        System.out.println("y: " + number2);
    }

    //todo Task 6
    public void compareTwoNumbers(){

        Scanner sc = new Scanner(System.in);

        System.out.print("n1: ");
        int number1 = sc.nextInt();
        System.out.print("n2: ");
        int number2 = sc.nextInt();

        if (number1 > number2)
        {
            System.out.println("n1 > n2");
        }
        else if (number2 > number1)
        {
            System.out.println("n2 > n1");
        }
        else
        {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int number1 = sc.nextInt();
        if (number1 < 0 || number1 >= 100000)
        {
            System.out.println("Invalid Revenue");
        }
        else if (number1 < 0 || number1 < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }
        else if (20000 <= number1 && number1 < 50000)
        {
            System.out.println("Average Sales Revenue");
        }
        else if (50000 <= number1 && number1 < 80000)
        {
            System.out.println("Good Sales Revenue");
        }
        else if (80000 <= number1 && number1 < 100000)
        {
            System.out.println("Excellent Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        String comrate;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int number1 = sc.nextInt();
        switch(number1)
        {
            case 1:
                comrate = "Your Commission Rate was set to " + 0.01;
                break;

            case 2:
                comrate = "Your Commission Rate was set to " + 0.02;
                break;

            case 3:
                comrate = "Your Commission Rate was set to " + 0.03;
                break;

            case 4:
                comrate = "Your Commission Rate was set to " + 0.04;
                break;

            default:
                comrate = "Your Commission Rate was set to 0.0";
                break;
        }
        System.out.println(comrate);
    }

    //todo Task 9
    public void leapyear(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Year: ");
        int year = sc.nextInt();
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Leapyear");;
                }
                else
                {
                    System.out.println("Not a Leapyear");
                }
            }
            else
            {
                System.out.println("Leapyear");;
            }
        }
        else
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number1 = sc.nextInt();

        int result = 0;
        while (number1 > 0){
            result = (result * 10) + (number1 % 10);
            number1 = number1/10;
        }
        System.out.println(result);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}