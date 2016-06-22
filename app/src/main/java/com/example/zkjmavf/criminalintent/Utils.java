package com.example.zkjmavf.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zkjmavf on 23/04/16.
 */
public class Utils {
    public static String formatDate(Date date, String format){
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }
}
