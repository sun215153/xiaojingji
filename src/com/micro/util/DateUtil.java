/*
* Constants.java    2012-10-31
* Copyright 2012 Garea Microsystem Inc. All Rights Reserved.
*/

package com.micro.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.ParseException;
import java.util.Calendar;
/**
 * TODO Add class description
 * @author yangling
 */

 
public class DateUtil {
	
	public static String PATTERN_DATE = "yyyy-MM-dd";
	public static String PATTERN_DATETIME = "yyyy-MM-dd hh:mm:ss";
	
	private static String defaultPattern = PATTERN_DATETIME;
	
	public static String format(Date date){
		return format(date, defaultPattern);
	}
	
	public static String format(long millis){
		return format(millis, defaultPattern);
	}
	
	public static String format(Calendar calendar){
		return format(calendar, defaultPattern);
	}
	
	public static String format(Date date, String pattern){
		SimpleDateFormat formater = new SimpleDateFormat(pattern);
		String result = formater.format(date);
		return result;
	}
	
	private static Date tempDate = new Date();
	public static String format(long millis, String pattern){
		tempDate.setTime(millis);
		SimpleDateFormat formater = new SimpleDateFormat(pattern);
		String result = formater.format(tempDate);
		return result;
	}
	
	public static String format(Calendar calendar, String pattern){
		Date date = calendar.getTime();
		SimpleDateFormat formater = new SimpleDateFormat(pattern);
		String result = formater.format(date);
		return result;
	}
	
	public static Date parseDate(String strDate){
		try {
			Date date = parseDate(strDate, defaultPattern);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static Date parseDate(String strDate, String pattern) throws ParseException{
		SimpleDateFormat formater = new SimpleDateFormat(pattern);
		Date result = formater.parse(strDate);
		return result;
	}
	
	public static Date parseDate(long millis){
		Date date = new Date(millis);
		return date;
	}

	/*-----------------下面�?��的compare方法返回1, 0, -1 三种�?----------------*/
	
	//比较年份
	public static int compareYear(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.YEAR);
	}
	
	//比较从year到month字段
	public static int compareYearToMonth(Date dateOne, Date dateTwo){
		int result = compareField(dateOne, dateTwo, Calendar.YEAR);
		if (result!=0)
			return result;
		else
			return compareField(dateOne, dateTwo, Calendar.MONTH);
	}
	
	//比较从year到day字段
	public static int compareYearToDay(Date dateOne, Date dateTwo){
		int result = compareField(dateOne, dateTwo, Calendar.YEAR);
		if (result!=0)
			return result;
		else
			return compareField(dateOne, dateTwo, Calendar.DAY_OF_YEAR);
	}
	
	//比较从year到hour字段
	public static int compareYearToHour(Date dateOne, Date dateTwo){
		int result = compareField(dateOne, dateTwo, Calendar.YEAR);
		if (result!=0)
			return result;
		else {
			result = compareField(dateOne, dateTwo, Calendar.DAY_OF_YEAR);
			if (result!=0)
				return result;
			else {
				return compareField(dateOne, dateTwo, Calendar.HOUR_OF_DAY);
			}
		}
	}
	
	//比较从year到minutes字段
	public static int compareYearToMinutes(Date dateOne, Date dateTwo){
		int result = compareField(dateOne, dateTwo, Calendar.YEAR);
		if (result!=0)
			return result;
		result = compareField(dateOne, dateTwo, Calendar.DAY_OF_YEAR);
		if (result!=0)
			return result;
		result = compareField(dateOne, dateTwo, Calendar.HOUR_OF_DAY);
		if (result!=0)
			return result;
		return compareField(dateOne, dateTwo, Calendar.MINUTE);
	}
	
	//比较从year到second字段
	public static int compareYearToSeconds(Date dateOne, Date dateTwo){
		int result = compareField(dateOne, dateTwo, Calendar.YEAR);
		if (result!=0)
			return result;
		result = compareField(dateOne, dateTwo, Calendar.DAY_OF_YEAR);
		if (result!=0)
			return result;
		result = compareField(dateOne, dateTwo, Calendar.HOUR_OF_DAY);
		if (result!=0)
			return result;
		result = compareField(dateOne, dateTwo, Calendar.MINUTE);
		if (result!=0)
			return result;
		return compareField(dateOne, dateTwo, Calendar.SECOND);
	}
	
	//比较两个日期是否完全相同
	public static int compareYearToMillisecond(Date dateOne, Date dateTwo){
		return compareDate(dateOne, dateTwo);
	}
	
	//比较两个日期是否完全相同
	public static int compareDate(Date dateOne, Date dateTwo){
		if (dateOne == null)
			throw new IllegalArgumentException("The dateOne must not be null");
		if (dateTwo == null)
			throw new IllegalArgumentException("The dateTwo must not be null");
		long result =  dateOne.getTime() - dateTwo.getTime();
		if (result>0)return 1;
		if (result<0)return -1;
		return 0;
	}
	
	public static int compareMonthOfYear(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.MONTH);
	}
	
