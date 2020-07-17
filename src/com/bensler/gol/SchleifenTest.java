package com.bensler.gol;

public class SchleifenTest {

	
	public static void main(String[] args) {
		
		int zahl = 0;
		boolean	wahr = true;
		
		while (wahr) {
			boolean geradeZahl = ((zahl / 2) * 2 == zahl);

			System.out.print(zahl);
			if (geradeZahl) {
				System.out.print(" #");
			}
			System.out.println();
			zahl = zahl + 1;
			wahr = zahl < 10; 
			
					
		}
		
	 
	}
	 
	
}
