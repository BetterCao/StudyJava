/*
 *类的继承
 *父类
 *作者：曹机智
 *创建时间：2018.07.19
 */

public class Father{
	Father(){
		System.out.println("FATHER -NO");    //这是父类的无参构造器
	}
	Father(int a){    //父类的带参构造器
		System.out.println("Father(int a):" + a);
	}
	
	public void eat(){    //父类的方法：吃
		System.out.print("eat");
	}
}