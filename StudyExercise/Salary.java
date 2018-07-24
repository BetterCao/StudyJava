/*
 *抽象类
 *子类
 *作者：曹机智
 *创建时间：2018.07.24
 */

public class Salary extends Employee
{
   private double salary;
   
   public Salary(String name, String address, double salary)
   {
	   super(name, address);	//继承父类含参构造器
	   this.salary = salary;
   }
   
   public void Check()	//重写父类的Check()方法
   {
       System.out.println("Within mailCheck of Salary class ");
											//getName继承自父类
       System.out.println("Mailing check to " + getName() + " with salary " + salary);
   }
   
   public void sayHi(){	//实现父类的抽象方法sayHi()，不写的话编译会报错
	   System.out.println("hi~!");
   }

}