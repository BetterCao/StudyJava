/*
 *对象和类的互相访问
 *作者：曹机智
 *创建时间：2018.07.16
 */

public class MyFriends{
	String name;
	String gender;
	String location;
	
	public MyFriends(String name){
		this.name = name;
	}
	
	public void setGender(String sex){
		gender = sex;
	}
	public void setLocation(String where){
		location = where;
	}
	public void view(){
		System.out.println("name:" + name);
		System.out.println("gender:" + gender);
		System.out.println("location:" + location);
	}
}