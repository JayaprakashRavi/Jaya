package org.bank;

public class AxisBank extends  BankInfo{
	@Override
	public void deposit() {
System.out.println("8%");
	}

	
	public static void main(String[] args) {
		AxisBank g= new AxisBank();
		g.deposit();
		g.saving();
		g.fixed();
		
	}

}
