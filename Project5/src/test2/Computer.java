/**
 * 
 */
package test2;

/**
 * @ClassName:  Computer   
 * @Description:������
 * @author ���ж�
 * @date:  2017��11��12�� ����3:08:11   
 *  
 */
public class Computer implements ComputeWeight{
	double cweight;
	int csum;
	Computer(double a,int b){
		this.cweight = a;
		this.csum = b;
	}
	public double computeWeight() {
		return csum*cweight;	
	}
}
