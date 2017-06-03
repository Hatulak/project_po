package java_ps9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class Poczatek {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Poczatek window = new Poczatek();
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
	public Poczatek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 328, 87);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Wczytaj = new JButton("Wczytaj z pliku");
		Wczytaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				JFileChooser fc = new JFileChooser();
				if(fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
				{
					File plik = fc.getSelectedFile();
					JOptionPane.showMessageDialog(null,"Wybrany plik to "+plik.getName());
				}
				GlowneMenu frame = new GlowneMenu();
				frame.setVisible(true);
			}
		});
		Wczytaj.setBounds(182, 11, 120, 23);
		frame.getContentPane().add(Wczytaj);
		
		JButton Tworz = new JButton("Stwórz rozgrywki");
		Tworz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				GlowneMenu frame = new GlowneMenu();
				frame.setVisible(true);
				
			}
		});
		Tworz.setBounds(10, 11, 134, 23);
		frame.getContentPane().add(Tworz);
	}
}
