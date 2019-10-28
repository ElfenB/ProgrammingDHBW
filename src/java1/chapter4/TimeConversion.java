package java1.chapter4;

/**
 * @author Benjamin Elfen
 *
 * This program converts the given amount of seconds into years, days, minutes, seconds. 
 *
 */
public class TimeConversion {
    public static void main(String[] args) {
        int totalSeconds = 123456789, seconds, minutes, hours, days, years;

        // sets starting value to be subtracted from
        seconds = totalSeconds;
        
        // transforms seconds into years
        int transformSecondsToYears = 60 * 60 * 24 * 365;
		years = seconds / transformSecondsToYears;
		seconds -= years * transformSecondsToYears;
		
		// transforms seconds into days
        int transformSecondsToDays = 60 * 60 * 24;
		days = seconds / transformSecondsToDays;
		seconds -= days * transformSecondsToDays;
		
		// transforms seconds into hours
		int transformSecondsToHours = 60 * 60;
		hours = seconds / transformSecondsToHours;
		seconds -= hours * transformSecondsToHours;
		
		// transforms seconds into minutes
		int transformSecondsToMinutes = 60;
		minutes = seconds / transformSecondsToMinutes;
		seconds -= minutes * transformSecondsToMinutes;

		// output
        System.out.print(totalSeconds + " Sekunden sind ");
        System.out.print(years + " Jahre plus ");
        System.out.print(days + " Tage plus ");
        System.out.print(hours + " Stunden plus ");
        System.out.print(minutes + " Minuten plus ");
        System.out.println(seconds + " Sekunden.");
    }
}
