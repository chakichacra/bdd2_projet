package obj_non_graphique;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utilitaire.Utilitaire;

public class Remarque {
	private String text;
	private String type;
	private Integer id;
	
	public void initWithId(String id) {
		try {
			this.id = Integer.parseInt(id);
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			ResultSet result = statement.executeQuery(String.format("SELECT * FROM remarques WHERE Id_remarques=%s", id));
			result.next();
			this.text = result.getString("description");
			
			result = statement.executeQuery(String.format("SELECT * FROM type_remarque WHERE Id_TypeRemarques=%s", result.getString("Id_TypeRemarques")));
			result.next();
			this.type = result.getString("Libelle");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void creerRemarque() {
		try {
			Connection database = Utilitaire.loadDatabase();
			Statement statement = database.createStatement();
			ResultSet result  = statement.executeQuery(String.format("SELECT Id_TypeRemarque FROM type_remarque WHERE Libelle='%s'", this.type));
			result.next();
			String typeId = result.getString("Id_TypeRemarque");
			statement.executeUpdate(String.format("INSERT INTO remarques(description,Id_TypeRemarque) VALUES('%s',%s)", this.text, typeId));
			result = statement.executeQuery("SELECT MAX(id_remarques) from remarques;");
			result.next();
			this.id = Integer.parseInt(result.getString("id_remarques"));
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
