package com.tom;

public class TicketCon {
		double t;
		double rt;
		public TicketCon (double t, double rt){
			this.t = t;
			this.rt = rt;
		}
		public double total () {
			double total =( (t-rt)*1000 +( rt*2000*0.9));
			return total;
		}
		
}
