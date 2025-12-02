public class App {

    public static void main(String[] args) {

        System.out.println("Hi, we are going to check wether a year is a leap year or not");

        try {
            MyDate date = Keyboard.readDate();

            if (date.isLeapYear())
                System.out.println("The year " + date.getYear() + " IS a leap year.");
            else
                System.out.println("The year " + date.getYear() + " is NOT a leap year.");

        } catch (InvalidFormatException | InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

