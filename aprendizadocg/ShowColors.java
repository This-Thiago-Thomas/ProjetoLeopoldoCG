package aprendizadocg;

import java.awt.Color;
import javax.swing.JFrame;

public class ShowColors {

	public static void main(String[] args) {
		JFrame tela = new JFrame();
		ColorJPanel panel = new ColorJPanel();
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.add(panel);
		tela.setSize(400,180);
		tela.setVisible(true);
	}
}
