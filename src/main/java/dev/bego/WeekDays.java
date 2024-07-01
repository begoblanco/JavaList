package dev.bego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeekDays{

    private List<String> weekDaysList = new ArrayList<>();

    public void createDays(){
        weekDaysList.add("Monday");
        weekDaysList.add("Tuesday");
        weekDaysList.add("Wednesday");
        weekDaysList.add("Thursday");
        weekDaysList.add("Friday");
        weekDaysList.add("Saturday");
        weekDaysList.add("Sunday");
    }

    public List<String> getDaysOfWeek() {
       return new ArrayList<>(weekDaysList);
    }

    public int getLengthOfDaysList() {
        return weekDaysList.size();
    }

    public void removeDay(String day) {
        weekDaysList.remove(day);
    }

    public String wantedDay(int index) {
        if (index >= 0 && index < weekDaysList.size()) {
            return weekDaysList.get(index);
        }
        return null;
    }

    public boolean dayExists(String day) {
        return weekDaysList.contains(day);
    }

      public void sortDaysAlphabetically() {
        Collections.sort(weekDaysList);
    }

    public void clearDaysOfWeek() {
        weekDaysList.clear();
    }
}