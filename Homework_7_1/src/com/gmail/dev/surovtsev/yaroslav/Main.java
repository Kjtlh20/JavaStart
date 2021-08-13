package com.gmail.dev.surovtsev.yaroslav;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date currDate = new Date();
        long millisEpoch = currDate.getTime();
        Calendar cl = Calendar.getInstance();
        cl.add(Calendar.MONTH, -1);
        Date datePreviousMonth = cl.getTime();
        long millisPreviousMonth = datePreviousMonth.getTime();
        long millisMonth = millisEpoch - millisPreviousMonth;
        System.out.println("Millis in previous month: " + millisMonth);
    }
}
