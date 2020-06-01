package obj_non_graphique;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utilitaire.Utilitaire;

public class Patient {
	private Integer id;
	private String prenom;
	private String nom;
	private String adresse;
	private Date dateDeNaissance;
	private String numeroDeTelephone;
	private String sexe;
	private String identifiant;
	private String password;
	
	private Travail travail;
	
	private String moyenDeDecouverte;
	private Date datePremiereConsultation;

	public void initWithId(Integer id) {
		this.id = id;
		try {
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			ResultSet result = statement
					.executeQuery(String.format("SELECT * from patient where Id_patient=%s;", id.toString()));

			result.next();
			this.prenom = result.getString("Prenom");
			this.nom = result.getString("Nom");
			this.adresse = result.getString("adresse");
			this.dateDeNaissance = new Date(result.getString("date_naissance"));
			this.numeroDeTelephone = result.getString("tel");
			this.sexe = result.getString("sexe");
			this.identifiant = result.getString("login");
			this.moyenDeDecouverte = result.getString("moyenDecouverte");
			this.datePremiereConsultation = new Date(result.getString("PremiereConsultation"));
			this.travail = new Travail();
			
			/*result = statement.executeQuery(String.format("SELECT * FROM avoir where Id_patient=%s;", id.toString()));
			result.next();
			this.travail.setDateDebut(new Date(result.getString("date_debut")));
			this.travail.setDateFin(new Date(result.getString("date_fin")));*/
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void enregistrerPatient() {
		try {
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			statement.executeUpdate("INSERT INTO patient(Prenom,Nom,adresse,date_naissance,tel,sexe,login,mdp,moyenDecouverte,PremiereConsultation) " +
					String.format("VALUES('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s');", 
							this.prenom,
							this.nom,
							this.adresse,
							this.dateDeNaissance.toSQLFormat(),
							this.numeroDeTelephone,
							this.sexe,
							this.identifiant,
							this.password,
							this.moyenDeDecouverte,
							this.datePremiereConsultation.toSQLFormat()));
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void initWithId(String id) {
		this.initWithId(Integer.parseInt(id));
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMoyenDeDecouverte() {
		return moyenDeDecouverte;
	}

	public void setMoyenDeDecouverte(String moyenDeDecouverte) {
		this.moyenDeDecouverte = moyenDeDecouverte;
	}

	public Date getDatePremiereConsultation() {
		return datePremiereConsultation;
	}

	public void setDatePremiereConsultation(Date datePremiereConsultation) {
		this.datePremiereConsultation = datePremiereConsultation;
	}
}
