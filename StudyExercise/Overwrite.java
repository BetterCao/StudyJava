/*
 *重写
 *子类，去重写
 *作者：曹机智
 *创建时间：2018.07.20
 */

public class Overwrite extends BeOverwrited{
	public void action(){
		System.out.println("i can swim");
		System.out.print("if you want father's method,use'super.action()' : ");
		super.action();
	}
	
	public void hello(){
		System.out.println("hello world!");
	}
}