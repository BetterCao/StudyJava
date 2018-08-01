/*
 *自定义异常，实际操作
 *作者：tiamo_cao
 *创建时间：2018.07.25
 */

public class TestBank{
	int money;
	public static void main(String args[]){
		BankAccount ba = new BankAccount();
		try{
			//初始资金账户
			System.out.println("now you have $" + ba.getAccount());
			//存500
			System.out.println("\ntry to deposit $500");
			ba.deposit(500);
			System.out.println("now you have $" + ba.getAccount());
			//取100
			System.out.println("\ntry to withdraw $100");
			ba.withdraw(100);
			System.out.println("now you have $" + ba.getAccount());
			//再取700
			System.out.println("\ntry to withdraw $700");
			ba.withdraw(700);
			System.out.println("now you have $" + ba.getAccount());
		}catch(MyException e){
			System.out.println("\nops,you can't do this,if you really want to,please deposit $" + e.getAmount() + " at least");
		}finally{
			System.out.println("eventually,your bankaccount has $" + ba.getAccount());
		}
		
	}
}
