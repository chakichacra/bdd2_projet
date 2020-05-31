package obj_non_graphique;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utilitaire.Utilitaire;

public class RendezVous {
	private Integer id;
	private Date date;
	private Float prix;
	
	
	public RendezVous(String id) {
		this.id = Integer.parseInt(id);
		try {
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			ResultSet result = statement.executeQuery(String.format("SELECT * FROM rendez_vous WHERE id_rdv=%s", id));
			result.next();
			this.date = new Date(result.getString("date_rdv"));
			this.prix = Float.parseFloat(result.getString("prix"));
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void creerRDV() {
		try {
		Connection database = Utilitaire.loadDatabase();
		Statement statement = database.createStatement();
		statement.executeUpdate(String.format("INSERT INTO rendez_vous(date_rdv, prix) VALUES(%s,%s);", this.date, this.prix.toString()));
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
