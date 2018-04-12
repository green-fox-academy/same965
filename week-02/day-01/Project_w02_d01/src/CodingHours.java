public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyCodingHours = 6;
        int semesterWeeks = 17;
        int averageWorkingHours = 52;

        int codingHours = semesterWeeks * 5 * dailyCodingHours;
        System.out.println(codingHours + " is spent with coding in a semester by an attendee.");

        double percentage = (double) dailyCodingHours * 5 / (double) averageWorkingHours * 100;
        System.out.println(percentage + "% of the average working hours is coding hours in a week.");
    }
}
