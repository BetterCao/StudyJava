/*
 *重写
 *展示重写特征和规则
 *作者：曹机智
 *创建时间：2018.07.20
 */

public class TestOverwrite{
	public static void main(String args[]){
		BeOverwrited BO = new BeOverwrited();
		BO.action();
		
		BeOverwrited BO2 = new Overwrite();
 		BO2.action();	//编译成功，BeOverwrited存在move方法，运行时，运行的是特定对象Overwrite的方法
		//BO2.hello();	//编译报错，因为BO2的引用类型BeOverwrited没有hello方法
	}
}