package compgraf_trabalho2_1;

import javax.swing.JFrame;

public class GraficoBarraMain {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Venda de carro - Gráfico de Barra");
		janela.getContentPane().add(new GraficoBarra());
		janela.pack();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
	}
	
}
