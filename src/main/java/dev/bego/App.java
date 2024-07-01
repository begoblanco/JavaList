package dev.bego;

import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        WeekDays weekDays = new WeekDays();
        weekDays.createDays();
       List<String> daysOfWeek = weekDays.getDaysOfWeek();

       System.out.println("Días de la semana:");
       for (String day : daysOfWeek) {
           System.out.println(day);
       }
    }
}
