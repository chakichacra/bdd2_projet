package interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButtonMenuItem;


public class ajouterPatient {

	private JFrame frame;
	private JTextField nom;
	private JTextField prenom;
	private JTextField adresse;
	private JTextField tel;
	private JTextField login;
	private JPasswordField motDePasse;
	private JTextField moyenDecouverte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajouterPatient window = new ajouterPatient();
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
	public ajouterPatient() {
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
		deconnexion.setBounds(10, 406, 230, 23);
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
		
		JLabel lblNewLabel_2 = new JLabel("Ajouter un patient");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(114, 27, 428, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("formulaire d'ajout de patient :\r");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_4.setBounds(22, 135, 241, 14);
		panel_centre.add(lblNewLabel_4);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setBounds(22, 170, 200, 23);
		panel_centre.add(lblNom);
		
		nom = new JTextField();
		nom.setBounds(232, 172, 241, 20);
		panel_centre.add(nom);
		nom.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		lblPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrenom.setFont(new Font("Verdana", Font.BOLD, 12));
		lblPrenom.setBounds(22, 204, 200, 23);
		panel_centre.add(lblPrenom);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBounds(232, 206, 241, 20);
		panel_centre.add(prenom);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresse.setFont(new Font("Verdana", Font.BOLD, 12));
		lblAdresse.setBounds(22, 238, 200, 23);
		panel_centre.add(lblAdresse);
		
		adresse = new JTextField();
		adresse.setColumns(10);
		adresse.setBounds(232, 240, 241, 20);
		panel_centre.add(adresse);
		
		JLabel lblTel = new JLabel("tel");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTel.setBounds(22, 306, 200, 23);
		panel_centre.add(lblTel);
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBounds(232, 308, 241, 20);
		panel_centre.add(tel);
		
		
		JDateChooser dateNaissance = new JDateChooser();
        dateNaissance.setBounds(232, 271, 241, 20);
        panel_centre.add(dateNaissance);
        
        JLabel lblDateDeNaissance = new JLabel("date de naissance");
        lblDateDeNaissance.setHorizontalAlignment(SwingConstants.CENTER);
        lblDateDeNaissance.setFont(new Font("Verdana", Font.BOLD, 12));
        lblDateDeNaissance.setBounds(22, 272, 200, 23);
        panel_centre.add(lblDateDeNaissance);
        
        JLabel lblSexe = new JLabel("sexe");
        lblSexe.setHorizontalAlignment(SwingConstants.CENTER);
        lblSexe.setFont(new Font("Verdana", Font.BOLD, 12));
        lblSexe.setBounds(22, 340, 200, 23);
        panel_centre.add(lblSexe);
        
        JLabel lblLogin = new JLabel("login");
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setFont(new Font("Verdana", Font.BOLD, 12));
        lblLogin.setBounds(22, 374, 200, 23);
        panel_centre.add(lblLogin);
        
        login = new JTextField();
        login.setColumns(10);
        login.setBounds(232, 376, 241, 20);
        panel_centre.add(login);
        
        JLabel lblMotDePasse = new JLabel("mot de passe");
        lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
        lblMotDePasse.setFont(new Font("Verdana", Font.BOLD, 12));
        lblMotDePasse.setBounds(22, 408, 200, 23);
        panel_centre.add(lblMotDePasse);
        
        motDePasse = new JPasswordField();
        motDePasse.setBounds(232, 410, 241, 20);
        panel_centre.add(motDePasse);
        
        JLabel lblMoyenDeDcouverte = new JLabel("moyen de d\u00E9couverte");
        lblMoyenDeDcouverte.setHorizontalAlignment(SwingConstants.CENTER);
        lblMoyenDeDcouverte.setFont(new Font("Verdana", Font.BOLD, 12));
        lblMoyenDeDcouverte.setBounds(22, 442, 200, 23);
        panel_centre.add(lblMoyenDeDcouverte);
        
        moyenDecouverte = new JTextField();
        moyenDecouverte.setColumns(10);
        moyenDecouverte.setBounds(232, 444, 241, 20);
        panel_centre.add(moyenDecouverte);
        
        JLabel lblPremiereConsultation = new JLabel("Premiere consultation");
        lblPremiereConsultation.setHorizontalAlignment(SwingConstants.CENTER);
        lblPremiereConsultation.setFont(new Font("Verdana", Font.BOLD, 12));
        lblPremiereConsultation.setBounds(22, 476, 200, 23);
        panel_centre.add(lblPremiereConsultation);
        
        JDateChooser premiereConsultation = new JDateChooser();
        premiereConsultation.setBounds(232, 477, 241, 20);
        panel_centre.add(premiereConsultation);
        
        JRadioButton homme = new JRadioButton("homme");
        homme.setBounds(232, 341, 67, 23);
        panel_centre.add(homme);
        
        JRadioButton femme = new JRadioButton("femme");
        femme.setBounds(337, 341, 67, 23);
        panel_centre.add(femme);
        
        ButtonGroup group = new ButtonGroup();
        group.add(homme);
        group.add(femme);
		
		
	}
}
