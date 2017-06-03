package java_ps9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.ActionEvent;

public class IntTworzDruzyne extends JFrame {

	private JPanel contentPane;
	private JTextField tfZawodnik3_imie;
	private JTextField tfZawodnik3_nazwisko;
	private JTextField tfZawodnik2_imie;
	private JTextField tfZawodnik2_nazwisko;
	private JTextField tfZawodnik5_imie;
	private JTextField tfZawodnik4_imie;
	private JTextField tfZawodnik4_nazwisko;
	private JTextField tfZawodnik5_nazwisko;
	private JTextField tfZawodnik6_imie;
	private JTextField tfZawodnik6_nazwisko;
	private JTextField tfZawodnik1_imie;
	private JTextField tfZawodnik1_nazwisko;
	private JTextField tfNazwaDruzyny;

	//private LinkedList<Dru퓓na> lista_druzyn_tworzona = new LinkedList<>();
	private Dru퓓na dru퓓na_tworzona = new Dru퓓na();
	/*public String getNazwaDruzyny(int i){
		return lista_druzyn_tworzona.get(i).getNazwa();
	}
	*/
	/*public List<Dru퓓na> getDru퓓ny(){
		return lista_druzyn_tworzona;
	}*/
	public Dru퓓na getDru퓓na(){
		return dru퓓na_tworzona;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntTworzDruzyne frame = new IntTworzDruzyne();
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
	public IntTworzDruzyne() {
		
		
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 482, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pZ3 = new JPanel();
		pZ3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "3. zawodnik", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pZ3.setBounds(316, 42, 146, 100);
		contentPane.add(pZ3);
		pZ3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Imi\u0119");
		lblNewLabel.setBounds(6, 24, 72, 14);
		pZ3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Nazwisko");
		lblNewLabel_1.setBounds(6, 62, 72, 14);
		pZ3.add(lblNewLabel_1);
		
		tfZawodnik3_imie = new JTextField();
		tfZawodnik3_imie.setBounds(76, 21, 60, 20);
		pZ3.add(tfZawodnik3_imie);
		tfZawodnik3_imie.setColumns(10);
				
		
		tfZawodnik3_nazwisko = new JTextField();
		tfZawodnik3_nazwisko.setBounds(76, 59, 60, 20);
		pZ3.add(tfZawodnik3_nazwisko);
		tfZawodnik3_nazwisko.setColumns(10);
		
		JPanel pZ2 = new JPanel();
		pZ2.setLayout(null);
		pZ2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "2. zawodnik", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pZ2.setBounds(163, 42, 146, 100);
		contentPane.add(pZ2);
		
		JLabel label_1 = new JLabel("Imi\u0119");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 24, 67, 14);
		pZ2.add(label_1);
		
		JLabel label_2 = new JLabel("Nazwisko");
		label_2.setBounds(10, 62, 67, 14);
		pZ2.add(label_2);
		
		tfZawodnik2_imie = new JTextField();
		tfZawodnik2_imie.setColumns(10);
		tfZawodnik2_imie.setBounds(76, 21, 60, 20);
		pZ2.add(tfZawodnik2_imie);
		
		tfZawodnik2_nazwisko = new JTextField();
		tfZawodnik2_nazwisko.setColumns(10);
		tfZawodnik2_nazwisko.setBounds(76, 59, 60, 20);
		pZ2.add(tfZawodnik2_nazwisko);
		
		JPanel pZ5 = new JPanel();
		pZ5.setLayout(null);
		pZ5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "5. zawodnik", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pZ5.setBounds(163, 171, 146, 100);
		contentPane.add(pZ5);
		
		JLabel label_4 = new JLabel("Imi\u0119");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(6, 24, 68, 14);
		pZ5.add(label_4);
		
		JLabel label_5 = new JLabel("Nazwisko");
		label_5.setBounds(6, 62, 68, 14);
		pZ5.add(label_5);
		
		tfZawodnik5_imie = new JTextField();
		tfZawodnik5_imie.setColumns(10);
		tfZawodnik5_imie.setBounds(76, 21, 60, 20);
		pZ5.add(tfZawodnik5_imie);
		
		tfZawodnik5_nazwisko = new JTextField();
		tfZawodnik5_nazwisko.setColumns(10);
		tfZawodnik5_nazwisko.setBounds(76, 59, 60, 20);
		pZ5.add(tfZawodnik5_nazwisko);
		
		JPanel pZ4 = new JPanel();
		pZ4.setLayout(null);
		pZ4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "4. zawodnik", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pZ4.setBounds(10, 171, 146, 100);
		contentPane.add(pZ4);
		
		JLabel label_7 = new JLabel("Imi\u0119");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(6, 24, 68, 14);
		pZ4.add(label_7);
		
		JLabel label_8 = new JLabel("Nazwisko");
		label_8.setBounds(6, 62, 68, 14);
		pZ4.add(label_8);
		
		tfZawodnik4_imie = new JTextField();
		tfZawodnik4_imie.setColumns(10);
		tfZawodnik4_imie.setBounds(76, 21, 60, 20);
		pZ4.add(tfZawodnik4_imie);
		
		tfZawodnik4_nazwisko = new JTextField();
		tfZawodnik4_nazwisko.setColumns(10);
		tfZawodnik4_nazwisko.setBounds(76, 59, 60, 20);
		pZ4.add(tfZawodnik4_nazwisko);
		
		JPanel pZ6 = new JPanel();
		pZ6.setLayout(null);
		pZ6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "6. zawodnik", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pZ6.setBounds(316, 171, 146, 100);
		contentPane.add(pZ6);
		
		JLabel label_10 = new JLabel("Imi\u0119");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(6, 24, 71, 14);
		pZ6.add(label_10);
		
		JLabel label_11 = new JLabel("Nazwisko");
		label_11.setBounds(6, 62, 71, 14);
		pZ6.add(label_11);
		
		tfZawodnik6_imie = new JTextField();
		tfZawodnik6_imie.setColumns(10);
		tfZawodnik6_imie.setBounds(76, 21, 60, 20);
		pZ6.add(tfZawodnik6_imie);
		
		tfZawodnik6_nazwisko = new JTextField();
		tfZawodnik6_nazwisko.setColumns(10);
		tfZawodnik6_nazwisko.setBounds(76, 59, 60, 20);
		pZ6.add(tfZawodnik6_nazwisko);
		
		JPanel pZ1 = new JPanel();
		pZ1.setLayout(null);
		pZ1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "1. zawodnik", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pZ1.setBounds(10, 42, 146, 100);
		contentPane.add(pZ1);
		
		JLabel label_13 = new JLabel("Imi\u0119");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(6, 24, 71, 14);
		pZ1.add(label_13);
		
		JLabel label_14 = new JLabel("Nazwisko");
		label_14.setBounds(6, 62, 71, 14);
		pZ1.add(label_14);
		
		tfZawodnik1_imie = new JTextField();
		tfZawodnik1_imie.setColumns(10);
		tfZawodnik1_imie.setBounds(77, 20, 60, 20);
		pZ1.add(tfZawodnik1_imie);
		
		tfZawodnik1_nazwisko = new JTextField();
		tfZawodnik1_nazwisko.setColumns(10);
		tfZawodnik1_nazwisko.setBounds(77, 60, 60, 20);
		pZ1.add(tfZawodnik1_nazwisko);
		
		JButton bDodajDruzyne = new JButton("Dodaj");
		
		bDodajDruzyne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String imie1  = tfZawodnik1_imie.getText();
				String imie2  = tfZawodnik2_imie.getText();
				String imie3  = tfZawodnik3_imie.getText();
				String imie4  = tfZawodnik4_imie.getText();
				String imie5  = tfZawodnik5_imie.getText();
				String imie6  = tfZawodnik6_imie.getText();
				String nazwisko1  = tfZawodnik1_nazwisko.getText();
				String nazwisko2  = tfZawodnik2_nazwisko.getText();
				String nazwisko3  = tfZawodnik3_nazwisko.getText();
				String nazwisko4  = tfZawodnik4_nazwisko.getText();
				String nazwisko5  = tfZawodnik5_nazwisko.getText();
				String nazwisko6  = tfZawodnik6_nazwisko.getText(); 
				String nazwa  = tfNazwaDruzyny.getText();
				
				tfNazwaDruzyny.setText("");
				tfZawodnik1_imie.setText("");
				tfZawodnik2_imie.setText("");
				tfZawodnik3_imie.setText("");
				tfZawodnik4_imie.setText("");
				tfZawodnik5_imie.setText("");
				tfZawodnik6_imie.setText("");
				tfZawodnik1_nazwisko.setText("");
				tfZawodnik2_nazwisko.setText("");
				tfZawodnik3_nazwisko.setText("");
				tfZawodnik4_nazwisko.setText("");
				tfZawodnik5_nazwisko.setText("");
				tfZawodnik6_nazwisko.setText("");
				
				
				
				Zawodnik gracz1 = new Zawodnik(imie1, nazwisko1);
				Zawodnik gracz2 = new Zawodnik(imie2, nazwisko2);
				Zawodnik gracz3 = new Zawodnik(imie3, nazwisko3);
				Zawodnik gracz4 = new Zawodnik(imie4, nazwisko4);
				Zawodnik gracz5 = new Zawodnik(imie5, nazwisko5);
				Zawodnik gracz6 = new Zawodnik(imie6, nazwisko6);
				
			
				/*Dru퓓na team = new Dru퓓na();
				team.setNazwa(nazwa);
				team.dodajZawodnika(gracz1);
				team.dodajZawodnika(gracz2);
				team.dodajZawodnika(gracz3);
				team.dodajZawodnika(gracz4);
				team.dodajZawodnika(gracz5);
				team.dodajZawodnika(gracz6);
			*/
				//lista_druzyn_tworzona.add(team);
				dru퓓na_tworzona.setNazwa(nazwa);
				dru퓓na_tworzona.dodajZawodnika(gracz1);
				dru퓓na_tworzona.dodajZawodnika(gracz2);
				dru퓓na_tworzona.dodajZawodnika(gracz3);
				dru퓓na_tworzona.dodajZawodnika(gracz4);
				dru퓓na_tworzona.dodajZawodnika(gracz5);
				dru퓓na_tworzona.dodajZawodnika(gracz6);
			}
		});
		bDodajDruzyne.setBounds(373, 282, 89, 23);
		contentPane.add(bDodajDruzyne);
		
		tfNazwaDruzyny = new JTextField();
		tfNazwaDruzyny.setBounds(217, 11, 86, 20);
		contentPane.add(tfNazwaDruzyny);
		tfNazwaDruzyny.setColumns(10);
		
		JLabel lblNazwaDruyny = new JLabel("Nazwa dru\u017Cyny");
		lblNazwaDruyny.setBounds(103, 14, 104, 14);
		contentPane.add(lblNazwaDruyny);
	}
}
