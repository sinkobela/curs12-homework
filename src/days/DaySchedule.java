package days;

import java.util.List;

public class DaySchedule {
    private final DaysOfTheWeek day;
    private final List<String> activity;

    public DaySchedule(DaysOfTheWeek day, List<String> activity) {
        this.day = day;
        this.activity = activity;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivity() {
        return activity;
    }

    public String toString() {
        return "Today is: " + day + ". I'm gonna: " + activity;
    }
}
