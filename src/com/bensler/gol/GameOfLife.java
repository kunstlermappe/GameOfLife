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
		/*
			
	//Zeichenfarbe ändern
			stift.setColor(Color.black);
	//waagerechte Linie mit x1,y1,x2,y2
	//x=Spalte, y=Zeile
			stift.drawLine(50,240,400,240);
	//Seitenlinien Auto
			 stift.drawLine(20,280,50,240);
		     stift.drawLine(400,240,440,280);
		     stift.drawLine(20,280,100,280);
		     stift.drawLine(150,280,325,280);
		     stift.drawLine(375,280,440,280);
	//Reifen 1
		     drawWheel(stift, 98, 265); 
	//Reifen 2
		     drawWheel(stift, 322, 265);
	//Autodach Linien
		     stift.drawLine(125,240,140,200);
		     stift.drawLine(140,200,325,200);
		     stift.drawLine(325,200,355,240);
	//Fenster- und Türlinien
		     stift.drawLine(140,200,140,240);
		     stift.drawLine(233,200,233,280);
		     stift.drawLine(325,200,325,240);
	//untere Straßenlinie
		     stift.drawLine(0,350,500,350);
	//obere Straßenlinie
		     stift.drawLine(0,230,128,230);
		     stift.drawLine(348, 230, 500, 230);
	//Straße Mittelstreifen
		     stift.drawLine(0,285,70,285);
		     stift.drawLine(410,285,500,285);
		     stift.drawLine(180, 285, 310, 285);
	//ausgefülltes Rechteck "Wiese", x,y (links oben) x- und y- Audehnung in Pixel
		     stift.setColor(Color.green);
		     stift.fillRect(0,351,500,351);
	//Baum 1
		     maleBaum(stift, 90, 100);
	//Baum 2
		     maleBaum(stift, 400, 100);
	//Ausgabe eines Text als Grafik an der Position x,y (linke obere Ecke des Textes)
			stift.setColor(Color.blue);
			stift.drawString("Wo ist der Fahrer???", 180, 420);
*/
		}
		/**
		 * draws a tree
		 * @param stift
		 * @param x x position of treetrunk
		 * @param y y position of treetrunk
		 */
		private void maleBaum(Graphics stift, int x, int y) {
			//Baumstamm
		     stift.setColor(Color.black);
		     stift.fillRect(x,y,20,100);
		     //Baumkrone
		     stift.setColor(Color.green);
		     stift.fillOval(x-40,y-50,100,50);
		}
		 
		/**
		 * draws a wheel
		 * @param stift
		 * @param x xposition of wheel 
		 * @param y y position of wheel
		 */
		private void drawWheel(Graphics stift, int x, int y) {
			//Reifen 
		     stift.drawOval(x,y,54,54);
		     stift.fillOval(x+24,y+24,5,5);	
		
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