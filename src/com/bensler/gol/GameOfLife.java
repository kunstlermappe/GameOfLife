package com.bensler.gol;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GameOfLife extends Applet {
	
	public final static int CELL_SIZE = 40;
	public final static int GAP_WIDTH = 5;
	
	//Konstruktor der Klasse
		public void init() {
	//Größe des Ausgabefensters (Appletgröße)
			setSize(500, 500);
	//Hintergrundfarbe des Applets
			setBackground(Color.white);

		}

		public void paint(Graphics stift) {
			for (int zeile = 0; zeile < 10; zeile = zeile + 1) {
				for (int spalte = 0; spalte < 10; spalte = spalte + 1) {
					//System.out.println("Z: " + zeile + ", S: " + spalte);
					
					drawRectangle(stift, spalte, zeile);
				}
			}
			

		}
				 
				
		/**
		 * 
		 * @param stift
		 * @param column
		 * @param row
		 */
		private void drawRectangle(Graphics stift, int column, int row) {
			//Rechteck
			stift.drawRect(
				(column * (CELL_SIZE + GAP_WIDTH)) + GAP_WIDTH,
				(row    * (CELL_SIZE + GAP_WIDTH)) + GAP_WIDTH, 
				CELL_SIZE,
				CELL_SIZE
			);
		}
	}