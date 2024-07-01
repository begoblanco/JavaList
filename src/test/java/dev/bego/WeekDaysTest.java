package dev.bego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekDaysTest {

    private WeekDays weekDays;

    @BeforeEach
    void setUp() {
        weekDays = new WeekDays();
        weekDays.createDays(); 
    }

    @Test
    void testGetDaysOfWeek() {
        List<String> daysOfWeek = weekDays.getDaysOfWeek();

        assertNotNull(daysOfWeek);
        assertEquals(7, daysOfWeek.size());
        assertTrue(daysOfWeek.contains("Monday"));
        assertTrue(daysOfWeek.contains("Friday"));
    }

    @Test
    void testGetLengthOfDaysList() {
        assertEquals(7, weekDays.getLengthOfDaysList());
    }

    @Test
    void testRemoveDay() {
        weekDays.removeDay("Monday");

        assertFalse(weekDays.dayExists("Monday"));
        assertEquals(6, weekDays.getLengthOfDaysList());
    }

    @Test
    void testWantedDay() {
        assertEquals("Wednesday", weekDays.wantedDay(2));
        assertNull(weekDays.wantedDay(7)); 
    }

    @Test
    void testDayExists() {
        assertTrue(weekDays.dayExists("Thursday"));
        assertFalse(weekDays.dayExists("Holiday"));
    }

    @Test
    void testSortDaysAlphabetically() {
        weekDays.sortDaysAlphabetically();
        List<String> sortedDays = weekDays.getDaysOfWeek();

        assertEquals("Friday", sortedDays.get(0));
        assertEquals("Wednesday", sortedDays.get(6));
    }

    @Test
    void testClearDaysOfWeek() {
        weekDays.clearDaysOfWeek();
        assertEquals(0, weekDays.getLengthOfDaysList());
        assertTrue(weekDays.getDaysOfWeek().isEmpty());
    }

}
