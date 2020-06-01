package interface_graphique;
import java.awt.CardLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class main {
	
	public static void fmain() {
		JFrame frame = new JFrame();
        JPanel card = new JPanel(new CardLayout());
        frame.setSize(1000, 1000);
        frame.setBackground(Color.DARK_GRAY);
        Connexion pan = new Connexion();
        card.add(pan);
        frame.setContentPane(card);

        pan.getButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                card.remove(pan);
                //interface_psy window = new interface_psy();
                interface_patient window = new interface_patient();
				window.frame.setVisible(true);
				frame.dispose();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        fmain();
    }

}
