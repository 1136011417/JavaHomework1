/**
 * 
 */
package test2;

/**
 * @ClassName:  Car   
 * @Description:�����࣬������
 * @author ���ж�
 * @date:   2017��11��12�� ����3:05:33   
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
        System.out.println("��װ��������Ϊ��" + weight + "ǧ��");
}
}
