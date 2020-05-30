package interface_graphique;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		
		window.setSize(1000, 1000);
		//window.setLocation(500, 0);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Connexion");
		
		Login login = new Login();
		window.setContentPane(login.getJPanel());
		
		window.setVisible(true);
	}

}
