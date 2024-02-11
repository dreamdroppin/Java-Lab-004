public class RedesignDate{
            //Not running code, change the method to Main
    public static void main(String[] args) {
        //Test American method: Weekday, month, day, year
        //System.out.println("Saturday,", "February", 10, 2024);
            //Code not printing, chance the print
        String weekDay = "Saturday";
        String month = "February";
        int day = 10;
        int year = 2024;
        //System.out.printf("Saturday,","February", day, year);
            //Only prints Saturday,
        System.out.printf("%s, %s %d, %d%n", weekDay, month, day, year);

        //Test European method: Weekday, day, month, year
        //System.out.println("Saturday", 10, "February", 2024);
        System.out.printf("%s, %d %s, %d%n", weekDay, day, month, year);
    }
}
