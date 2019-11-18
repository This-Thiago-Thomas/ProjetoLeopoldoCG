package compgraf_trabalho2_4;

import javax.swing.JFrame;

public class TesteGraficoMain {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Teste Gráfico");
		janela.getContentPane().add(new TesteGrafico());
		janela.pack();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
	}

}
