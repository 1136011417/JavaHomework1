/**
 * 
 */
package test2;

/**
 * @ClassName:  WashMachine   
 * @Description:ϴ�»���
 * @author ���ж�
 * @date:  2017��11��12�� ����3:07:08   
 *  
 */
public class WashMachine implements ComputeWeight{
	double wweight;
	int wsum;
	WashMachine(double a,int b){
		this.wweight = a;
		this.wsum = b;
	}
	public double computeWeight() {
		return wsum*wweight;	
	}
}
