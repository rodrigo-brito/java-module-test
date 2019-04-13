package br.ufmg.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private static void log(String flag, String message) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date = format.format(new Date());
        String output = String.format("[%s] %s: %s", date, flag, message);
        System.out.println(output);
    }

    public static void info(String message) {
        Log.log("INFO", message);
    }

    public static void error(String message) {
        Log.log("ERROR", message);
    }
}
