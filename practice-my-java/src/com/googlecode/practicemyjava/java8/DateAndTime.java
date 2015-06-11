package com.googlecode.practicemyjava.java8;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

import static java.time.temporal.TemporalAdjusters.*;

public class DateAndTime {
    public static void main(String[] args) {
//        printLocalDates();
//        printLocalTimes();
//        printLocalDateTimes();
//        printTimeZoneDateTimes();
//        printTimestamps();
        printPeriodsDurations();
    }

    public static void printLocalDates() {
        System.out.println("----- Dates ------");
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalDate firstFeb2015 = LocalDate.of(2015, 2, 1);
        System.out.println("firstFeb2015 = " + firstFeb2015);
        LocalDate lastFeb2015 = firstFeb2015.with(lastDayOfMonth());
        System.out.println("lastFeb2015 = " + lastFeb2015);

        LocalDate fifthFeb2000 = LocalDate.of(2000, Month.FEBRUARY, 5);
        System.out.println("fifthFeb2000 = " + fifthFeb2000);
        System.out.println("5 April 2000 is before 1 Feb 2015 = " + fifthFeb2000.isBefore(firstFeb2015));
        System.out.println("Is 2000 a leap year? " + fifthFeb2000.isLeapYear());
        Month month = fifthFeb2000.getMonth();
        System.out.println("February min length is " + month.minLength() + " and max length is " + month.maxLength());
        System.out.println("------------------");
    }

    public static void printLocalTimes() {
        System.out.println("----- Times ------");
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        LocalTime midDay = LocalTime.of(12, 0);
        System.out.println("midDay = " + midDay);
        LocalTime nightTime = LocalTime.of(22, 10, 5);
        System.out.println("nightTime = " + nightTime);
        System.out.println("nightTime plus 5 mins 3 seconds = " + nightTime.plusMinutes(5).plusSeconds(3));
        LocalTime currentTimeInLA = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("now in LA = " + currentTimeInLA);
        System.out.println("------------------");
    }

    public static void printLocalDateTimes() {
        System.out.println("--- Date Times ---");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime newYear2015 = LocalDateTime.of(2015, 1, 1, 0, 0, 0, 0);
        System.out.println("newYear2015 = " + newYear2015);

        LocalDateTime currentDateTimeInLA = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("date and time in LA = " + currentDateTimeInLA);
        System.out.println("------------------");
    }

    public static void printTimeZoneDateTimes() {
        LocalDateTime localDateTime = LocalDateTime.of(2015, 6, 1, 5, 0);

        ZonedDateTime aucklandDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Pacific/Auckland"));
        ZonedDateTime losAngelesDateTime = aucklandDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("LA date time = " + losAngelesDateTime);
        System.out.println("Auckland date time = " + aucklandDateTime);
        System.out.println("Offset = " + aucklandDateTime.getOffset().getTotalSeconds());

        OffsetDateTime plusSeven = OffsetDateTime.of(localDateTime, ZoneOffset.of("+07:00"));
        System.out.println("plus seven = " + plusSeven);
    }

    public static void printTimestamps() {
        Instant now = Instant.now();
        System.out.println("now in ISO 8601 format = " + now);
        System.out.println("now in epoch second = " + now.getEpochSecond());
        System.out.println("now in epoch millis = " + now.toEpochMilli());
        System.out.println("now plus 3 minutes = " + now.plus(3, ChronoUnit.MINUTES));

        System.out.println("epoch second = " + Instant.ofEpochSecond(1434065151));
        System.out.println("epoch millis = " + Instant.ofEpochMilli(1434065151796L));
        System.out.println("parsing from ISO 8601 = " + Instant.parse("2015-06-11T23:25:51.796Z"));
    }

    public static void printPeriodsDurations() {
        Period period = Period.between(LocalDate.of(2014, 7, 2), LocalDate.of(2015, 7, 1));
        System.out.println("days = " + period.getDays());
        System.out.println("months = " + period.getMonths());
        System.out.println("years = " + period.getYears());
        System.out.println("is negative = " + period.isNegative());

        Period twoWeeksAndOneDayNotice = Period.ofWeeks(2).plusDays(1);
        LocalDate localDate = LocalDate.of(2015, 6, 12);
        System.out.println("12 June plus 2 weeks and 1 day = " + localDate.plus(twoWeeksAndOneDayNotice));
    }
}
