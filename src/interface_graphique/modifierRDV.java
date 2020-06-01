package interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class modifierRDV {

	private JFrame frame;
	private JTextField prix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modifierRDV window = new modifierRDV();
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
	public modifierRDV() {
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
		
		JButton btnNewButton = new JButton("ajouter un patient");
		btnNewButton.setBounds(10, 230, 230, 23);
		menu.add(btnNewButton);
		
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
		panel_centre.setVisible(false);
		panel.add(panel_centre, BorderLayout.CENTER);
		panel_centre.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 734, 83);
		panel_centre.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Modifier un rendez-vous");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(114, 27, 428, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choisir un patient");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(22, 170, 200, 23);
		panel_centre.add(lblNewLabel_3);
		
		JComboBox patient1 = new JComboBox();
		patient1.setModel(new DefaultComboBoxModel(new String[] {"patient1", "patient2"}));
		patient1.setBounds(232, 171, 200, 22);
		panel_centre.add(patient1);
		
		JLabel lblChoisirUne = new JLabel("Choisir un 2e patient");
		lblChoisirUne.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirUne.setFont(new Font("Verdana", Font.BOLD, 12));
		lblChoisirUne.setBounds(22, 204, 200, 23);
		panel_centre.add(lblChoisirUne);
		
		JComboBox patient2 = new JComboBox();
		patient2.setBounds(232, 205, 200, 22);
		panel_centre.add(patient2);
		
		JLabel lblChoisirUne_1 = new JLabel("Choisir un 3e patient");
		lblChoisirUne_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirUne_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblChoisirUne_1.setBounds(22, 238, 200, 23);
		panel_centre.add(lblChoisirUne_1);
		
		JComboBox patient3 = new JComboBox();
		patient3.setBounds(232, 239, 200, 22);
		panel_centre.add(patient3);
		
		JLabel lblChoisirUneDate = new JLabel("Choisir une date");
		lblChoisirUneDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirUneDate.setFont(new Font("Verdana", Font.BOLD, 12));
		lblChoisirUneDate.setBounds(22, 272, 200, 23);
		panel_centre.add(lblChoisirUneDate);
		
		JDateChooser date = new JDateChooser();
		date.setBounds(232, 273, 241, 20);
        panel_centre.add(date);
		
		JLabel lblChoisirUneHeure = new JLabel("Choisir une heure");
		lblChoisirUneHeure.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoisirUneHeure.setFont(new Font("Verdana", Font.BOLD, 12));
		lblChoisirUneHeure.setBounds(22, 306, 200, 23);
		panel_centre.add(lblChoisirUneHeure);
		
		JComboBox heure = new JComboBox();
		heure.setBounds(232, 307, 101, 22);
		panel_centre.add(heure);
		
		JLabel lblPrix = new JLabel("prix");
		lblPrix.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrix.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrix.setBounds(22, 340, 200, 23);
		panel_centre.add(lblPrix);
		
		prix = new JTextField();
		prix.setBounds(232, 342, 200, 20);
		panel_centre.add(prix);
		prix.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("formulaire de prise de rendez-vous :\r\n");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_4.setBounds(22, 135, 241, 14);
		panel_centre.add(lblNewLabel_4);
		
		JComboBox classification1 = new JComboBox();
		classification1.setModel(new DefaultComboBoxModel(new String[] {"enfant", "adolescent", "adulte", "couple"}));
		classification1.setBounds(442, 171, 77, 22);
		panel_centre.add(classification1);
		
		JComboBox classification2 = new JComboBox();
		classification2.setModel(new DefaultComboBoxModel(new String[] {"enfant", "adolescent", "adulte", "couple"}));
		classification2.setBounds(442, 205, 77, 22);
		panel_centre.add(classification2);
		
		JComboBox classification3 = new JComboBox();
		classification3.setModel(new DefaultComboBoxModel(new String[] {"enfant", "adolescent", "adulte", "couple"}));
		classification3.setBounds(442, 239, 77, 22);
		panel_centre.add(classification3);
		
		JButton btnNewButton_1 = new JButton("valider");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.setBounds(62, 433, 89, 23);
		panel_centre.add(btnNewButton_1);
		
	}
}
