package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema Lanchonete");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(128, 11, 183, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnCardpio = new JButton("Card\u00E1pio");
		btnCardpio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaCardapio janelaCardapio = new JanelaCardapio();
				janelaCardapio.setVisible(true);
			}
		});
		btnCardpio.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCardpio.setBounds(158, 125, 129, 50);
		contentPane.add(btnCardpio);
	}
}
