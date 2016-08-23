package com.study.git.date.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

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
		
		StringUtils.isBlank("xxx");
		Date operateDate = StringUtils.isBlank(date) ? new Date() : //
			new SimpleDateFormat(StringUtils.isBlank(formate) ? YYYYMMDD : formate)//
				.parse(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(operateDate);
		return calendar.get(Calendar.YEAR);
	}
}
