/**
 * 
 */
package test2;

/**
 * @ClassName:  Computer   
 * @Description:电脑类
 * @author 陈中东
 * @date:  2017年11月12日 下午3:08:11   
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
