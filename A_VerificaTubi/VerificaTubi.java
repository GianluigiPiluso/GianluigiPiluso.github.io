import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VerificaTubi extends JApplet implements ActionListener {
	
	private JPanel jPanel1;
	private JLabel jLabel1;
	private JLabel jL_RaggioInterno;
	private JLabel jL_Spessore;
	private JLabel jL_Pressione;
	private JTextField jT_RaggioInterno;
	private JTextField jT_Spessore;
	private JTextField jT_Pressione;
	private JButton jB_Calcola;
	private JLabel jL_SigmaCirconferenziale;
	private JLabel jL_SigmaLongitudinale;
	private JTextField jT_SigmaCirconferenziale;
	private JTextField jT_SigmaLongitudinale;
	private JLabel jL_Nota;
	
	public void init() {
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jL_RaggioInterno = new JLabel();
		jL_Spessore = new JLabel();
		jL_Pressione = new JLabel();
		jT_RaggioInterno = new JTextField();
		jT_Spessore = new JTextField();
		jT_Pressione = new JTextField();
		jB_Calcola = new JButton();
		jL_SigmaCirconferenziale = new JLabel();
		jL_SigmaLongitudinale = new JLabel();
		jT_SigmaCirconferenziale = new JTextField();
		jT_SigmaLongitudinale = new JTextField();		
		jL_Nota = new JLabel();
		
		jPanel1.setLayout(null);
		//jPanel1.setSize(100, 100);
		
		jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
		//jLabel1.setText("Prova");
		jLabel1.setBounds(0, 0, 600, 180);
		jLabel1.setIcon(new ImageIcon(getClass().getResource("Tubo3.jpg")));
		jPanel1.add(jLabel1);
		
		jL_RaggioInterno.setFont(new java.awt.Font("Arial", 0, 12));
		jL_RaggioInterno.setText("Raggio Interno (cm)");
		jL_RaggioInterno.setBounds(10, 180, 200, 20);
		jPanel1.add(jL_RaggioInterno);	
		
		jL_Spessore.setFont(new java.awt.Font("Arial", 0, 12));
		jL_Spessore.setText("Spessore (cm)");
		jL_Spessore.setBounds(210, 180, 200, 20);
		jPanel1.add(jL_Spessore);

		jL_Pressione.setFont(new java.awt.Font("Arial", 0, 12));
		jL_Pressione.setText("Pressione (kg/cmq)");
		jL_Pressione.setBounds(410, 180, 200, 20);
		jPanel1.add(jL_Pressione);	
		
		jT_RaggioInterno.setFont(new java.awt.Font("Arial", 0, 12));
		jT_RaggioInterno.setHorizontalAlignment(JTextField.RIGHT);
		jT_RaggioInterno.setText("30");
		jT_RaggioInterno.setBounds(10, 200, 100, 20);
		jPanel1.add(jT_RaggioInterno);		
		
		jT_Spessore.setFont(new java.awt.Font("Arial", 0, 12));
		jT_Spessore.setHorizontalAlignment(JTextField.RIGHT);
		jT_Spessore.setText("1.47");
		jT_Spessore.setBounds(210, 200, 100, 20);
		jPanel1.add(jT_Spessore);
		
		jT_Pressione.setFont(new java.awt.Font("Arial", 0, 12));
		jT_Pressione.setHorizontalAlignment(JTextField.RIGHT);
		jT_Pressione.setText("35");
		jT_Pressione.setBounds(410, 200, 100, 20);
		jPanel1.add(jT_Pressione);		
		
		jB_Calcola.setFont(new java.awt.Font("Arial", 0, 12));
		jB_Calcola.setText("Calcola");
		jB_Calcola.addActionListener(this);
		jB_Calcola.setBounds(10, 230, 100, 20);
		jPanel1.add(jB_Calcola);
		
		jL_SigmaCirconferenziale.setFont(new java.awt.Font("Arial", 0, 12));
		jL_SigmaCirconferenziale.setText("SigmaC (kg/cmq)");
		jL_SigmaCirconferenziale.setBounds(10, 260, 100, 20);
		jPanel1.add(jL_SigmaCirconferenziale);		
		
		jL_SigmaLongitudinale.setFont(new java.awt.Font("Arial", 0, 12));
		jL_SigmaLongitudinale.setText("SigmaL (kg/cmq)");
		jL_SigmaLongitudinale.setBounds(210, 260, 100, 20);
		jPanel1.add(jL_SigmaLongitudinale);		

		jT_SigmaCirconferenziale.setFont(new java.awt.Font("Arial", 0, 12));
		jT_SigmaCirconferenziale.setHorizontalAlignment(JTextField.RIGHT);
		jT_SigmaCirconferenziale.setEditable(false);
		jT_SigmaCirconferenziale.setText("");
		jT_SigmaCirconferenziale.setBounds(10, 280, 100, 20);
		jPanel1.add(jT_SigmaCirconferenziale);	
		
		jT_SigmaLongitudinale.setFont(new java.awt.Font("Arial", 0, 12));
		jT_SigmaLongitudinale.setHorizontalAlignment(JTextField.RIGHT);
		jT_SigmaLongitudinale.setEditable(false);
		jT_SigmaLongitudinale.setText("");
		jT_SigmaLongitudinale.setBounds(210, 280, 100, 20);
		jPanel1.add(jT_SigmaLongitudinale);
		
		jL_Nota.setFont(new java.awt.Font("Arial", 0, 12));
		jL_Nota.setText("NOTA: Nel caso di recipiente in pressione sferico la SigmaC assume il valore della SigmaL");
		jL_Nota.setBounds(10, 310, 500, 20);
		jPanel1.add(jL_Nota);
		
		getContentPane().add(jPanel1);
		//jPanel1.setVisible(true);
	}//Fine - init
	
	public void actionPerformed(ActionEvent e) {
		
		jT_SigmaCirconferenziale.setText("OK");
		
		double RaggioInterno=Double.parseDouble(jT_RaggioInterno.getText());
		double Spessore=Double.parseDouble(jT_Spessore.getText());
		double Pressione=Double.parseDouble(jT_Pressione.getText());
		
		double SigmaC=Pressione*RaggioInterno/Spessore;
		double SigmaL=SigmaC/2.0;
		
		//System.out.println(RaggioInterno);
		
		SigmaC=((int)((SigmaC*100)+0.5))/100.0;
		SigmaL=((int)((SigmaL*100)+0.5))/100.0;

		jT_SigmaCirconferenziale.setText(String.valueOf(SigmaC));
		jT_SigmaLongitudinale.setText(String.valueOf(SigmaL));		
	}//Fine - actionPerformed
	
	public void stop() {
		
	}//Fine - stop
}
