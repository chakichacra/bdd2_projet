package interface_graphique;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu extends JPanel {
	private JTextField txtMenuPsy;

	/**
	 * Create the panel.
	 */
	public AdminMenu() {
		setPreferredSize(new Dimension(200, 500));
		setLayout(null);
		
		txtMenuPsy = new JTextField();
		txtMenuPsy.setHorizontalAlignment(SwingConstants.CENTER);
		txtMenuPsy.setText("MENU PSY");
		txtMenuPsy.setBounds(10, 155, 180, 20);
		add(txtMenuPsy);
		txtMenuPsy.setColumns(10);
		
		JButton btnNewButton = new JButton("consulter mes rendez-vous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 208, 180, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("cr\u00E9er un rendez-vous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 242, 180, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ajouter un patient");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(10, 276, 180, 23);
		add(btnNewButton_2);

	}

}
