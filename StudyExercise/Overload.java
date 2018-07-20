/*
 *重载
 *多个方法，名字相同，参数不同
 *作者：曹机智
 *创建时间：2018.07.20
 */

public class Overload{
	void method(){
		System.out.println("method with no parameter");
	}
	void method(int a){
		System.out.println("method with int a : " + a);
	}
	void method(String x,int y){
		System.out.println("method with String-x and int-y : String " + x + ",int " + y);
	}
	void method(int y,String x){
		System.out.println("method with int-y and String-x: int " + y + ",String " + x);
	}
	
	public static void main(String args[]){
		Overload OV = new Overload();
		OV.method();
		OV.method(5);
		OV.method(1,"cjp");
		OV.method("cjp",1);
	}
}