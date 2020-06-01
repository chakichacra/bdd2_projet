package interface_graphique;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultationRDVAnterieurs {

	JFrame frame;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultationRDVAnterieurs window = new ConsultationRDVAnterieurs();
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
	public ConsultationRDVAnterieurs() {
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
		panel_centre.setVisible(true);
		panel.add(panel_centre, BorderLayout.CENTER);
		
		JPanel anterieurs = new JPanel();
		anterieurs.setVisible(true);
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
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_3 = new JLabel("rendez-vous ant\u00E9rieurs :");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 12));
		GroupLayout gl_panel_centre = new GroupLayout(panel_centre);
		gl_panel_centre.setHorizontalGroup(
			gl_panel_centre.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_centre.createSequentialGroup()
					.addComponent(anterieurs, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_centre.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 763, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_centre.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(557, Short.MAX_VALUE))
		);
		gl_panel_centre.setVerticalGroup(
			gl_panel_centre.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_centre.createSequentialGroup()
					.addComponent(anterieurs, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
				
			table_2 = new JTable();
			table_2.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "jour", "heure", "prix", "paiement", "New column", "New column"
				}
			));
			scrollPane.setColumnHeaderView(table_2);
			scrollPane.setViewportView(table_2);
			panel_centre.setLayout(gl_panel_centre);
			
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
