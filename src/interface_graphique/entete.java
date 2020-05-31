package interface_graphique;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class entete extends JPanel {

	/**
	 * Create the panel.
	 */
	public entete() {
		setPreferredSize(new Dimension(1000, 135));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 1000, 135);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application de gestion de rendez-vous pour psychologue");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(102, 32, 735, 51);
		panel.add(lblNewLabel);

	}
}
