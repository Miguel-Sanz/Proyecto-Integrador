package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaBaja;
import mvc.vista.VistaMenuPrincipal;

public class ListenerMenuPrincipalDarBaja implements ActionListener {

	public VistaMenuPrincipal v;
	
	public ListenerMenuPrincipalDarBaja(VistaMenuPrincipal vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaBaja ventana = new VistaBaja();
		ventana.hacerVisible();

	}

}
