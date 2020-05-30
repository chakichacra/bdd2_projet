package interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login {
	
	private JPanel pan;
	private JPanel formulaire;
	
	public Login() {
		//set up du panel principal test
		this.pan = new JPanel();
		this.pan.setBackground(Color.darkGray);
		this.pan.setLayout(new BorderLayout());
		
		//Creation du panel qui comportera les input login/password		
		this.formulaire = new JPanel();
		this.formulaire.setBackground(Color.darkGray);
		this.formulaire.setLayout(new BorderLayout());
		this.formulaire.setBorder(new EmptyBorder(200, 10, 100, 10));
		
		//Creation du titre de la fenetre Connexion
		JLabel titre = new JLabel();
		titre.setFont(titre.getFont().deriveFont(50.0f));
		titre.setText("Connexion");
		titre.setForeground(Color.white);
		pan.add(titre);
		
		//Creation de la ligne identifiant et ajout au panel formulaire		
		JTextField loginInput = new JTextField();
		loginInput.setPreferredSize(new Dimension(100, 20));		
		JPanel loginLine = new JPanel();
		JLabel labelIdentifiant = new JLabel();
		labelIdentifiant.setText("Identifiant: ");
		loginLine.add(labelIdentifiant);
		loginLine.add(loginInput);		
		this.formulaire.add(loginLine, BorderLayout.NORTH);
		
		//Creation de la ligne mot de passe et ajout au panel formulaire
		JTextField passwordInput = new JTextField();
		passwordInput.setPreferredSize(new Dimension(100, 20));		
		JPanel passwordLine = new JPanel();
		JLabel labelPassword = new JLabel();
		labelPassword.setText("Mot de passe: ");
		passwordLine.add(labelPassword);
		passwordLine.add(passwordInput);		
		this.formulaire.add(passwordLine);
		
		this.pan.setLayout(new BoxLayout(this.pan, BoxLayout.PAGE_AXIS));
		this.pan.add(this.formulaire, BorderLayout.CENTER);
		this.formulaire.setBackground(Color.darkGray);
	}
	
	public JPanel getJPanel() {
		return this.pan;
	}
}
