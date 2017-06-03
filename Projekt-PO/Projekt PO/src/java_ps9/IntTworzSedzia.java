package java_ps9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntTworzSedzia extends JFrame {

	private JPanel contentPane;
	private JTextField tfSedzia_nazwisko;
	private JPanel panel;
	private JTextField tfSedzia_imie;
	private JButton bDodajSedziego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntTworzSedzia frame = new IntTworzSedzia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntTworzSedzia() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 295, 129);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 47, 142, 20);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nazwisko");
		lblNewLabel.setBounds(0, 3, 46, 14);
		panel.add(lblNewLabel);
		
		tfSedzia_nazwisko = new JTextField();
		tfSedzia_nazwisko.setBounds(56, 0, 86, 20);
		panel.add(tfSedzia_nazwisko);
		tfSedzia_nazwisko.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 11, 142, 20);
		contentPane.add(panel_1);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		lblImi.setBounds(0, 3, 46, 14);
		panel_1.add(lblImi);
		
		tfSedzia_imie = new JTextField();
		tfSedzia_imie.setColumns(10);
		tfSedzia_imie.setBounds(56, 0, 86, 20);
		panel_1.add(tfSedzia_imie);
		
		bDodajSedziego = new JButton("Dodaj s\u0119dziego");
		bDodajSedziego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String imie, nazwisko;
				
				imie = tfSedzia_imie.getText();
				nazwisko = tfSedzia_nazwisko.getText();
				tfSedzia_imie.setText("");
				tfSedzia_nazwisko.setText("");
				
				
				Sêdzia sedzia = new Sêdzia(imie, nazwisko);
				
			}
		});
		bDodajSedziego.setBounds(162, 26, 105, 23);
		contentPane.add(bDodajSedziego);
	}
}
