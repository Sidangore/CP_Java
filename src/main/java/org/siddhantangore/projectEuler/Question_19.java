package org.siddhantangore.projectEuler;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question_19 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.parse("1901-01-01"), endDate = LocalDate.parse("2000-12-31");

        int count = 0;
        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            if (date.getDayOfMonth() == 1 && date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            System.out.println("Date " + date + " day of the month is" + date.getDayOfMonth() + " day is " + date.getDayOfWeek());
        }
        System.out.println(count);
    }
}
