package Principal;

import gui.View;
import modelo.*;
import controlador.*;


public class Principal {

	public static void main(String[] args) {
		
		View v = new View();
		Modelo m = new Modelo();
		Controlador c = new Controlador(m ,v );
		v.setVisible(true);
		
	}
	
}
