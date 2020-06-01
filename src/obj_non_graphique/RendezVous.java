package obj_non_graphique;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import utilitaire.Utilitaire;

public class RendezVous {
	private Integer id;
	private Date date;
	private Float prix;
	private Integer moyenDePaiment;
	private ArrayList<Remarque> remarques;
	private ArrayList<Patient> listPatient;
	private Integer classification;
	private Integer anxiete;
	private HashMap<Patient,Remarque> dictPatientRemarque;
	private HashMap<Patient,Integer> dictPatientAnxiete;
	
	
	public void initWithId(String id) {
		this.id = Integer.parseInt(id);
		try {
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			ResultSet result = statement.executeQuery(String.format("SELECT * FROM rendez_vous WHERE id_rdv=%s", id));
			result.next();
			this.date = new Date(result.getString("date_rdv"));
			this.prix = Float.parseFloat(result.getString("prix"));
			this.moyenDePaiment = Integer.parseInt(result.getString("Id_paiement"));
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void creerRDV() {
		try {
		Connection database = Utilitaire.loadDatabase();
		Statement statement = database.createStatement();
		statement.executeUpdate(String.format("INSERT INTO rendez_vous(date_rdv, prix) VALUES(%s,%s);", this.date, this.prix.toString()));
		
		ResultSet result = statement.executeQuery("SELECT MAX(id_rdv) from rendez_vous;");
		result.next();
		this.id = Integer.parseInt(result.getString("id_rdv"));
		
		for (Patient pat : this.listPatient) {
			Remarque defaultRemarque = new Remarque();
			defaultRemarque.setText("Aucune remarque");
			defaultRemarque.setType("default");
			defaultRemarque.creerRemarque();
			statement.executeUpdate(String.format("INSERT INTO passer(Id_patient,Id_rdv,Id_remarques,Id_classification,anxiete) VALUES(%s,%s,%s,%s,%s);", 
					pat.getId().toString(), this.id.toString(), defaultRemarque.getId().toString(),
					this.classification.toString(), this.dictPatientAnxiete.get(pat).toString()));
		}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void initializeWithId(Integer id) {
		this.id = id;
		try {
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM rendez_vous;");
			result.next();
			this.prix = Float.parseFloat(result.getString("prix"));
			this.date = new Date(result.getString("date_rdv"));
			statement.executeUpdate(String.format("INSERT INTO rendez_vous(date_rdv, prix) VALUES(%s,%s);", this.date, this.prix));
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public void setPrix(Float prix) {
		this.prix = prix;
	}


	public RendezVous() {
		this.date = null;
	}

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}
	

}
