package com.study.git.date.util;

import java.io.File;

/**
 * @desc:
 * @author: zona
 * @time: 2016年8月24日 下午10:07:11
 */
public class TestText {

	private String name = "xx";
	private int age = 2;
	private int git1 = 3;
	
	private String address = "henan";
	
	public static void main(String[] args) {
		System.out.println("enclosing_type.enclosing_method()");
		System.out.println("TestText.main()");
	}
	
	public void read(String path) {
		File file = new File(path);
	}
	
	public void print(String content) {
		System.out.println(content);
	}
	
	public void test() {
		
	}
}
