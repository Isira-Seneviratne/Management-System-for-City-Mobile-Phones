/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpshnew;

import java.util.Calendar;

/**
 *
 * @author isira
 */
public class DateTimeFunctions {
    public static int getDay()
    {
        return Calendar.getInstance().get(Calendar.DATE);
    }
    
    public static String getMonth()
    {
        return new String[]{"January", "February", "March",
            "April", "May", "June", "July", "August", "September",
            "October", "November", "December"}[Calendar.getInstance().get(Calendar.MONTH)];
    }

    public static int getYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
    
    public static String getDate()
    {
        return getDay()+" "+getMonth()+" "+getYear();
    }
    
    public static int getMonthVal()
    {
        return Calendar.getInstance().get(Calendar.MONTH)+1;
    }
}
