package interface_graphique;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientMenu extends JPanel {
	private JTextField txtMenuPatient;

	/**
	 * Create the panel.
	 */
	public PatientMenu() {
		setPreferredSize(new Dimension(200, 500));
		setLayout(null);
		
		txtMenuPatient = new JTextField();
		txtMenuPatient.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuPatient.setText("MENU PATIENT");
		txtMenuPatient.setBounds(10, 161, 180, 20);
		add(txtMenuPatient);
		txtMenuPatient.setColumns(10);
		
		JButton btnNewButton = new JButton("consulter mes rendez-vous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 208, 180, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("prendre un rendez-vous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 242, 180, 23);
		add(btnNewButton_1);

	}
}
