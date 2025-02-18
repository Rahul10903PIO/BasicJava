package com_core_java.week4.Day3;

import java.util.*;

class Date implements Comparable<Date> {
    public Integer date;
    public Integer month;
    public Integer year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Date o) {
        if (year.compareTo(o.year) != 0) {
            return year.compareTo(o.year);
        } else if (month.compareTo(o.month) != 0) {
            return month.compareTo(o.month);
        } else {
            return date.compareTo(o.date);
        }
    }

    public String toString() {
        return date + "-" + month + "-" + year;
    }
}

class Flight implements Comparable {
    String source;
    String dest;

    Flight(String source, String dest) {
        this.source = source;
        this.dest = dest;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public String toString() {
        return source + " to " + dest;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class FlightBookings {
    public static void main(String[] args) {
        Map<Flight, Date> map = new HashMap<>();
        //      SortedMap<Date, Flight> sortedMap = new LinkedHashMap<>();
        map.put(new Flight("jaipur", "delhi"), new Date(1, 12, 27));
        map.put(new Flight("jaipur", "Mumbai"), new Date(10, 11, 25));
        map.put(new Flight("Banglore", "delhi"), new Date(8, 12, 27));
        map.put(new Flight("delhi", "delhi"), new Date(13, 12, 27));
        List<Map.Entry<Flight, Date>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));
        System.out.println(entryList);

    }
}