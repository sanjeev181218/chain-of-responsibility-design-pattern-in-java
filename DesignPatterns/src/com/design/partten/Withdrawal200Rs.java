package com.design.partten;

public class Withdrawal200Rs implements CashWithdrawal {

	public CashWithdrawal chain;
	private CashInAtm cashInAtm = new CashInAtm();
	private int numberRs = 0;
	private int remainder;
	private int currency = 200;
	
	@Override
	public int getAmount() {	
		if(cashInAtm.getRs200() >= this.remainder) {
			if(this.remainder > this.currency) {
				this.numberRs = this.remainder/this.currency;
				this.remainder  = this.remainder - numberRs*this.currency;
				System.out.println(currency+"Rs :" + numberRs + " Reminder :"+this.remainder) ;
			}
		}
		if(this.remainder > 0) {
			//System.out.println( " Start Next Chain.");
			//System.out.println( " Start Next Chain." + this.chain);
			//System.out.println( " Start Next Chain." + this.remainder);
			this.chain.setAmount(this.remainder);
			this.chain.getAmount();
		}
		return numberRs;
	}
	
	public void setAmount(int remainder) {
		this.remainder = remainder;
	}
		
	
	public void setNextChain(CashWithdrawal nextChain) {
		this.chain = nextChain;
	}
	
	public CashWithdrawal getNextChain() {
		return chain;
	}
	
	public void getCach(CashWithdrawal chain) {
		chain.getAmount();
	}
	

}
