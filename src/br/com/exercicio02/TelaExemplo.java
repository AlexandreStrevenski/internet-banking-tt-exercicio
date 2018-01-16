package br.com.exercicio02;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaExemplo extends JFrame {

	public static void main(String[] args) {
		System.out.println("meu programa");
		
		new TelaExemplo();
	}
	
	
	public TelaExemplo() {
		this.setSize(800, 600);

		this.add(new JLabel("nome: "));
		this.add(new JTextField());
		this.setVisible(true);
		
	}
	
}
