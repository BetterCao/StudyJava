/*
 *抽象类
 *父类
 *作者：曹机智
 *创建时间：2018.07.24
 */

public abstract class Employee
{
   private String name;
   private String address;
   
   public Employee(String name,String address)
   {
      System.out.println("Constructing an Employee");
      this.name = name;
	  this.address = address;
   }

   public void Check()
   {
	  System.out.println("Within mailCheck of Employee class ");
      System.out.println("Mailing a check to " + getName() + " with saddress " + this.address);
   }
   

   public String getName()
   {
      return name;
   }
   
   public abstract void sayHi(); 	//等待子类实现的抽象方法

}