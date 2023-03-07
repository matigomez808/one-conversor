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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox<String> miCombo;
	private JButton btnConvertir, btnExit;
	private JLabel lblValorConvertir, lblElegirConversion;
	private Conversiones misConversiones;
	private JTextField textRes;

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
		contentPane.setLayout(null);

		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(164, 125, 99, 25);
		btnConvertir.addActionListener(this);
		
		btnExit = new JButton("Cerrar");
		btnExit.setBounds(157, 185, 117, 25);
		btnExit.addActionListener(this);

		lblElegirConversion = new JLabel("Elija tipo de conversion");
		lblElegirConversion.setBounds(143, 12, 164, 15);
		contentPane.add(lblElegirConversion);

		miCombo = new JComboBox<>();
		miCombo.setBounds(164, 39, 110, 24);
		contentPane.add(miCombo);
		miCombo.setModel(new DefaultComboBoxModel<String>(new String[] { "ARS -> USD", "USD -> ARS", "ARS -> EUR", "EUR -> ARS",
				"ARS -> GBP", "GBP -> ARS", "ARS -> JPY", "JPY -> ARS", "ARS -> KPW", "KPW -> ARS" }));
		

		miCombo.addActionListener(this);

		lblValorConvertir = new JLabel("Valor a convertir");
		lblValorConvertir.setBounds(157, 68, 117, 15);
		contentPane.add(lblValorConvertir);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(160, 94, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		getContentPane().add(btnConvertir);

		textRes = new JTextField();
		textRes.setHorizontalAlignment(SwingConstants.CENTER);
		textRes.setForeground(new Color(0, 0, 0));
		textRes.setEditable(false);
		textRes.setBounds(164, 172, 117, 19);
		contentPane.add(textRes);
		textRes.setColumns(10);
		
		
		contentPane.add(btnExit);

	}

//	Implementación del método abstracto requerido por la interfaz ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnExit == e.getSource()) {System.exit(0);}
		
		miCombo.hidePopup();
		
		double input = Double.parseDouble(textField.getText());
		double r;
		DecimalFormat df = new DecimalFormat("#.##");
		if (btnConvertir == e.getSource()) {
			if (miCombo.getSelectedItem().equals("ARS -> USD")) {
				r = input / 199.65;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("USD -> ARS")) {
				r = input * 199.65;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("ARS -> EUR")) {
				r = input / 212.81;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("EUR -> ARS")) {
				r = input * 212.81;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("ARS -> GBP")) {
				r = input / 239.20;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("GBP -> ARS")) {
				r = input * 239.20;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("ARS -> JPY")) {
				r = input / 1.46;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("JPY -> ARS")) {
				r = input * 1.46;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("ARS -> KRW")) {
				r = input / 0.15;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
			if (miCombo.getSelectedItem().equals("KRW -> ARS")) {
				r = input * 0.15;

				r = Double.valueOf(df.format(r));
				textRes.setText(String.valueOf(r));
			}
		}

	}

	
}
