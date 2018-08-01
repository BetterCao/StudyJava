/*
 *抽象类的实例化、相应方法调用
 *作者：tiamo_cao
 *创建时间：2018.07.24
 */

public class AbstractDemo
{
   public static void main(String [] args)
   {
      Salary s = new Salary("ABC", "Ambehta, UP", 3600.00);
      Employee e = new Salary("DEF", "Boston, MA", 2400.00);
	  //Employee e = new Employee("John Adams", "Boston, MA", 2400.00);
	  //这么写会报错，因为employee是一个抽象类
	  
      System.out.println("Call Check using Salary reference --");
      s.Check();
	   
      System.out.println("Call Check using Employee reference--");
      e.Check();
	  e.sayHi();
	  
    }
}
