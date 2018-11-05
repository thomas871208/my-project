package com.tom;



public class Money {
		
		double NTD;
		public Money (double NTD) {
		this.NTD = NTD;
		}
		
		public double USD() {
			double USD = (0.03227*NTD);
			return USD;
		}
		
		public double JPY() {
			double JPY = (3.62976*NTD);
			return JPY;
		}
		
		public double EUR() {
			double EUR = (0.02806*NTD);
			return EUR;
			
		}

		
}

