/**
 * 
 */
package test2;

/**
 * @ClassName:  Television   
 * @Description:电视类
 * @author 陈中东
 * @date:  2017年11月12日 下午3:04:50   
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
