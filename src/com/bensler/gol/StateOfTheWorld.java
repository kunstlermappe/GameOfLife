package com.bensler.gol;

import java.util.ArrayList;
import java.util.List;

public class StateOfTheWorld {
	
	private List<Row> rows; 
	
	public StateOfTheWorld () {
		rows = new ArrayList<Row> (); 
		
		for (int zeile = 0; zeile < 10; zeile = zeile + 1) {
			rows.add(new Row ());
		}
	}

	public static void main(String[] args) {
		new StateOfTheWorld();
	}
}
