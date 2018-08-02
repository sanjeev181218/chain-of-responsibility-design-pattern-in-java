package com.design.partten;

public interface CashWithdrawal {
	
	public int amount = 0;
	
	public int getAmount();
	
	public void getCach(CashWithdrawal chain);
	
	public void setAmount(int remainder);
	
	public void setNextChain(CashWithdrawal nextChain);
	
	

}
