package dym.rpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Display extends JPanel {
	
	private static final long serialVersionUID = -1960615037265171080L;

	public Display() {
		this.setPreferredSize(new Dimension(1280,720));
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1280, 720);
		g.setColor(Color.GREEN);
		for (int x=0;x<1280;x+=32) {
			g.drawLine(x, 0, x, 720);	
		}
		for (int y=0;y<720;y+=32) {
			g.drawLine(0, y, 1280, y);
		}
	}
}
