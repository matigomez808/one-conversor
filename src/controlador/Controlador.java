package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import gui.View;
import modelo.Modelo;

public class Controlador {

	private Modelo m;
	private View v;

	public Controlador(Modelo m, View v) {
		this.m = m;
		this.v = v;

		this.v.btnConvertirListener(new ConvertirListener());
		this.v.btnCerrarListener(new CerrarListener());
	}

	class ConvertirListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int monto;
			String monedaPrimaria, monedaSecundaria;
			Float result = null;
			
			try {
			monto = v.getValor();
			
			
			monedaPrimaria = v.getMonedaPrimaria();
			monedaSecundaria = v.getMonedaSecundaria();

			m.setMonedaPrimaria(monedaPrimaria);
			m.setMonedaSecundaria(monedaSecundaria);
			m.setMontoConvertir(monto);

			try {
				m.convertir();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (InterruptedException e1) {

				e1.printStackTrace();
			}

			v.setResultado(m.getResultadoConversion());
			}
			catch(NumberFormatException ex) {
				v.mostrarMensajeError("Error. Ingrese un número entero.");
			}
		}

		

		}

	}

class CerrarListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);

	}

}