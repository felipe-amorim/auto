package com.autoavaliar.support.convert.dates;

import com.autoavaliar.intern.Instances;

import java.util.Calendar;
import java.util.Date;

public class Remover {
    public Date days(int amount){
        Date date = Instances.getDateClassInstance();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, -amount);
        return c.getTime();
    }

    public Date mins(int amount){
        Date date = Instances.getDateClassInstance();
        long curTimeInMs = date.getTime();
        return new Date(curTimeInMs - (amount * 60000));
    }
}
