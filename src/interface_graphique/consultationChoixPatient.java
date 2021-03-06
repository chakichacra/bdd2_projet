package interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class consultationChoixPatient {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultationChoixPatient window = new consultationChoixPatient();
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
	public consultationChoixPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setMinimumSize(new Dimension(1000, 1000));
		frame.setSize(new Dimension(1000, 1000));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 961);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel entete = new JPanel();
		entete.setBackground(Color.LIGHT_GRAY);
		entete.setPreferredSize(new Dimension(100, 100));
		panel.add(entete, BorderLayout.NORTH);
		entete.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application de gestion des rendez-vous pour psychologue");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel.setBounds(111, 23, 731, 44);
		entete.add(lblNewLabel);
		
		JPanel menu = new JPanel();
		menu.setBackground(Color.LIGHT_GRAY);
		menu.setPreferredSize(new Dimension(250, 50));
		panel.add(menu, BorderLayout.WEST);
		menu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu pour patient\r\n");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 170, 230, 26);
		menu.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 250, 82);
		menu.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnAjouterPatient = new JButton("ajouter un patient");
		btnAjouterPatient.setBounds(10, 230, 230, 23);
		menu.add(btnAjouterPatient);
		
		JButton btnAjouterUnRendezvous = new JButton("ajouter un rendez-vous");
		btnAjouterUnRendezvous.setBounds(10, 264, 230, 23);
		menu.add(btnAjouterUnRendezvous);
		
		JButton btnConsulterMesRendezvous = new JButton("consulter mes rendez-vous");
		btnConsulterMesRendezvous.setBounds(10, 298, 230, 23);
		menu.add(btnConsulterMesRendezvous);
		
		JButton btnConsulterLesRendezvous = new JButton("consulter les rendez-vous d'un patient");
		btnConsulterLesRendezvous.setBounds(10, 332, 230, 23);
		menu.add(btnConsulterLesRendezvous);
		
		JButton deconnexion = new JButton("Deconnexion");
		deconnexion.setBounds(10, 381, 230, 23);
		menu.add(deconnexion);
		
		JPanel footer = new JPanel();
		footer.setBackground(Color.LIGHT_GRAY);
		footer.setPreferredSize(new Dimension(100, 100));
		panel.add(footer, BorderLayout.SOUTH);
		
		JPanel panel_centre = new JPanel();
		panel_centre.setVisible(true);
		panel.add(panel_centre, BorderLayout.CENTER);
		panel_centre.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 734, 83);
		panel_centre.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Consulter les rendez-vous d'un patient");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(114, 27, 428, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choisir un patient");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(22, 170, 200, 23);
		panel_centre.add(lblNewLabel_3);
		
		JComboBox BoxChoixPatient = new JComboBox();
		BoxChoixPatient.setModel(new DefaultComboBoxModel(new String[] {"patient1", "patient2", "patient3"}));
		BoxChoixPatient.setBounds(232, 171, 200, 22);
		panel_centre.add(BoxChoixPatient);
		
		JButton btnValiderPatient = new JButton("valider");
		btnValiderPatient.setBounds(442, 171, 89, 23);
		panel_centre.add(btnValiderPatient);
		
		
		btnAjouterPatient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ajouterPatient window = new ajouterPatient();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		btnAjouterUnRendezvous.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ajouterRDV window = new ajouterRDV();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		btnConsulterMesRendezvous.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConsulterRDVPsy window = new ConsulterRDVPsy();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		btnConsulterLesRendezvous.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				consultationChoixPatient window = new consultationChoixPatient();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		deconnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.fmain();
				frame.dispose();
			}
		});
		
		btnValiderPatient.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
	}

}
