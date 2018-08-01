/*
 *自定义异常，声明
 *作者：tiamo_cao
 *创建时间：2018.07.25
 */

public class MyException extends Exception{	//所有检查异常都是Exception的子类
	private int amount;
	public MyException(int amount){
		this.amount = amount;
	}
	
	public int getAmount(){
		return amount;
	}
}
