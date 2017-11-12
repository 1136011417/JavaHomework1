/**
 * 
 */
package test2;

/**
 * @ClassName:  Car   
 * @Description:汽车类，主函数
 * @author 陈中东
 * @date:   2017年11月12日 下午3:05:33   
 *  
 */
public class Car {
	ComputeWeight[] w;
	static double weight;
	Car(ComputeWeight[] w) {
		this.w = w;
	}
	public static void main(String[] args) {
		ComputeWeight[] w = new ComputeWeight[3];
		w[0]=new Computer(30,10);
		w[1]=new Television(45,50); 
        w[2]=new WashMachine(80,35);
        Car car = new Car(w);
        weight = w[0].computeWeight() + w[1].computeWeight() + w[2].computeWeight();
        System.out.println("所装货物总重为：" + weight + "千克");
}
}
