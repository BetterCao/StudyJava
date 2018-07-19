/*
 *类的继承
 *子类
 *作者：曹机智
 *创建时间：2018.07.19
 */

public class Son extends Father{
	Son(){    //这是子类的无参构造器
		//子类不显式实现super()方法，默认在调用子类构造器之间先调用父类的无参构造器；
		System.out.println("SON -NO ");
	}
	
	Son(int b){    //这是子类的带参构造器
		super(1);    //子类通过 super 调用父类的带参构造器
		System.out.println("supper TO father(int a)");
		System.out.println("Son(int b):" + b);
	}
	
	public void eat(){    //这是子类的方法：吃
		System.out.println("drink");
	}
	
	public void whichEat(){
		System.out.print("this is son-eat:");
		this.eat();    //调用本类的方法：吃
		System.out.print("this is father-eat:");
		super.eat();    //调用父类的方法：吃
	}
}