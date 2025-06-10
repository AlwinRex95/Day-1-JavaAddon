package Day4;

class SbiAcc{
	private String Accholder;
	private int Balance;
	
	SbiAcc(String Accholder , int Balance){
		this.Accholder=Accholder;
		this.Balance=Balance;
	}
	public String getAccholder() {
		return Accholder;
	}
	public int getBalance() {
		return Balance;
	}
	public void Deposit(int dep) {
		if (Balance > 0) {
			Balance += dep;
			//Balance = balance + dep;
			System.out.println("Deposite Amount: "+dep);
			System.out.println("Now current Balance: "+Balance);
		}
	}
	public void setAccholder(String Accholder) {
	this.Accholder=Accholder;	
	}
	public void setWithdraw(int withdraw) {
		Balance -=withdraw;
	}
}
public class BankDetails {

	public static void main(String[] args) {
		SbiAcc ac=new SbiAcc("Alwin", 20000);
		System.out.println("Account holder name:"+ac.getAccholder());
		ac.setAccholder("Alwin");
		System.out.println("update account holder:"+ac.getBalance());
		System.out.println("Balance:"+ac.getBalance());
		ac.Deposit(3000);
		ac.setWithdraw(20000);		
		System.out.println("Available Balance:"+ac.getBalance());
				
	}

}

