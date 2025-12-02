import java.util.Scanner;

public class Keyboard {

    private static final Scanner sc = new Scanner(System.in);

    public static int readInt() throws InvalidFormatException {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new InvalidFormatException("Input is not a valid integer.");
        }
    }

    public static double readDouble() throws InvalidFormatException {
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            throw new InvalidFormatException("Input is not a valid double.");
        }
    }

    public static String readString() {
        return sc.nextLine();
    }

    public static MyDate readDate() 
            throws InvalidFormatException, InvalidDateException {

        System.out.print("Enter day: ");
        int d = readInt();

        System.out.print("Enter month: ");
        int m = readInt();

        System.out.print("Enter year: ");
        int y = readInt();

        return new MyDate(d, m, y);
    }
}
