package com.study.git.date.util;

import java.io.File;
import java.util.Arrays;
import java.util.List;

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
		try {
			
			System.out.println("TestText.main()");
			System.out.println("enclosing_type.enclosing_method()");
			
			List<String> nameList = Arrays.asList("aa", "bb", "cc");
			try {
				
				nameList.remove(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(nameList+".....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void read(String path) {
		File file = new File(path);
	}
	
	public void print(String content) {
		System.out.println(content);
	}
	
	public void test() {
		
	}
	
	public void sameContent() {
		System.out.println("不同branch添加相同的内容1, 可能行号不一致, 测试不同分支合并时的情况");
	}
	
	
	public void sameContent2() {
		System.out.println("不同branch添加相同的内容2, 可能行号不一致, 测试不同分支合并时的情况");
	}
	
	public void sameContent3() {
		System.out.println("不同branch添加相同的内容3, 可能行号不一致, 测试不同分支合并时的情况");
	}
	
}
