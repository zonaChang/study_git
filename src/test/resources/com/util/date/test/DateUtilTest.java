package com.util.date.test;

import java.text.ParseException;

import org.junit.Test;

import com.study.git.date.util.DateUtils;


/**
 * @desc:
 * @author: zona
 * @time: 2016年8月23日 下午8:44:56
 */
public class DateUtilTest {

	@Test
	public void getCurrentYear() throws ParseException {
		int year = DateUtils.getCurrentYear();
		System.out.println(year);
	}
}
