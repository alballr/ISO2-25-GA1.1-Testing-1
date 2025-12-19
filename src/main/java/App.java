
import java.util.Date;

import es.uclm.esi.iso2.axx.command_Line_Interface.commandLine;

public class App {

    public static void main(String[] args) throws InvalidFormatException {
    	commandLine commL= new commandLine();
        System.out.println("Hi, we are going to check wether a year is a leap year or not");

        try {
        	Date fulldate=commL.readDate();
            @SuppressWarnings("deprecation")
			MyDate date = new MyDate(fulldate.getDay(),fulldate.getMonth()+1,fulldate.getYear()+1900);

            if (date.isLeapYear()) {
                System.out.println("The year " + date.getYear() + " IS a leap year.");
            }else {
                System.out.println("The year " + date.getYear() + " is NOT a leap year.");
            }
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}