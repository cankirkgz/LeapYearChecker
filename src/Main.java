import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir yıl girin: "); // Prompt the user to enter a year
        year = scanner.nextInt();

        if (year % 4 == 0) { // Check if the year is divisible by 4
            if (year % 100 == 0) { // Check if the year is divisible by 100
                if (year % 400 == 0) { // Check if the year is divisible by 400
                    System.out.println(year + " bir artık yıldır!"); // The year is a leap year
                } else {
                    System.out.println(year + " bir artık yıl değildir!"); // The year is not a leap year
                }
            } else {
                System.out.println(year + " bir artık yıldır!"); // The year is a leap year
            }
        } else {
            System.out.println(year + " bir artık yıl değildir!"); // The year is not a leap year
        }
    }
}