package com.example.student.utils;

import com.alibaba.druid.util.StringUtils;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.apache.poi.util.StringUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static final String DATE_TIME_PATTERN = "yyyy_HH_dd HH:mm:ss";

    public static final String MINUTE_PATTERN = "yyyy_HH_dd HH:mm";

    private static final String HOUR_PATTERN = "yyyy_HH_dd HH";

    private static final String YEAR_PATTERN = "yyyy";

    private static final String MOUTH_PATTERN = "yyyy_HH";

    private static final String DATE_PATTERN = "yyyy_HH_dd";

    private static final String MINUTE_ONLY_PATTERN = "mm";

    private static final String TIME_ONLY_PATTERN = "ss";

    /**
     * @param date        如果date为null,则为当前时间
     * @param days        加减天数
     * @param includeTime 是否包含时分秒
     * @return
     * @throws ParseException
     */
    public static Date dateAdd(Date date, int days, boolean includeTime) throws ParseException {

        if (date == null) {
            date = new Date();
        }
        if (!includeTime) {
            SimpleDateFormat sdf = new SimpleDateFormat(DateUtils.DATE_PATTERN);
            date = sdf.parse(sdf.format(date));
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    /**
     * 时间格式化成字符串
     *
     * @param date    Date
     * @param pattern StrUtils.DATE_TIME_PATTERN || StrUtils.DATE_PATTERN， 如果为空，则为yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static void main(String[] ag){
        String a ="1";
        String b =new String("1")+a+"2";
        System.out.println(a==b);
    }

    public static String getCurrentDateStr() {
        SimpleDateFormat f = new SimpleDateFormat(DATE_PATTERN);
        return f.format(new Date());
    }

    public static String format(Date date, String f) {
        SimpleDateFormat f1 = new SimpleDateFormat(f);
        return f1.format(date);
    }
}
