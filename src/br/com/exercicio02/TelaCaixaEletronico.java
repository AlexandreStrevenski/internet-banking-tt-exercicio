package br.com.exercicio02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.target.internetbanking.modelo.Conta;
import br.com.target.internetbanking.modelo.TipoConta;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCaixaEletronico extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroConta;
	private JTextField txtValorSaque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCaixaEletronico frame = new TelaCaixaEletronico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCaixaEletronico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conta:");
		lblNewLabel.setBounds(10, 63, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Saque");
		lblNewLabel_1.setBounds(10, 97, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNumeroConta = new JTextField();
		txtNumeroConta.setBounds(99, 60, 140, 20);
		contentPane.add(txtNumeroConta);
		txtNumeroConta.setColumns(10);
		
		txtValorSaque = new JTextField();
		txtValorSaque.setBounds(99, 94, 140, 20);
		contentPane.add(txtValorSaque);
		txtValorSaque.setColumns(10);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double valor = Double.parseDouble(txtValorSaque.getText());
					new CaixaEletronico().sacar(new Conta("11", TipoConta.CONTA_CORRENTE), valor );
				} catch (SaldoInsuficienteException e1) {
					JOptionPane.showMessageDialog(contentPane, "Saldo insuficiente " + e1.getValorSaque());
				} catch (ValorSaqueInvalidoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSacar.setBounds(99, 155, 140, 23);
		contentPane.add(btnSacar);
	}
}
