package java_ps9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JScrollBar;

public class GlowneMenu extends JFrame {

	private JPanel contentPane;
	private JTable table_2;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_3;
	private JTable table_1;
	private JTable table;
	private JTable table_9;
	private JTable tTabelaDruzyn;
	
	private List<Dru퓓na> lista_druzyn = new LinkedList<>();
	private List<String> lista_nazw_druzyn = new LinkedList<>();
	private IntTworzDruzyne fTworzDruzyne;
	
/*
	public void odswiez(){
		for(int i =0; i< fTworzDruzyne.getDru퓓ny().size(); i++)
			lista_druzyn.add(fTworzDruzyne.getDru퓓ny().get(i));	
	}
	*/
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlowneMenu frame = new GlowneMenu();
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
	public GlowneMenu() {
		setVisible(true);
		setTitle("Turniej");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 748, 381);
		contentPane.add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("Siatk\u00F3wka", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 743, 353);
		panel.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("S\u0119dziowie", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Dodaj s\u0119dziego");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntTworzSedzia fSedzia = new IntTworzSedzia();
				fSedzia.setVisible(true);
			}
		});
		btnNewButton.setBounds(38, 40, 105, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Usu\u0144 s\u0119dziego");
		btnNewButton_1.setBounds(38, 86, 105, 23);
		panel_3.add(btnNewButton_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(172, 0, 566, 325);
		panel_3.add(scrollPane_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Imie", "Nazwisko"
			}
		));
		scrollPane_2.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Mecze", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(243, 0, 495, 314);
		panel_4.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Spotkanie"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(127);
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_2 = new JButton("Dodaj wynik");
		btnNewButton_2.setBounds(33, 37, 123, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Wygeneruj mecze");
		btnNewButton_3.setBounds(33, 92, 123, 23);
		panel_4.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Tabela wynik\u00F3w", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 738, 314);
		panel_2.add(scrollPane);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Dru\u017Cyna", "Punkty"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(247);
		scrollPane.setViewportView(table_3);
		
		JPanel panel1 = new JPanel();
		tabbedPane_1.addTab("Dwa ognie", null, panel1, null);
		panel1.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(10, 11, 733, 331);
		panel1.add(tabbedPane_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("Tabela wynik\u00F3w", null, panel_5, null);
		panel_5.setLayout(null);
		
		table_2 = new JTable();
		table_2.setBounds(0, 0, 718, 303);
		panel_5.add(table_2);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("S\u0119dziowie", null, panel_6, null);
		panel_6.setLayout(null);
		
		table_4 = new JTable();
		table_4.setBounds(10, 11, 412, 281);
		panel_6.add(table_4);
		
		JButton button = new JButton("New button");
		button.setBounds(553, 49, 89, 23);
		panel_6.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(553, 96, 89, 23);
		panel_6.add(button_1);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("Mecze", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(552, 34, 89, 23);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(552, 83, 89, 23);
		panel_7.add(button_3);
		
		table_5 = new JTable();
		table_5.setBounds(46, 34, 348, 198);
		panel_7.add(table_5);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("Przeci\u0105ganie liny", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(10, 11, 723, 331);
		panel_1.add(tabbedPane_3);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_3.addTab("Tabela wynik\u00F3w", null, panel_8, null);
		panel_8.setLayout(null);
		
		table_6 = new JTable();
		table_6.setBounds(0, 0, 718, 303);
		panel_8.add(table_6);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_3.addTab("S\u0119dziowie", null, panel_9, null);
		panel_9.setLayout(null);
		
		table_7 = new JTable();
		table_7.setBounds(10, 11, 412, 281);
		panel_9.add(table_7);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(553, 49, 89, 23);
		panel_9.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(553, 96, 89, 23);
		panel_9.add(button_5);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_3.addTab("Mecze", null, panel_10, null);
		panel_10.setLayout(null);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(559, 41, 89, 23);
		panel_10.add(button_6);
		
		JButton button_7 = new JButton("New button");
		button_7.setBounds(559, 90, 89, 23);
		panel_10.add(button_7);
		
		table_8 = new JTable();
		table_8.setBounds(53, 41, 348, 198);
		panel_10.add(table_8);
		
		JPanel panel_11 = new JPanel();
		tabbedPane_1.addTab("Dru\u017Cyny", null, panel_11, null);
		panel_11.setLayout(null);
		
		JScrollPane spTabelaDruzyn = new JScrollPane();
		spTabelaDruzyn.setBounds(201, 0, 542, 353);
		panel_11.add(spTabelaDruzyn);
		
		
		spTabelaDruzyn.setViewportView(table_9);
		
		//DefaultTableModel tabelaDruzynModel = new DefaultTableModel();
		//tabelaDruzynModel.addColumn("Nazwa dru퓓ny");
		tTabelaDruzyn = new JTable();
		
		DefaultTableModel tabelaDruzynModel = (DefaultTableModel) tTabelaDruzyn.getModel();
		tabelaDruzynModel.addColumn("Nazwa dru퓓ny");
		/*DefaultTableModel tabelaDruzynModel = (DefaultTableModel) tTabelaDruzyn.getModel();
		tabelaDruzynModel.setColumnIdentifiers(naglowek);
		tTabelaDruzyn.setModel(tabelaDruzynModel);
		tabelaDruzynModel.fireTableDataChanged();
		for(int i = 0; i < lista_druzyn.size(); i++){
			tabelaDruzynModel.addRow(new Object[]{ lista_druzyn.get(i).getNazwa()});
		}
		
		*/
		
		spTabelaDruzyn.setViewportView(tTabelaDruzyn);
		
		JButton btnDodajDruzyne = new JButton("Dodaj dru\u017Cyn\u0119");
		btnDodajDruzyne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fTworzDruzyne = new IntTworzDruzyne();
				fTworzDruzyne.setVisible(true);
				lista_nazw_druzyn.add(fTworzDruzyne.getDru퓓na().getNazwa());
				lista_druzyn.add(fTworzDruzyne.getDru퓓na());
				tabelaDruzynModel.addRow(new Object[]{fTworzDruzyne.getDru퓓na().getNazwa()});
			}
		});
		btnDodajDruzyne.setBounds(46, 44, 117, 23);
		panel_11.add(btnDodajDruzyne);
		
		JButton btnUsunDruzyne = new JButton("Usu\u0144 dru\u017Cyn\u0119");
		btnUsunDruzyne.setBounds(46, 98, 117, 23);
		panel_11.add(btnUsunDruzyne);
		
		}
}
