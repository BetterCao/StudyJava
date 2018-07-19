/*
 *JAVA的类、对象等基本概念
 *作者：曹机智
 *创建时间：2018.07.12
 */

public class Dogs{	//类：狗子
	String food;	//成员变量，下面的方法eat中会用到
	String sex;	//属性：性别
	int age;	//属性：年龄
	String color;	//属性：颜色
	public Dogs(String name){	//构造方法，仅有一个参数name
		System.out.println("狗子的名字是"+name);
	}
	public String eat(String what){	//方法：吃饭
		String food = what;	//局部变量food
		return food;
	}
	public void walk(){	//方法：散步
		System.out.println("is walking");
	}
	public void swim(){}	//方法：游泳
	public static void main(String []args){
		//创建对象
		Dogs myDog = new Dogs("gouzi");
		//访问类中的成员变量
		myDog.eat("bones");
		System.out.println(myDog.food);
		//调用方法
		myDog.walk();
   }
}