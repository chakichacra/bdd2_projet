package interface_graphique;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class cosultationRDVPatient extends JPanel {
	private JTextField txtConsultationsDesRendezvous;

	/**
	 * Create the panel.
	 */
	public cosultationRDVPatient() {
		setPreferredSize(new Dimension(800, 865));
		setLocation(new Point(200, 135));
		setLayout(null);
		
		txtConsultationsDesRendezvous = new JTextField();
		txtConsultationsDesRendezvous.setFont(new Font("Verdana", Font.BOLD, 16));
		txtConsultationsDesRendezvous.setHorizontalAlignment(SwingConstants.CENTER);
		txtConsultationsDesRendezvous.setText("Consultations des rendez-vous");
		txtConsultationsDesRendezvous.setBounds(10, 11, 780, 70);
		add(txtConsultationsDesRendezvous);
		txtConsultationsDesRendezvous.setColumns(10);
		
		JButton btnNewButton = new JButton("rendez-vous passés");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(160, 155, 159, 40);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("rendez-vous futurs");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(460, 155, 165, 40);
		add(btnNewButton_1);
	}

}
