package com.bensler.gol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.bensler.base.BaseApp;

public class GameOfLife extends JPanel {
	
	public final static int CELL_SIZE = 40;
	public final static int GAP_WIDTH = 5;
	
	public GameOfLife() {
		setPreferredSize(new Dimension(500,  500));
		setBackground(Color.white);
		setOpaque(true);
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
			
			boolean geradeSpalte = ((column / 2) * 2 == column);
			boolean geradeZeile = ((row / 2) * 2 == row);
			
			if (geradeSpalte & geradeZeile) {
				stift.fillRect((column * (CELL_SIZE + GAP_WIDTH)) + GAP_WIDTH,
						(row    * (CELL_SIZE + GAP_WIDTH)) + GAP_WIDTH, 
						CELL_SIZE,
						CELL_SIZE);
			} else {
				stift.drawRect(
						(column * (CELL_SIZE + GAP_WIDTH)) + GAP_WIDTH,
						(row    * (CELL_SIZE + GAP_WIDTH)) + GAP_WIDTH, 
						CELL_SIZE,
						CELL_SIZE
						);
				
			}
			
		}
			
		
	public static void main(String[] args) {
		new BaseApp("Game of Live", new GameOfLife());
	}

}