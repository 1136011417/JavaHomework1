/**
 * 
 */
package test2;

/**
 * @ClassName:  Television   
 * @Description:������
 * @author ���ж�
 * @date:  2017��11��12�� ����3:04:50   
 *  
 */
public class Television implements ComputeWeight{
	double tweight;
	int tsum;
	Television(double a,int b){
		this.tweight = a;
		this.tsum = b;
	}
	public double computeWeight() {
		return tsum*tweight;	
	}
}
