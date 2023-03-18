package gui;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.FlowLayout;


public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel ventanaConversor;
	
	private JLabel lblDe;
	private JComboBox<String> comboMonedaPrimaria;
	private JLabel lblA;
	private JComboBox<String> comboMonedaSecundaria;
	private JLabel lblValorConvertir;
	private JTextField valor;
	private JButton btnConvertir;
	private JTextField resultado;
	private JButton btnCerrar;

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		ventanaConversor = new JPanel();
		

		setContentPane(ventanaConversor);
		setTitle("Conversor");
		setResizable(false);
//		Inicializar componentes		
		
		
		lblDe = new JLabel("De: ");
		comboMonedaPrimaria = new JComboBox<>();
		lblDe.setLabelFor(comboMonedaPrimaria);
		comboMonedaPrimaria.setModel(new DefaultComboBoxModel<String>(new String[] { "ARS", "USD", "EUR", "GBP", "JPY", "KPW" }));
		lblA = new JLabel("A: ");
		comboMonedaSecundaria = new JComboBox<>();
		lblA.setLabelFor(comboMonedaSecundaria);
		comboMonedaSecundaria.setModel(new DefaultComboBoxModel<String>(new String[] { "ARS", "USD", "EUR", "GBP", "JPY", "KPW" }));
		lblValorConvertir = new JLabel("Valor a convertir");
		valor = new JTextField(15);
		btnConvertir = new JButton("Convertir");
		resultado = new JTextField(15);
		btnCerrar = new JButton("Cerrar");
		ventanaConversor.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		
		
//		Agregar componentes a la ventana		
		
		
		getContentPane().add(lblDe);
		getContentPane().add(comboMonedaPrimaria);
		getContentPane().add(lblA);
		getContentPane().add(comboMonedaSecundaria);
		getContentPane().add(lblValorConvertir);
		getContentPane().add(valor);
		getContentPane().add(btnConvertir);
		getContentPane().add(resultado);
		getContentPane().add(btnCerrar);
		
	}

//	Getters & Setters necesarios para manipular data	
	
	public int getValor() {
		return Integer.parseInt(valor.getText());
	}
	
	public int getResultado() {
		return Integer.parseInt(resultado.getText());
	}
	
	public void setResultado(Float result) {
		resultado.setText(Float.toString(result));
	}
	
	public String getMonedaPrimaria() {
		return comboMonedaPrimaria.getSelectedItem().toString();
	}
	
	public String getMonedaSecundaria() {
		return comboMonedaSecundaria.getSelectedItem().toString();
	}
	
	public void btnConvertirListener (ActionListener listenBtnConvertir) {
		btnConvertir.addActionListener(listenBtnConvertir);
	}
	
	public void btnCerrarListener (ActionListener listenBtnCerrar) {
		btnCerrar.addActionListener(listenBtnCerrar);
	}
	
	public void mostrarMensajeError (String mensajeError) {
		JOptionPane.showMessageDialog(this, mensajeError);
	}

}
