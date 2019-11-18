package compgraf_trabalho2_2;

import javax.swing.JFrame;

public class GraficoBaseMain {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Gráfico Base");
		janela.getContentPane().add(new GraficoBase());
		janela.pack();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
	}

}
