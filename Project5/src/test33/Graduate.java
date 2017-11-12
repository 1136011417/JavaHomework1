/**
 * 
 */
package test33;

/**
 * @ClassName:  Graduate   
 * @Description:TODO
 * @author 陈中东
 * @date:  2017年11月12日 下午3:44:58   
 *  
 */
public class Graduate implements StudentManageInterface, TeacherManageInterface {
	private String name;
	private String sex;
	private int age;
	private int fee;
	private int pay;
	/* (non-Javadoc)
	 * @see test33.TeacherManageInterface#setPay(int)
	 */
	@Override
	public void setPay(int p) {
		// TODO Auto-generated method stub
		pay = p;
	}

	/* (non-Javadoc)
	 * @see test33.TeacherManageInterface#getPay()
	 */
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}

	/* (non-Javadoc)
	 * @see test33.StudentManageInterface#setFee(int)
	 */
	@Override
	public void setFee(int f) {
		// TODO Auto-generated method stub
		fee = f; 

	}

	/* (non-Javadoc)
	 * @see test33.StudentManageInterface#getFee()
	 */
	@Override
	public int getFee() {
		// TODO Auto-generated method stub
		return fee;
	}
	Graduate(String n,String s,int a) {
		name = n;
		sex = s;
		age = a;
	}
    public static void main(String[] args)   {      
        Graduate g=new Graduate("zhangsan","男",21);  
        g.setFee(4500);  
        g.setPay(1000);  
        if((g.getPay()*10-g.getFee())<=2000)       
            System.out.println("需要贷款");      
        else       
            System.out.println("不需要");     
        }    

}
