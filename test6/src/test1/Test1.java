/**
 * 
 */
package test1;

import java.util.Scanner;

/**
 * @ClassName:  Test1   
 * @Description:TODO
 * @author ���ж�
 * @date:  2017��11��18�� ����12:48:18   
 *  
 */
public class Test1 {
	public static void main(String[] args) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("������һ��ʮ��������:");
		String number = s.next();
		try {
			n = Integer.parseInt(number,16);
			System.out.print("ת��Ϊʮ������Ϊ:"+n);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("������Ĳ���һ��ʮ����������");
			
		}
	}

}
