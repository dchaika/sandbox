package com.dc.hr.challenges;

import java.time.format.DateTimeFormatter;

public class TimeConversion {

    /*
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
     *       - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     *
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        DateTimeFormatter dtfIn = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter dtfOut = DateTimeFormatter.ofPattern("HH:mm:ss");
        return dtfOut.format(dtfIn.parse(s));
    }
}