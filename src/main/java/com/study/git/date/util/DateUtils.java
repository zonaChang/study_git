package com.study.git.date.util;


import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @desc:
 * @author: zona
 * @time: 2016年8月23日 下午8:49:12
 */
public class DateUtils {

	
	private static final String YYYYMMDD = "yyyyMMdd";
	private static final String YYYY_MM_DD = "yyyy-MM-dd";
	private static final String YYYYMMDDHH24MMSS = "yyyyMMddHHmmss";
	private static final String HHMMSS = "HHmmss";
	
	public static int getCurrentYear() throws ParseException {
		return getCurrentYear(null, null);
	}
	public static int getCurrentYear(String date, String formate) throws ParseException {
		
		Date operateDate = changeStr2Date(date, formate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(operateDate);
		return calendar.get(Calendar.YEAR);
	}
	
	public static int getCurrentDayOfYear(String date, String formate) throws ParseException {
		Date operateDate = changeStr2Date(date, formate); 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(operateDate);
		return calendar.get(Calendar.DAY_OF_YEAR);
	}
	
	public static int getCurrentDayOfWeek(String date, String formate) throws ParseException {
		
		Date operateDate = changeStr2Date(date, formate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(operateDate);
		int current  = calendar.get(Calendar.DAY_OF_WEEK);
		return current == 1 ? 7 : current -1 ;
	}
	
	public static int getCurrentWeekOfYear(String date, String formate) throws ParseException {
		Date operateDate =changeStr2Date(date, formate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(operateDate);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}
	
	public static int getCurrentWeekOfMonth(String date, String formate) throws ParseException {
		Date operateDate = changeStr2Date(date, formate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(operateDate);
		return calendar.get(Calendar.WEEK_OF_MONTH);
	}
	
	private static Date changeStr2Date(String date, String formate) throws ParseException {
		
//		return  StringUtils.isBlank(date) ? new Date() : //
//			new SimpleDateFormat(StringUtils.isBlank(formate) ? YYYYMMDD : formate)//
//				.parse(date);
		return new Date();
	}
}
