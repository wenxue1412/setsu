package edu0418.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
	public static void main(String[] args) {
		
		//int long short float double boolean char byte 
		Integer a = 10;
		Integer b = new Integer(10);
		
		System.out.println(a.equals(b));
		
		String c ="ABC";
		String d = "ABC";
		String e = new String("ABC");
		System.out.println(c==d);
		c.equals(e);
		
		String s1 = null;
		String s2 = "";
		String s3 = "    ";
		
				
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("姓名：张三， 年龄： 30，国籍：中国");
		while(matcher.find()) {
			System.out.println(matcher.group(0));
		}
	}

}
