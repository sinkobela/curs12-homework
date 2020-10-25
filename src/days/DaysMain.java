package days;

import java.util.List;

public class DaysMain {
    public static void main(String[] args) {
        DaySchedule monday = new DaySchedule(DaysOfTheWeek.MONDAY, List.of("eat", "work", "sleep"));
        DaySchedule tuesday = new DaySchedule(DaysOfTheWeek.TUESDAY, List.of("eat", "work", "workout", "eat", "sleep"));
        DaySchedule wednesday = new DaySchedule(DaysOfTheWeek.WEDNESDAY, List.of("eat", "work", "jog", "sleep"));
        DaySchedule thursday = new DaySchedule(DaysOfTheWeek.THURSDAY, List.of("eat", "read", "learn", "sleep"));
        DaySchedule friday = new DaySchedule(DaysOfTheWeek.FRIDAY, List.of("eat", "work", "workout", "sleep"));
        DaySchedule saturday = new DaySchedule(DaysOfTheWeek.SATURDAY, List.of("eat", "eat more", "learn", "sleep"));
        DaySchedule sunday = new DaySchedule(DaysOfTheWeek.SUNDAY, List.of("eat", "sleep"));

        System.out.println(monday.toString());
        System.out.println(tuesday.toString());
        System.out.println(wednesday.toString());
        System.out.println(thursday.toString());
        System.out.println(friday.toString());
        System.out.println(saturday.toString());
        System.out.println(sunday.toString());
    }
}
