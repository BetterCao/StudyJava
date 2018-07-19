/*
 *对象和类的互相访问
 *作者：曹机智
 *创建时间：2018.07.16
 */

public class MyFriendsTest{
	public static void main(String []args){
		MyFriends fa = new MyFriends("shasha");
		MyFriends fb = new MyFriends("kuku");
		
		fa.setGender("girl");
		fa.setLocation("Kunming");
		fa.view();
		
		
		fb.setGender("boy");
		fb.setLocation("Kunming");
		fb.view();
		
	}
}