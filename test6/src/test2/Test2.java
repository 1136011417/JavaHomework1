/**
 * 
 */
package test2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

/**
 * @ClassName:  Test2   
 * @Description:TODO
 * @author 陈中东
 * @date:  2017年11月18日 下午1:17:34   
 *  
 */

public class Test2 {
	
	private static Date date;
	static private String string;
	static String str;
	public static void exChange() {
		
	try {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		date = sdf.parse(string);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
	    str = sdf1.format(date);
		System.out.println("转换后的日期为:");
		System.out.println(str);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("请输入格式正确的日期！");
	}
	}
	public static void main(String[] args) {//2017/02/02  20170202
		System.out.println("请输入一个日期(格式为yyyy/MM/dd):");
		Scanner s = new Scanner(System.in);
		string = s.next();
		exChange();
	}
}
