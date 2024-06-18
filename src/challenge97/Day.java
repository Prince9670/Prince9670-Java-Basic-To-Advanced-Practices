package challenge97;

public enum Day {

    Monday(true),

    Tuesday(true),

    Wednesday(true),

    Thrusday(true),

    Friday(true),

    Saturday(false),

    Sunday(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Weekend";
    }
}

