package com.design.partten;

public class Withdrawal100Rs implements CashWithdrawal {
	
	public CashWithdrawal chain;
	private CashInAtm cashInAtm = new CashInAtm();
	private int numberRs = 0;
	private int remainder;
	private int currency = 100;
	
	@Override
	public int getAmount() {	
		if(cashInAtm.getRs100() > this.remainder) {
			if(this.remainder >= currency) {
				this.numberRs = this.remainder/currency;
				this.remainder  = this.remainder - numberRs*currency;
				System.out.println(currency+"Rs :" + numberRs + " Reminder :"+this.remainder) ;
			}
		}
		if(this.remainder > 0) {
			System.out.println( " Currency less then 100 is not avalable.");
			//this.chain.setAmount(this.remainder);
			//this.chain.getAmount();
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
