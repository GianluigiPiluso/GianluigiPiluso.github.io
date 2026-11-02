import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class SpendereCalorie extends JApplet implements ActionListener {
	
	private JPanel jp_Pannello,jp_OutputPannello;
	private ButtonGroup gb_scelta;
	private JRadioButton jrb_KCal, jrb_KJoule, jrb_Joule;
	private JTextField jtf_input, jtf_altezzaScalino, jtf_massa;
	private JTextField jtf_altezza, jtf_numeroScalini;
	private JButton jb_Calcola;
	private JLabel jl_altezzaScalino, jl_massa, jl_Altezza, jl_numeroScalini;
	
	private final double g=9.81;
	
	public void init() {	
		jp_Pannello = new JPanel();
		jp_Pannello.setBorder(BorderFactory.createTitledBorder("Input"));
		jp_Pannello.setLayout(null);
		
		jp_OutputPannello = new JPanel();
		jp_OutputPannello.setBorder(BorderFactory.createTitledBorder("Output"));
		jp_OutputPannello.setLayout(null);
		
		gb_scelta = new ButtonGroup();
		jrb_KCal = new JRadioButton("KCal");
		jrb_KJoule = new JRadioButton("KJoule");
		jrb_Joule = new JRadioButton("Joule");
		jtf_input = new JTextField();		
		jtf_altezzaScalino = new JTextField();
		jtf_massa = new JTextField();
		jtf_altezza = new JTextField();
		jtf_numeroScalini = new JTextField();				
		jb_Calcola = new JButton("Calcola");
		
		jl_altezzaScalino = new JLabel("Altezza scalino [cm]");
		jl_massa = new JLabel("Massa [kg]");
		jl_Altezza = new JLabel("Altezza da scalare [m]");
		jl_numeroScalini = new JLabel("Numero di scalini da salire");
		
		getContentPane().setLayout(new GridLayout(2, 1));

		jrb_KCal.setSelected(true);
		jrb_KCal.setBounds(10, 20, 60, 20);
		gb_scelta.add(jrb_KCal);
		jp_Pannello.add(jrb_KCal);

		jrb_KJoule.setSelected(false);
		jrb_KJoule.setBounds(80, 20, 80, 20);
		gb_scelta.add(jrb_KJoule);
		jp_Pannello.add(jrb_KJoule);
		
		jrb_Joule.setSelected(false);
		jrb_Joule.setBounds(160, 20, 60, 20);
		gb_scelta.add(jrb_Joule);
		jp_Pannello.add(jrb_Joule);		
		
		jtf_input.setBounds(10, 50, 100, 20);
		jtf_input.setText("400");
		jtf_input.setBackground(new Color(240,250,240));
		jtf_input.setHorizontalAlignment(JTextField.RIGHT);
		jp_Pannello.add(jtf_input);

		jl_altezzaScalino.setBounds(10, 70, 200, 20);
		jp_Pannello.add(jl_altezzaScalino);		
		jtf_altezzaScalino.setBounds(10, 90, 100, 20);
		jtf_altezzaScalino.setText("15");
		jtf_altezzaScalino.setBackground(new Color(240,250,240));
		jtf_altezzaScalino.setHorizontalAlignment(JTextField.RIGHT);
		jp_Pannello.add(jtf_altezzaScalino);		

		jl_massa.setBounds(10, 110, 200, 20);
		jp_Pannello.add(jl_massa);				
		jtf_massa.setBounds(10, 130, 100, 20);
		jtf_massa.setText("60");
		jtf_massa.setBackground(new Color(240,250,240));
		jtf_massa.setHorizontalAlignment(JTextField.RIGHT);
		jp_Pannello.add(jtf_massa);
		
		getContentPane().add(jp_Pannello);
				
		jb_Calcola.setBounds(10, 20, 200, 20);
		jb_Calcola.addActionListener(this);
		jp_OutputPannello.add(jb_Calcola);
				
		jl_Altezza.setBounds(10, 50, 200, 20);
		jp_OutputPannello.add(jl_Altezza);				
		jtf_altezza.setBounds(10, 70, 100, 20);
		jtf_altezza.setText("0");
		jtf_altezza.setHorizontalAlignment(JTextField.RIGHT);
		jp_OutputPannello.add(jtf_altezza);
		
		jl_numeroScalini.setBounds(10, 90, 200, 20);
		jp_OutputPannello.add(jl_numeroScalini);				
		jtf_numeroScalini.setBounds(10, 110, 100, 20);
		jtf_numeroScalini.setText("0");
		jtf_numeroScalini.setHorizontalAlignment(JTextField.RIGHT);
		jp_OutputPannello.add(jtf_numeroScalini);
		
		getContentPane().add(jp_OutputPannello);
	}//Fine - init
	
	public void actionPerformed(ActionEvent e) {
		double energia=0.0;
		double peso=0.0;
		double spostamento=0.0;
		double numeroScalini=0.0;
		
		if(jrb_KCal.isSelected()) energia=Double.parseDouble(jtf_input.getText())*4180.0;
		if(jrb_KJoule.isSelected()) energia=Double.parseDouble(jtf_input.getText())*1000.0;
		if(jrb_Joule.isSelected()) energia=Double.parseDouble(jtf_input.getText());
		peso=g*Double.parseDouble(jtf_massa.getText());
		spostamento=energia/peso;
		numeroScalini=spostamento/(Double.parseDouble(jtf_altezzaScalino.getText())/100.0);
		
		spostamento=((int)((spostamento*1)+0.5))/1.0;
		numeroScalini=((int)((numeroScalini*1)+0.5))/1.0;

		jtf_altezza.setText(String.valueOf((int)spostamento));
		jtf_numeroScalini.setText(String.valueOf((int)numeroScalini));		
	}//Fine - actionPerformed
}//Fine - SpendereCalorie
