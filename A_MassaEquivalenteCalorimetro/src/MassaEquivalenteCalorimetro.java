import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MassaEquivalenteCalorimetro extends JApplet implements ActionListener {	
	private JPanel jp_Input,jp_Output;	
	private JLabel jl_MassaAF, jl_TempAF, jl_MassaAC, jl_TempAC, jl_TempEq;
	private JTextField jtf_MassaAF, jtf_TempAF,jtf_MassaAC, jtf_TempAC,jtf_TempEq;
	private JButton jb_Calcola;
	private JLabel jl_QAss,jl_QCed,jl_QDiff,jl_Meq;
	private JTextField jtf_QAss,jtf_QCed,jtf_QDiff,jtf_Meq;
	
	public void init() {
		jp_Input = new JPanel();
		jp_Input.setBorder(BorderFactory.createTitledBorder("Input"));
		jp_Input.setLayout(null);		
		
		jp_Output = new JPanel();
		jp_Output.setBorder(BorderFactory.createTitledBorder("Output"));
		jp_Output.setLayout(null);
		
		//Massa Acqua Fredda
		jl_MassaAF = new JLabel("Massa acqua fredda (g)");
		jl_MassaAF.setBounds(10, 20, 150, 20);
		jp_Input.add(jl_MassaAF);
		jtf_MassaAF = new JTextField("169.33");
		jtf_MassaAF.setBounds(10, 40, 120, 20);
		jtf_MassaAF.setBackground(new Color(240,250,240));
		jtf_MassaAF.setHorizontalAlignment(JTextField.RIGHT);
		jp_Input.add(jtf_MassaAF);
		//Temperatura di Acqua Fredda
		jl_TempAF = new JLabel("Temperatura acqua fredda (°C)");
		jl_TempAF.setBounds(10, 60, 200, 20);
		jp_Input.add(jl_TempAF);
		jtf_TempAF = new JTextField("19");
		jtf_TempAF.setBounds(10, 80, 120, 20);
		jtf_TempAF.setBackground(new Color(240,250,240));
		jtf_TempAF.setHorizontalAlignment(JTextField.RIGHT);
		jp_Input.add(jtf_TempAF);
		
		//Massa Acqua Calda
		jl_MassaAC = new JLabel("Massa acqua calda (g)");
		jl_MassaAC.setBounds(10, 100, 150, 20);
		jp_Input.add(jl_MassaAC);
		jtf_MassaAC = new JTextField("144.22");
		jtf_MassaAC.setBounds(10, 120, 120, 20);
		jtf_MassaAC.setBackground(new Color(240,250,240));
		jtf_MassaAC.setHorizontalAlignment(JTextField.RIGHT);
		jp_Input.add(jtf_MassaAC);		
		//Temperatura di Acqua Calda
		jl_TempAC = new JLabel("Temperatura acqua calda (°C)");
		jl_TempAC.setBounds(10, 140, 200, 20);
		jp_Input.add(jl_TempAC);
		jtf_TempAC = new JTextField("60");
		jtf_TempAC.setBounds(10, 160, 120, 20);
		jtf_TempAC.setBackground(new Color(240,250,240));
		jtf_TempAC.setHorizontalAlignment(JTextField.RIGHT);
		jp_Input.add(jtf_TempAC);
		
		//Temperatura di Equilibrio
		jl_TempEq = new JLabel("Temperatura di equilibrio (°C)");
		jl_TempEq.setBounds(10, 180, 200, 20);
		jp_Input.add(jl_TempEq);
		jtf_TempEq = new JTextField("35");
		jtf_TempEq.setBounds(10, 200, 120, 20);
		jtf_TempEq.setBackground(new Color(240,250,240));
		jtf_TempEq.setHorizontalAlignment(JTextField.RIGHT);
		jp_Input.add(jtf_TempEq);
		
		getContentPane().setLayout(new GridLayout(2, 1));
		
		//Bottone Calcola
		jb_Calcola = new JButton("Calcola");
		jb_Calcola.setBounds(10, 20, 150, 20);
		jb_Calcola.addActionListener(this);
		jp_Output.add(jb_Calcola);
		
		//Calore Assorbito
		jl_QAss = new JLabel("Calore Assorbito (J)");
		jl_QAss.setBounds(10, 40, 200, 20);
		jp_Output.add(jl_QAss);
		jtf_QAss = new JTextField("0");
		jtf_QAss.setBounds(10, 60, 120, 20);
		jtf_QAss.setHorizontalAlignment(JTextField.RIGHT);
		jp_Output.add(jtf_QAss);
		
		//Calore Ceduto
		jl_QCed = new JLabel("Calore Ceduto (J)");
		jl_QCed.setBounds(10, 80, 200, 20);
		jp_Output.add(jl_QCed);
		jtf_QCed = new JTextField("0");
		jtf_QCed.setBounds(10, 100, 120, 20);
		jtf_QCed.setHorizontalAlignment(JTextField.RIGHT);
		jp_Output.add(jtf_QCed);		
		
		//Differenza Calore
		jl_QDiff = new JLabel("Differenza Calore (J)");
		jl_QDiff.setBounds(10, 120, 200, 20);
		jp_Output.add(jl_QDiff);
		jtf_QDiff = new JTextField("0");
		jtf_QDiff.setBounds(10, 140, 120, 20);
		jtf_QDiff.setHorizontalAlignment(JTextField.RIGHT);
		jp_Output.add(jtf_QDiff);
		
		//Massa di Acqua Equivalente
		jl_Meq = new JLabel("Massa acqua equivalente (g)");
		jl_Meq.setBounds(10, 160, 200, 20);
		jp_Output.add(jl_Meq);
		jtf_Meq = new JTextField("0");
		jtf_Meq.setBounds(10, 180, 120, 20);
		jtf_Meq.setHorizontalAlignment(JTextField.RIGHT);
		jp_Output.add(jtf_Meq);
		
		getContentPane().add(jp_Input);
		getContentPane().add(jp_Output);
	}//Fine - init
	
	public void actionPerformed(ActionEvent e) {	
		double MassaAF=0.0;
		double TempAF=0.0;		
		double MassaAC=0.0;
		double TempAC=0.0;		
		double TempEq=0.0;
		double QAss=0.0;
		double QCed=0.0;
		double QDiff=0.0;
		double Meq=0.0;
		final double c=4186.0;
		
		MassaAF=Double.parseDouble(jtf_MassaAF.getText())/1000.0;
		TempAF=Double.parseDouble(jtf_TempAF.getText());
		MassaAC=Double.parseDouble(jtf_MassaAC.getText())/1000.0;
		TempAC=Double.parseDouble(jtf_TempAC.getText());		
		TempEq=Double.parseDouble(jtf_TempEq.getText());
		
		QCed=MassaAC*c*(TempAC-TempEq);
		QAss=MassaAF*c*(TempEq-TempAF);
		QDiff=QCed-QAss;
		Meq=1000.0*QDiff/(c*(TempEq-TempAF));
		
		QCed=((int)((QCed*10)+0.5))/10.0;		
		QAss=((int)((QAss*10)+0.5))/10.0;
		QDiff=((int)((QDiff*10)+0.5))/10.0;
		Meq=((int)((Meq*100)+0.5))/100.0;
		
		jtf_QCed.setText(String.valueOf(QCed));
		jtf_QAss.setText(String.valueOf(QAss));
		jtf_QDiff.setText(String.valueOf(QDiff));
		jtf_Meq.setText(String.valueOf(Meq));
	}//Fine - actionPerformed
	
}//Fine - MassaEquivalenteCalorimetro
