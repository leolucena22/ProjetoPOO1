package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Ingredientes;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class JanelaCompra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCompra frame = new JanelaCompra();
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
	public JanelaCompra() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Compra Finalizada");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(162, 11, 136, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Produtos Adicionados");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(23, 51, 127, 14);
		contentPane.add(lblNewLabel_1);
		
	
		JLabel lblNewLabel_2 = new JLabel("Total a Pagar R$");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(23, 334, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtrTeste = new JTextArea(Ingredientes.exibeProdutos().toString());
		txtrTeste.setTabSize(20);
		txtrTeste.setLineWrap(true);
		txtrTeste.setForeground(Color.BLACK);
		txtrTeste.setFont(new Font("Arial", Font.BOLD, 11));
		txtrTeste.setEditable(false);
		txtrTeste.setWrapStyleWord(true);
		txtrTeste.setBounds(23, 76, 590, 247);
		contentPane.add(txtrTeste);
		
		JTextArea textArea = new JTextArea(Ingredientes.imprimeTotal());
		textArea.setLineWrap(true);
		textArea.setForeground(Color.GREEN);
		textArea.setFont(new Font("Arial Black", Font.BOLD, 20));
		textArea.setEditable(false);
		textArea.setBounds(23, 359, 590, 57);
		contentPane.add(textArea);
		
	}
}
