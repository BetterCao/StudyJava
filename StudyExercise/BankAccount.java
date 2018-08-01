/*
 *自定义异常，存取钱
 *作者：tiamo_cao
 *创建时间：2018.07.25
 */

public class BankAccount{
	private int account;
	
	public void deposit(int amount){	//存钱
		account = account + amount;
	}
	public void withdraw(int amount) throws MyException{	//取钱，抛出异常
		if(account >= amount){
			account = account - amount;
		}else{
			int need = amount - account;
			throw new MyException(need);
		}
	}
	public int getAccount(){	//获取现在账户余额
		return account;
	}
}
