/**
 * 
 */
package test2;

/**
 * @ClassName:  WashMachine   
 * @Description:洗衣机类
 * @author 陈中东
 * @date:  2017年11月12日 下午3:07:08   
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
