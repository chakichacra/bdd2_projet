package interface_graphique;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EnregistrePatient extends JPanel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnregistrePatient window = new EnregistrePatient();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EnregistrePatient() {
		initialize(new JFrame());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(JFrame fra) {
		frame = fra;
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setForeground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Inscription");
		label.setBounds(0, 0, 578, 37);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 34, 578, 354);
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setBounds(138, 5, 47, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(263, 9, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setForeground(Color.WHITE);
		lblPrnom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrnom.setBounds(138, 43, 86, 25);
		panel.add(lblPrnom);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setForeground(Color.WHITE);
		lblDateDeNaissance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateDeNaissance.setBounds(85, 81, 179, 25);
		panel.add(lblDateDeNaissance);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdresse.setBounds(138, 122, 86, 25);
		panel.add(lblAdresse);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(263, 44, 116, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(263, 85, 116, 22);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(263, 119, 116, 22);
		panel.add(textField_3);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setForeground(Color.WHITE);
		lblTelephone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelephone.setBounds(138, 157, 110, 25);
		panel.add(lblTelephone);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(263, 161, 116, 22);
		panel.add(textField_4);
		
		JLabel lblSexe = new JLabel("Sexe");
		lblSexe.setForeground(Color.WHITE);
		lblSexe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSexe.setBounds(138, 194, 76, 25);
		panel.add(lblSexe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(263, 195, 116, 22);
		comboBox.addItem("Homme");
		comboBox.addItem("Femme");
		comboBox.addItem("Autre");
		panel.add(comboBox);
		
		JLabel lblIdentifiant = new JLabel("Identifiant");
		lblIdentifiant.setForeground(Color.WHITE);
		lblIdentifiant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIdentifiant.setBounds(138, 228, 110, 25);
		panel.add(lblIdentifiant);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(263, 230, 116, 22);
		panel.add(textField_5);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setForeground(Color.WHITE);
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotDePasse.setBounds(138, 270, 130, 25);
		panel.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(263, 274, 116, 22);
		panel.add(passwordField);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(263, 274, 116, 22);
		panel.add(textField_6);
		
		JButton btnNewButton = new JButton("s'enregistrer");
		btnNewButton.setBounds(216, 391, 150, 25);
	}
}
