package All_Basics;
//import java.util.Iterator;

public class SBI
{
	private int accno;
	private int balance;
	
	public void deposite(int a) {
		if(a>0) {
			balance = balance+ a;
			System.out.println(a + "Rs is deposited successfully your total balance is:" + balance);
		}else {
		System.out.println("Amt is not valid");
	    }
	
     }
	
	
	public void withdrow(int a) {
		if(a<balance) {
			balance = balance- a;
			System.out.println(a + "Rs is withdrow successfully your total balance is:" + balance);
		}else {
			System.out.println("You dont have enough cash to withdrow");
		}
	}


	public int getAccno() {
		return accno;
	}


	public void setAccno(int accno) {
		this.accno = accno;
	}


	public int getBalance() {
		return balance;
	}


//	public void setBalance(int balance) {
//		this.balance = balance;
//	}

}