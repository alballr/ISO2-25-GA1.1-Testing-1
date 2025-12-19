public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) 
            throws InvalidDateException {

        if (year <= 0)
            throw new InvalidDateException("Year must be positive.");
        if (month < 1 || month > 12)
            throw new InvalidDateException("Month must be between 1 and 12.");
        if (day < 1 || day > daysInMonth(month, year))
            throw new InvalidDateException("Invalid day for this month/year.");

        this.day = day;
        this.month = month;
        this.year = year;
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    private boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    public boolean isLeapYear() {
        return isLeapYear(this.year);
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
}
