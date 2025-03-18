public class APCalendar {
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;

        for (int year = year1; year <= year2; year++) 
            if (isLeapYear(year))
                count++;
        
        return count;
    }

    // Zeller's Congruence
    private static int firstDayOfYear(int year) {
        int y = year - 1;
        return (1 + 5 * (y % 4) + 4 * (y % 100) + 6 * (y % 400)) % 7;
    }

    private static int dayOfYear(int month, int day, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        return dayOfYear;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int firstDay = firstDayOfYear(year);
        int dayYear = dayOfYear(month, day, year);

        return (firstDay + dayYear - 1) % 7;
    }
}