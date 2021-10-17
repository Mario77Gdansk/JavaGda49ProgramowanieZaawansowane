package enumTasks;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    protected boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    protected boolean isHoliday() {
        return this == SATURDAY && this == SUNDAY;
    }

    protected void whichIsGreather(Weekday weekday) {
        if (this.ordinal() > weekday.ordinal()) {
            System.out.println(weekday + " is before " + this);
        } else {
            System.out.println(weekday + " is after " + this);
        }
    }


}
