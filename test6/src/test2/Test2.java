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
 * @author ���ж�
 * @date:  2017��11��18�� ����1:17:34   
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
		System.out.println("ת���������Ϊ:");
		System.out.println(str);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("�������ʽ��ȷ�����ڣ�");
	}
	}
	public static void main(String[] args) {//2017/02/02  20170202
		System.out.println("������һ������(��ʽΪyyyy/MM/dd):");
		Scanner s = new Scanner(System.in);
		string = s.next();
		exChange();
	}
}
