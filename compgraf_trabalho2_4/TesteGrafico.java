package compgraf_trabalho2_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TesteGrafico extends JPanel{
	
	//Variaveis
	double vetorNumeros[] = {3,3,4,4,3.5,4,3,3,3,4,4,3.5,4,3,3.5,4,3,3,3,3.5,4,3,3,3,2.5,3};
	double passo = 0.5;
	int indice;
	int x;
	int y;

	public TesteGrafico() {
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
		
		
		//Grafico
		x = 20;
		y = getHeight()/2;
		
		int xTeste[] = new int[vetorNumeros.length];
		int yTeste[] = new int[vetorNumeros.length];

		for(int i = 0; i < xTeste.length; i++) {
			if(i == 0) {
				xTeste[i] = x;
			}else {
				x+=(int)(50 * passo);
				xTeste[i] = x;
			}	
			yTeste[i] = (int)(y - 50 * vetorNumeros[i]);
		}
		g.setColor(Color.RED);
		g.drawPolyline(xTeste, yTeste, xTeste.length);
		
					
	}
}
