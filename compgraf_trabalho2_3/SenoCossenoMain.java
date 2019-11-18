package compgraf_trabalho2_3;

import javax.swing.JFrame;

public class SenoCossenoMain {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Seno e Cosseno");
		janela.getContentPane().add(new SenoCosseno());
		janela.pack();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);

	}

}