	public static int compareWeekOfYear(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.WEEK_OF_YEAR);
	}
	
	public static int compareWeekOfMonth(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.WEEK_OF_MONTH);
	}
	
	public static int compareDayOfYear(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.DAY_OF_YEAR);
	}
	
	public static int compareDayOfMonth(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.DAY_OF_MONTH);
	}
	
	public static int compareDayOfWeek(Date dateOne, Date dateTwo){
		return compareField(dateOne, dateTwo, Calendar.DAY_OF_WEEK);
	}
	
	private static Calendar compareCalendarOne = Calendar.getInstance();
	private static Calendar compareCalendarTwo = Calendar.getInstance();
	private static int compareField(Date dateOne, Date dateTwo, int calendarField){
		if (dateOne == null)
			throw new IllegalArgumentException("The dateOne must not be null");
		if (dateTwo == null)
			throw new IllegalArgumentException("The dateTwo must not be null");
		compareCalendarOne.setTime(dateOne);
		compareCalendarTwo.setTime(dateTwo);
		int result = compareCalendarOne.get(calendarField) - compareCalendarTwo.get(calendarField);
		if (result>0)return 1;
		if (result<0)return -1;
		return 0;
	}
	
	
    //-----------------------------------------------------------------------
    /**
     * Adds a number of years to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */	
	public static Date addYears(Date date, int amount) {
        return add(date, Calendar.YEAR, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of months to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMonths(Date date, int amount) {
        return add(date, Calendar.MONTH, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of weeks to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addWeeks(Date date, int amount) {
        return add(date, Calendar.WEEK_OF_YEAR, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of days to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addDays(Date date, int amount) {
        return add(date, Calendar.DAY_OF_MONTH, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of hours to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addHours(Date date, int amount) {
        return add(date, Calendar.HOUR_OF_DAY, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of minutes to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMinutes(Date date, int amount) {
        return add(date, Calendar.MINUTE, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of seconds to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addSeconds(Date date, int amount) {
        return add(date, Calendar.SECOND, amount);
    }

    //-----------------------------------------------------------------------
    /**
     * Adds a number of milliseconds to a date returning a new object.
     * The original date object is unchanged.
     *
     * @param date  the date, not null
     * @param amount  the amount to add, may be negative
     * @return the new date object with the amount added
     * @throws IllegalArgumentException if the date is null
     */
    public static Date addMilliseconds(Date date, int amount) {
        return add(date, Calendar.MILLISECOND, amount);
    }

	
	private static Date add(Date date, int calendarField, int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }
	
	
	 private final static Map<String,String> monthMap = new HashMap<String, String>();

	    public static String formatDate(Date date, String format) {
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
	        return simpleDateFormat.format(date);
	    }

	    public static String formatDate(Date date) {
	        return formatDate(date, Constants.DEFAULT_DATE_FORMAT);
	    }

	    static{
	        monthMap.put("1","Jan.");
	        monthMap.put("2", "Feb.");
	        monthMap.put("3", "Mar.");
	        monthMap.put("4", "Apr.");
	        monthMap.put("5", "May");
	        monthMap.put("6", "Jun.");
	        monthMap.put("7", "Jul.");
	        monthMap.put("8", "Aug.");
	        monthMap.put("9", "Sep.");
	        monthMap.put("10", "Oct.");
	        monthMap.put("11", "Nov.");
	        monthMap.put("12", "Dec.");
	    }
	    public static String formatEnMonth(String monthKey){

	        return  monthMap.get(monthKey);
	    }
}
