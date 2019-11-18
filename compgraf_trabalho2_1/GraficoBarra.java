package compgraf_trabalho2_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraficoBarra extends JPanel{
	
	int xOrigem = 0;
	int yOrigem = 480;
	int esc = 100;
	int esp = 50;
	int xAtual;
	int yAtual;
	
	double barFiat = 3.5;
	double barGm = 2.5;
	double barFord = 1.0;
	double larg = 1.0;
	
	public GraficoBarra() {
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(508,536));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		//Linha da Origem
		g.setColor(Color.GRAY);
		g.drawLine(xOrigem, yOrigem, 535, yOrigem);
		
		//Fiat
		xAtual = esp;
		yAtual = yOrigem - (int)(barFiat*esc);
		g.setColor(Color.RED);
		g.fillRect(xAtual, yAtual, (int)(larg*esc), (int)(barFiat*esc));
		g.drawString("FIAT - "+(int)(barFiat*esc*10), xAtual, yAtual - 10);
		
		//GM
		xAtual += esc + esp;
		yAtual = yOrigem - (int)(barGm*esc);
		g.setColor(Color.GREEN);
		g.fillRect(xAtual, yAtual, (int)(larg*esc), (int)(barGm*esc));
		g.drawString("GM - "+(int)(barGm*esc*10), xAtual, yAtual - 10);
		
		//Ford
		xAtual += esc + esp;
		yAtual = yOrigem - (int)(barFord*esc);
		g.setColor(Color.BLUE);
		g.fillRect(xAtual, yAtual, (int)(larg*esc), (int)(barFord*esc));
		g.drawString("FORD - "+(int)(barFord*esc*10), xAtual, yAtual - 10);
		
	
	}
	
}