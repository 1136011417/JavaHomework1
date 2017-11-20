/**
 * 
 */
package test1;

import java.util.Scanner;

/**
 * @ClassName:  Test1   
 * @Description:TODO
 * @author 陈中东
 * @date:  2017年11月18日 下午12:48:18   
 *  
 */
public class Test1 {
	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个十六进制数:");
		String number = s.next();
		try {
			n = Integer.parseInt(number,16);
			System.out.print("转换为十进制数为:"+n);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("您输入的不是一个十六进制数！");
			
		}
	}

}
