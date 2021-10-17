package enumTasks;

public class DaysMain {
    public static void main(String[] args) {
        System.out.println(Weekday.MONDAY.isHoliday());
        System.out.println(Weekday.MONDAY.isWeekDay());
        Weekday.WEDNESDAY.whichIsGreather(Weekday.MONDAY);
    }
}
