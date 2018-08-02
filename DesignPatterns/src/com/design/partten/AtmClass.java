package com.design.partten;

public class AtmClass {
	
	public static void main(String[] args) {
		
		CashWithdrawal rs500 = new Withdrawal500Rs();
		CashWithdrawal rs200 = new Withdrawal200Rs();
		CashWithdrawal rs100 = new Withdrawal100Rs();
		

		
		
		CashWithdrawal rsDispach = new Withdrawal2000Rs();
		
		rsDispach.setNextChain(rs500);
		rs500.setNextChain(rs200);
		rs200.setNextChain(rs100);
		
		rsDispach.setAmount(5350);
		rsDispach.getCach(rsDispach);
		
	}

}
