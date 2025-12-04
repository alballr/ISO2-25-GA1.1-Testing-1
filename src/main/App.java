import es.uclm.esi.iso2.axx.command_Line_Interface.commandLine;

import es.uclm.esi.iso2.axx.command_Line_Interface.commandLineI;
public class App {

    public static void main(String[] args) {
    	commandLine commL= new CommandLine();
        System.out.println("Hi, we are going to check wether a year is a leap year or not");

        try {
        	Date fulldate=commL.readDate()
            MyDate date = new MyDate(fulldate.getDay(),fulldate.getMonth(),fulldate.getYear());

            if (date.isLeapYear()) {
                System.out.println("The year " + date.getYear() + " IS a leap year.");
            }else {
                System.out.println("The year " + date.getYear() + " is NOT a leap year.");
            }
        } catch (InvalidFormatException | InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

