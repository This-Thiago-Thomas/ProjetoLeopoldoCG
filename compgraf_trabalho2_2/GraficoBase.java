package compgraf_trabalho2_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraficoBase extends JPanel{
	
	//Variaveis
	int indice;
	int x;
	int y;

	public GraficoBase() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(640,480));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Eixos
		g.drawLine(0, this.getHeight()/2, this.getWidth(),this.getHeight()/2); //Eixo Horizontal 
		g.drawLine(20,0,20,this.getHeight()); //Eixo Vertical
		
		//Indice 0 
		x = 20;
		y = getHeight()/2;
		g.setColor(Color.BLUE);
		g.drawString(""+indice, x, y+20);
		g.setColor(Color.BLACK);
		
		//Indice Horizontal
		indice = 1;
		x+=50;
		while(x < getWidth()) {
			g.drawLine(x, y-5, x, y+5);
			g.setColor(Color.BLUE);
			g.drawString(""+indice, x-2, y+20);
			g.setColor(Color.BLACK);
			x+=50;
			indice++;
		}
		
		//Indice vertical subindo
		indice = 1;
		x = 20;
		y = getHeight()/2 -50;
		while(y > 0) {
			g.drawLine(x-5, y, x+5, y);
			g.setColor(Color.BLUE);
			g.drawString(""+indice, x-15, y+5);
			g.setColor(Color.BLACK);
			y-=50;
			indice++;
		}
		
		//Indice vertical descendo
		indice = -1;
		x = 20;
		y = getHeight()/2 +50;
		while(y < getHeight()) {
			g.drawLine(x-5, y, x+5, y);
			g.setColor(Color.BLUE);
			g.drawString(""+indice, x-15, y+5);
			g.setColor(Color.BLACK);
			y+=50;
			indice--;
		}

		
					
	}
}
