package Principal;
import gui.ventanaPrincipal;

public class Aplicacion {
	
	Conversiones misConversiones;
	
	public Aplicacion() {
		misConversiones = new Conversiones();
		presentarVentana();
	}
	
	
	private void presentarVentana(){
		ventanaPrincipal miVentana = new ventanaPrincipal();
//		miVentana.asignarConversiones(misConversiones);
		miVentana.setVisible(true);
	}
	
}
