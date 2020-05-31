package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

public class Utilitaire {
	
	public static Connection loadDatabase() {
		Connection connexion;
		try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	    }

	    try {
	        connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetbdd?" + 
	        		"serverTimezone=UTC", "root", "efrei123");
	    } 
		catch (SQLException e) {
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

}
