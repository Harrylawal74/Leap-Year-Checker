import java.util.Scanner;

public class Main {

    //takes year as a parameter and runs arithmetic calculations to confirm leap year
    public static void isLeapYear (int year){
        if(year%400==0){
            System.out.println("Leap Year");

        }else if(year%4==0 && year%100 != 0){
            System.out.println("Leap Year");

        }else {
            System.out.println("Not a leap year");
        }

    }

    //Test
    public static void main(String[] args) {
        //Asks user for year as an input and assigns value to 'Year' variable
        Scanner scanner = new Scanner(System.in);
        int Year = scanner.nextInt();
        isLeapYear(Year);
    }


}