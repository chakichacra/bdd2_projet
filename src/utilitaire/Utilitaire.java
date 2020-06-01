package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class Utilitaire {
	
	public static Connection loadDatabase() {
		Connection connexion;
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver"); //oracle.jdbc.driver.OracleDriver  com.mysql.cj.jdbc.Drive
	    } catch (ClassNotFoundException e) {
	    	System.out.println(e.getMessage());
	    }

	    try {
	        connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetbdd?" + 
	        		"serverTimezone=UTC", "root", "efrei123");
	    } 
		catch (SQLException e) {
			System.out.println(e.getMessage());
			connexion = null;
	    }
	    return connexion;
	}
	
	public static String encryptThisString(String input) 
    { 
        try { 
            // getInstance() method is called with algorithm SHA-1 
            MessageDigest md = MessageDigest.getInstance("SHA-1"); 
  
            // digest() method is called 
            // to calculate message digest of the input string 
            // returned as array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
  
            // Add preceding 0s to make it 32 bit 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            // return the HashText 
            return hashtext; 
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        }
    } 
	
	public static boolean login(String username, String password) {
		try {
		Connection connexion = Utilitaire.loadDatabase();
		Statement statement = connexion.createStatement();
		ResultSet result = statement.executeQuery(String.format("SELECT Id_patient FROM patient WHERE login=%s AND mdp=%s;", username, Utilitaire.encryptThisString(password)));
		if (result.next())
			return true;
		else
			return false;
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public static String getId(String username, String password) {
		String ret = "";
		try {
			Connection connexion = Utilitaire.loadDatabase();
			Statement statement = connexion.createStatement();
			ResultSet result = statement.executeQuery(String.format("SELECT Id_patient FROM patient WHERE login=%s AND mdp=%s;", username, Utilitaire.encryptThisString(password)));
			result.next();
			ret = result.getString("id_patient");
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		return ret;
	}
	
	public static ArrayList<Integer> getAllPatientId(){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		try {
			Connection connexion = Utilitaire.loadDatabase();
			Statement statement = connexion.createStatement();
			ResultSet result = statement.executeQuery(String.format("SELECT Id_patient FROM patient;"));
			while(result.next()) {
				ret.add(Integer.parseInt(result.getString("Id_patient")));
			}
			
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		return ret;
	}
	
	public static ArrayList<Integer> getAllRDVId(){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		try {
			Connection connexion = Utilitaire.loadDatabase();
			Statement statement = connexion.createStatement();
			ResultSet result = statement.executeQuery(String.format("SELECT Id_rdv FROM rendez_vous;"));
			while(result.next()) {
				ret.add(Integer.parseInt(result.getString("Id_rdv")));
			}
			
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		return ret;
	}
	
	
	
}
