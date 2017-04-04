package com.study.git.date.util;
/**
 * @desc: 
 * @auth: zona
 * 2017年4月4日 下午1:28:07
 */
public class MathUtils {

	public double sub(double target, double... num) {
		
		for (double d : num) {
			target -= d;
		}
		return target;
	}
}
