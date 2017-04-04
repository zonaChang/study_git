package com.study.git.date.util;

/**
 * 描述: 
 * 公司: 思迪科技
 * 作者: changez@thinkive.com
 * 版本: 1.0
 * 创建时间: 2017年4月4日 下午1:26:06
 */
public class MathUtils {

	public int add(int... num) {
		
		int result = 0;
		for (int i : num) {
			result += i;
		}
		return result;
	}
	public double sub(double target, double... num) {
		
		for (double d : num) {
			target -= d;
		}
		return target;
	}
	
	public double div(double target, double...ds) {
		
		for (double d : ds) {
			target /= d;
		}
		return target;
	}
}
