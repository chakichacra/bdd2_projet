package interface_graphique;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import java.util.Date; 
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class prendreRDV extends JPanel {
	private JTextField txtPrendreUnRendezVous;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public prendreRDV() {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(800, 865));
		setLocation(new Point(200, 135));
		setLayout(null);
		
		txtPrendreUnRendezVous = new JTextField();
		txtPrendreUnRendezVous.setFont(new Font("Verdana", Font.BOLD, 16));
		txtPrendreUnRendezVous.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrendreUnRendezVous.setText("Prendre un rendez-vous");
		txtPrendreUnRendezVous.setBounds(10, 11, 780, 70);
		add(txtPrendreUnRendezVous);
		txtPrendreUnRendezVous.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("choisir un patient");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(196, 149, 171, 17);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"patient1", "patient2", "patient3"}));
		comboBox.setBounds(377, 146, 171, 22);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(377, 179, 171, 22);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(377, 212, 171, 22);
		add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(377, 300, 171, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblChoisirUne = new JLabel("choisir un 2e patient");
		lblChoisirUne.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirUne.setFont(new Font("Verdana", Font.BOLD, 13));
		lblChoisirUne.setBounds(196, 183, 171, 17);
		add(lblChoisirUne);
		
		JLabel lblChoisirUne_1 = new JLabel("choisir un 3e patient");
		lblChoisirUne_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirUne_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblChoisirUne_1.setBounds(196, 216, 171, 17);
		add(lblChoisirUne_1);
		
		JLabel label = new JLabel("choisir un 3e patient");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.BOLD, 13));
		label.setBounds(196, 244, 171, 17);
		add(label);
		
		JLabel label_1 = new JLabel("choisir un 3e patient");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Verdana", Font.BOLD, 13));
		label_1.setBounds(196, 272, 171, 17);
		add(label_1);
		
		JLabel lblPrix = new JLabel("prix");
		lblPrix.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrix.setFont(new Font("Verdana", Font.BOLD, 13));
		lblPrix.setBounds(196, 300, 171, 17);
		add(lblPrix);
	}
}
