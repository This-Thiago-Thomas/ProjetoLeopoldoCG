package aprendizadocg;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		//Barra Vermelha
		g.setColor(new Color(255,0,0)); //Forma RGB
		g.fillRect(15, 25, 100, 20);
		g.drawString(""+g.getColor(), 130, 40);
		
		//Barra Azul
		g.setColor(new Color(0.50f,0.75f,0.0f)); //RGB com floats
		g.fillRect(15, 50, 100, 20);
		g.drawString(""+g.getColor(), 130, 65);
		
		//Barra Azul
		g.setColor(Color.BLUE);  //Modo não donzelo (normal)
		g.fillRect(15, 75, 100, 20);
		g.drawString(""+g.getColor(), 130, 90);
		
		//Barra Amarela
		Color cor_de_cu = Color.MAGENTA;
		g.setColor(cor_de_cu);  //Modo pra que isso
		g.fillRect(15, 100, 100, 20);
		g.drawString(""+g.getColor(), 130, 115);
		
	}
	
}
