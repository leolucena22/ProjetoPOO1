package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Ingredientes;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCardapio extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCardapio frame = new JanelaCardapio();
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
	public JanelaCardapio() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 518);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Card\u00E1pio");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(261, 0, 88, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrediente");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 39, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P\u00E3es (Fatia)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 64, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("P\u00E3o Frances");
		lblNewLabel_3.setBounds(10, 88, 132, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(145, 39, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("R$ 0,25");
		lblNewLabel_5.setBounds(143, 87, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Adicionar");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(201, 39, 67, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ingredientes.calculaTotal(0.25);
				Ingredientes.adicionarProdutos("Pão Frances");
			}
		});
		btnNewButton.setBounds(199, 88, 69, 14);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("P\u00E3o Carteira");
		lblNewLabel_3_1.setBounds(10, 105, 132, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("R$ 0,30");
		lblNewLabel_5_1.setBounds(143, 105, 46, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ingredientes.calculaTotal(0.30);
				Ingredientes.adicionarProdutos("Pão Carteira");
			}
		});
		btnNewButton_1.setBounds(199, 106, 69, 14);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("P\u00E3o de Hamb\u00FArguer");
		lblNewLabel_3_2.setBounds(10, 124, 132, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("R$ 0,70");
		lblNewLabel_5_2.setBounds(143, 123, 46, 14);
		contentPane.add(lblNewLabel_5_2);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.70);
				Ingredientes.adicionarProdutos("Pão de Hambúrguer");
			}
		});
		btnNewButton_2.setBounds(199, 124, 69, 14);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("P\u00E3o \u00C1rabe");
		lblNewLabel_3_2_1.setBounds(10, 142, 132, 14);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("R$ 1,30");
		lblNewLabel_5_2_1.setBounds(143, 141, 46, 14);
		contentPane.add(lblNewLabel_5_2_1);
		
		JButton btnNewButton_2_1 = new JButton("Add");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.30);
				Ingredientes.adicionarProdutos("Pão Árabe");
			}
		});
		btnNewButton_2_1.setBounds(199, 142, 69, 14);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrediente");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 167, 67, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(145, 167, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Adicionar");
		lblNewLabel_6_1.setForeground(Color.RED);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_1.setBounds(201, 167, 67, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Queijos (Fatia)");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(10, 192, 97, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Coalho");
		lblNewLabel_3_3.setBounds(10, 216, 67, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("R$ 1,50");
		lblNewLabel_5_3.setBounds(143, 215, 46, 14);
		contentPane.add(lblNewLabel_5_3);
		
		JButton btnNewButton_3 = new JButton("Add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.50);
				Ingredientes.adicionarProdutos("Queijo Coalho");
			}
		});
		btnNewButton_3.setBounds(199, 216, 69, 14);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Minas");
		lblNewLabel_3_1_1.setBounds(10, 233, 67, 14);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("R$ 1,80");
		lblNewLabel_5_1_1.setBounds(143, 233, 46, 14);
		contentPane.add(lblNewLabel_5_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Add");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.80);
				Ingredientes.adicionarProdutos("Queijo Minas");
			}
		});
		btnNewButton_1_1.setBounds(199, 234, 69, 14);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Mu\u00E7arela");
		lblNewLabel_3_2_2.setBounds(10, 252, 108, 14);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("R$ 2,00");
		lblNewLabel_5_2_2.setBounds(143, 251, 46, 14);
		contentPane.add(lblNewLabel_5_2_2);
		
		JButton btnNewButton_2_2 = new JButton("Add");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(2.00);
				Ingredientes.adicionarProdutos("Muçarela");
			}
		});
		btnNewButton_2_2.setBounds(199, 252, 69, 14);
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Cream Cheese");
		lblNewLabel_3_2_1_1.setBounds(10, 270, 97, 14);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("R$ 3,00");
		lblNewLabel_5_2_1_1.setBounds(143, 269, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Add");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(3.00);
				Ingredientes.adicionarProdutos("Cream Cheese");
			}
		});
		btnNewButton_2_1_1.setBounds(199, 270, 69, 14);
		contentPane.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("Gorgonzola");
		lblNewLabel_3_2_1_1_1.setBounds(10, 288, 97, 14);
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_5_2_1_1_1 = new JLabel("R$ 3,50");
		lblNewLabel_5_2_1_1_1.setBounds(143, 287, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Add");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(3.50);
				Ingredientes.adicionarProdutos("Queijo Gorgonzola");
			}
		});
		btnNewButton_2_1_1_1.setBounds(199, 288, 69, 14);
		contentPane.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Pre\u00E7o");
		lblNewLabel_4_2.setForeground(Color.RED);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2.setBounds(145, 313, 46, 14);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ingrediente");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 313, 67, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Adicionar");
		lblNewLabel_6_2.setForeground(Color.RED);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_2.setBounds(201, 313, 67, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Carnes de Porco (Fatia)");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(10, 338, 132, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Mortadela");
		lblNewLabel_3_4.setBounds(10, 362, 67, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Apresuntado");
		lblNewLabel_3_1_2.setBounds(10, 379, 67, 14);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Bacon");
		lblNewLabel_3_2_3.setBounds(10, 398, 108, 14);
		contentPane.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("Presunto");
		lblNewLabel_3_2_1_2.setBounds(10, 416, 67, 14);
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_5_2_1_2 = new JLabel("R$ 1,60");
		lblNewLabel_5_2_1_2.setBounds(143, 415, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_2);
		
		JLabel lblNewLabel_5_2_3 = new JLabel("R$ 1,30");
		lblNewLabel_5_2_3.setBounds(143, 397, 46, 14);
		contentPane.add(lblNewLabel_5_2_3);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("R$ 1,00");
		lblNewLabel_5_1_2.setBounds(143, 379, 46, 14);
		contentPane.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_4 = new JLabel("R$ 0,50");
		lblNewLabel_5_4.setBounds(143, 361, 46, 14);
		contentPane.add(lblNewLabel_5_4);
		
		JButton btnNewButton_4 = new JButton("Add");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.50);
				Ingredientes.adicionarProdutos("Mortadela");
			}
		});
		btnNewButton_4.setBounds(199, 362, 69, 14);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("Add");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.00);
				Ingredientes.adicionarProdutos("Apresuntado");
			}
		});
		btnNewButton_1_2.setBounds(199, 380, 69, 14);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_3 = new JButton("Add");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.30);
				Ingredientes.adicionarProdutos("Bacon");
			}
		});
		btnNewButton_2_3.setBounds(199, 398, 69, 14);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_1_2 = new JButton("Add");
		btnNewButton_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.60);
				Ingredientes.adicionarProdutos("Presunto");
			}
		});
		btnNewButton_2_1_2.setBounds(199, 416, 69, 14);
		contentPane.add(btnNewButton_2_1_2);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("Pepperoni");
		lblNewLabel_3_2_1_2_1.setBounds(10, 437, 67, 14);
		contentPane.add(lblNewLabel_3_2_1_2_1);
		
		JLabel lblNewLabel_5_2_1_2_1 = new JLabel("R$ 1,80");
		lblNewLabel_5_2_1_2_1.setBounds(143, 436, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_2_1);
		
		JButton btnNewButton_2_1_2_1 = new JButton("Add");
		btnNewButton_2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.80);
				Ingredientes.adicionarProdutos("Pepperoni");
			}
		});
		btnNewButton_2_1_2_1.setBounds(199, 437, 69, 14);
		contentPane.add(btnNewButton_2_1_2_1);
		
		JLabel lblNewLabel_3_2_1_2_2 = new JLabel("Salame");
		lblNewLabel_3_2_1_2_2.setBounds(10, 459, 67, 14);
		contentPane.add(lblNewLabel_3_2_1_2_2);
		
		JLabel lblNewLabel_5_2_1_2_2 = new JLabel("R$ 2,00");
		lblNewLabel_5_2_1_2_2.setBounds(143, 458, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_2_2);
		
		JButton btnNewButton_2_1_2_2 = new JButton("Add");
		btnNewButton_2_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(2.00);
				Ingredientes.adicionarProdutos("Salame");
			}
		});
		btnNewButton_2_1_2_2.setBounds(199, 459, 69, 14);
		contentPane.add(btnNewButton_2_1_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ingrediente");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(308, 39, 67, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Pre\u00E7o");
		lblNewLabel_4_3.setForeground(Color.RED);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_3.setBounds(443, 39, 46, 14);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("Adicionar");
		lblNewLabel_6_3.setForeground(Color.RED);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_3.setBounds(499, 39, 67, 14);
		contentPane.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Verduras (Fatia)");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_3.setBounds(308, 64, 108, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_5 = new JLabel("Cebola");
		lblNewLabel_3_5.setBounds(308, 88, 67, 14);
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_5_5 = new JLabel("R$ 0,30");
		lblNewLabel_5_5.setBounds(441, 87, 46, 14);
		contentPane.add(lblNewLabel_5_5);
		
		JButton btnNewButton_5 = new JButton("Add");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.30);
				Ingredientes.adicionarProdutos("Cebola");
			}
		});
		btnNewButton_5.setBounds(497, 88, 69, 14);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Piment\u00E3o");
		lblNewLabel_3_1_3.setBounds(308, 105, 67, 14);
		contentPane.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("R$ 0,45");
		lblNewLabel_5_1_3.setBounds(441, 105, 46, 14);
		contentPane.add(lblNewLabel_5_1_3);
		
		JButton btnNewButton_1_3 = new JButton("Add");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.45);
				Ingredientes.adicionarProdutos("Pimentão");
			}
		});
		btnNewButton_1_3.setBounds(497, 106, 69, 14);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Tomate");
		lblNewLabel_3_2_4.setBounds(308, 124, 108, 14);
		contentPane.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_5_2_4 = new JLabel("R$ 0,50");
		lblNewLabel_5_2_4.setBounds(441, 123, 46, 14);
		contentPane.add(lblNewLabel_5_2_4);
		
		JButton btnNewButton_2_4 = new JButton("Add");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.50);
				Ingredientes.adicionarProdutos("Tomate");
			}
		});
		btnNewButton_2_4.setBounds(497, 124, 69, 14);
		contentPane.add(btnNewButton_2_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ingrediente");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(308, 167, 67, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("Pre\u00E7o");
		lblNewLabel_4_4.setForeground(Color.RED);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4.setBounds(443, 167, 46, 14);
		contentPane.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("Adicionar");
		lblNewLabel_6_4.setForeground(Color.RED);
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_4.setBounds(499, 167, 67, 14);
		contentPane.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Molhos (Por\u00E7\u00F5es)");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4.setBounds(308, 192, 108, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_6 = new JLabel("Maionese");
		lblNewLabel_3_6.setBounds(308, 216, 67, 14);
		contentPane.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_5_6 = new JLabel("R$ 0,50");
		lblNewLabel_5_6.setBounds(441, 215, 46, 14);
		contentPane.add(lblNewLabel_5_6);
		
		JButton btnNewButton_6 = new JButton("Add");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.50);
				Ingredientes.adicionarProdutos("Maionese");
			}
		});
		btnNewButton_6.setBounds(497, 216, 69, 14);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("Ketchup");
		lblNewLabel_3_1_4.setBounds(308, 233, 67, 14);
		contentPane.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("R$ 0,50");
		lblNewLabel_5_1_4.setBounds(441, 233, 46, 14);
		contentPane.add(lblNewLabel_5_1_4);
		
		JButton btnNewButton_1_4 = new JButton("Add");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.50);
				Ingredientes.adicionarProdutos("Ketchup");
			}
		});
		btnNewButton_1_4.setBounds(497, 234, 69, 14);
		contentPane.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("Maionese Temperada");
		lblNewLabel_3_2_5.setBounds(308, 252, 108, 14);
		contentPane.add(lblNewLabel_3_2_5);
		
		JLabel lblNewLabel_5_2_5 = new JLabel("R$ 0,70");
		lblNewLabel_5_2_5.setBounds(441, 251, 46, 14);
		contentPane.add(lblNewLabel_5_2_5);
		
		JButton btnNewButton_2_5 = new JButton("Add");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(0.70);
				Ingredientes.adicionarProdutos("Maionese Temperada");
			}
		});
		btnNewButton_2_5.setBounds(497, 252, 69, 14);
		contentPane.add(btnNewButton_2_5);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("Molho T\u00E1rtaro");
		lblNewLabel_3_2_1_3.setBounds(308, 270, 67, 14);
		contentPane.add(lblNewLabel_3_2_1_3);
		
		JLabel lblNewLabel_5_2_1_3 = new JLabel("R$ 1,00");
		lblNewLabel_5_2_1_3.setBounds(441, 269, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_3);
		
		JButton btnNewButton_2_1_3 = new JButton("Add");
		btnNewButton_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.00);
				Ingredientes.adicionarProdutos("Molho Tártaro");
			}
		});
		btnNewButton_2_1_3.setBounds(497, 270, 69, 14);
		contentPane.add(btnNewButton_2_1_3);
		
		JLabel lblNewLabel_3_2_1_3_1 = new JLabel("Barbecue");
		lblNewLabel_3_2_1_3_1.setBounds(308, 288, 67, 14);
		contentPane.add(lblNewLabel_3_2_1_3_1);
		
		JLabel lblNewLabel_5_2_1_3_1 = new JLabel("R$ 1,50");
		lblNewLabel_5_2_1_3_1.setBounds(441, 287, 46, 14);
		contentPane.add(lblNewLabel_5_2_1_3_1);
		
		JButton btnNewButton_2_1_3_1 = new JButton("Add");
		btnNewButton_2_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.50);
				Ingredientes.adicionarProdutos("Molho Barbecue");
			}
		});
		btnNewButton_2_1_3_1.setBounds(497, 288, 69, 14);
		contentPane.add(btnNewButton_2_1_3_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Ingrediente");
		lblNewLabel_1_3_1.setForeground(Color.RED);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3_1.setBounds(308, 313, 67, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Pre\u00E7o");
		lblNewLabel_4_3_1.setForeground(Color.RED);
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_3_1.setBounds(443, 313, 46, 14);
		contentPane.add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Adicionar");
		lblNewLabel_6_3_1.setForeground(Color.RED);
		lblNewLabel_6_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_3_1.setBounds(499, 313, 67, 14);
		contentPane.add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Outros");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_3_1.setBounds(308, 338, 108, 14);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Batata Palha");
		lblNewLabel_3_5_1.setBounds(308, 362, 67, 14);
		contentPane.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_5_5_1 = new JLabel("R$ 1,00");
		lblNewLabel_5_5_1.setBounds(441, 361, 46, 14);
		contentPane.add(lblNewLabel_5_5_1);
		
		JButton btnNewButton_5_1 = new JButton("Add");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.00);
				Ingredientes.adicionarProdutos("Batata Palha");
			}
		});
		btnNewButton_5_1.setBounds(497, 362, 69, 14);
		contentPane.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("Ovo");
		lblNewLabel_3_1_3_1.setBounds(308, 379, 67, 14);
		contentPane.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_5_1_3_1 = new JLabel("R$ 1,00");
		lblNewLabel_5_1_3_1.setBounds(441, 379, 46, 14);
		contentPane.add(lblNewLabel_5_1_3_1);
		
		JButton btnNewButton_1_3_1 = new JButton("Add");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingredientes.calculaTotal(1.00);
				Ingredientes.adicionarProdutos("Ovo");
			}
		});
		btnNewButton_1_3_1.setBounds(497, 380, 69, 14);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_7 = new JButton("Finalizar");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ingredientes.exibeProdutos();
				JanelaCompra janelaCompra = new JanelaCompra();
				janelaCompra.setVisible(true);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_7.setBounds(402, 431, 89, 23);
		contentPane.add(btnNewButton_7);
	}
}
