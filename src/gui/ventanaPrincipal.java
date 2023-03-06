package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import Principal.Conversiones;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<Conversiones> miCombo;
	private JButton btnConvertir;
	private JLabel lblValorConvertir, lblElegirConversion;
	Conversiones misConversiones;
	
	
//	Create the frame.
	 
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Sprint Conversor by Mati Gomez");
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblElegirConversion = new JLabel("Elija tipo de conversion");
		
		miCombo = new JComboBox<>();
		
		
		miCombo.addActionListener(this);		
		lblValorConvertir = new JLabel("Valor a convertir");
		
		textField = new JTextField();
		textField.setColumns(10);
	
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(this);
		
		getContentPane().add(lblElegirConversion);
		getContentPane().add(miCombo);
		getContentPane().add(lblValorConvertir);
		getContentPane().add(textField);
		getContentPane().add(btnConvertir);
		
		
		
		
	}

//	Implementación del método abstracto requerido por la interfaz ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (btnConvertir == e.getSource()) {
			String conversion = miCombo.getSelectedItem().toString();
			JOptionPane.showMessageDialog(null, "Apretaste el botón. Son groso, sabelo. " + "\n" + "Elegiste la opción: " + conversion);
		}
		
	}

	public void asignarConversiones(Conversiones misConversiones) {
		this.misConversiones = misConversiones;
		
	}
}
