package interface_graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

public class interface_patient {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interface_patient window = new interface_patient();
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
	public interface_patient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(new Dimension(1000, 1000));
		frame.getContentPane().setLayout(null);
		
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
		menu.setPreferredSize(new Dimension(200, 50));
		panel.add(menu, BorderLayout.WEST);
		menu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Menu pour patient\r\n");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 170, 180, 26);
		menu.add(lblNewLabel_1);
		
		JButton deconnexion = new JButton("deconnexion\r\n");
		deconnexion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deconnexion.setBounds(10, 328, 180, 23);
		menu.add(deconnexion);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 200, 82);
		menu.add(panel_4);
		panel_4.setLayout(null);
		
		JButton fut = new JButton("rendez-vous futurs");
		fut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		;
		
		fut.setBounds(10, 225, 180, 23);
		menu.add(fut);
		fut.setFont(new Font("Verdana", Font.PLAIN, 11));
		JButton ant = new JButton("rendez-vous anterieurs");
		
		
		ant.setBounds(10, 259, 180, 23);
		menu.add(ant);
		ant.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		JPanel footer = new JPanel();
		footer.setBackground(Color.LIGHT_GRAY);
		footer.setPreferredSize(new Dimension(100, 100));
		panel.add(footer, BorderLayout.SOUTH);
		
		JPanel panel_centre = new JPanel();
		panel_centre.setVisible(false);
		panel.add(panel_centre, BorderLayout.CENTER);
		panel_centre.setLayout(new CardLayout(0, 0));
		
		JPanel anterieurs = new JPanel();
		anterieurs.setVisible(false);
		panel_centre.add(anterieurs, "name_837370415369600");
		anterieurs.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 784, 82);
		anterieurs.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Consulter mes rendez-vous");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(152, 21, 500, 50);
		panel_1.add(lblNewLabel_2);
		
		JPanel futurs = new JPanel();
		panel_centre.add(futurs, "name_837388509346100");
		futurs.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 784, 82);
		futurs.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Consulter mes rendez-vous");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(155, 21, 500, 50);
		panel_2.add(lblNewLabel_4);
		
		fut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				consultationRDVFuturs window = new consultationRDVFuturs();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});

		ant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConsultationRDVAnterieurs window = new ConsultationRDVAnterieurs();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		
		deconnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.fmain();
				frame.dispose();
			}
		});
		
	}
}
