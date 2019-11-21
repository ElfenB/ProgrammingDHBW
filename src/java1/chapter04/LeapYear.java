package java1.chapter04;

public class LeapYear {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        int year = 2018;
        int days;

        // if divison4 works and divison100 fails and division400 works THEN: LeapYear ELSE: NormalYear
        days = (((year % 4) == 0) & ((year % 100) != 0) | ((year % 400) == 0)) ? 366 : 365;

        System.out.println("Das Jahr " + year + " hat " + days + " Tage.");
    }
}
