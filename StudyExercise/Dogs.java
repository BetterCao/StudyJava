/*
 *JAVA���ࡢ����Ȼ�������
 *���ߣ��ܻ���
 *����ʱ�䣺2018.07.12
 */

public class Dogs{	//�ࣺ����
	String food;	//��Ա����������ķ���eat�л��õ�
	String sex;	//���ԣ��Ա�
	int age;	//���ԣ�����
	String color;	//���ԣ���ɫ
	public Dogs(String name){	//���췽��������һ������name
		System.out.println("���ӵ�������"+name);
	}
	public String eat(String what){	//�������Է�
		String food = what;	//�ֲ�����food
		return food;
	}
	public void walk(){	//������ɢ��
		System.out.println("is walking");
	}
	public void swim(){}	//��������Ӿ
	public static void main(String []args){
		//��������
		Dogs myDog = new Dogs("gouzi");
		//�������еĳ�Ա����
		myDog.eat("bones");
		System.out.println(myDog.food);
		//���÷���
		myDog.walk();
   }
}