package com.automation.Telefonica.Steps;

import com.hseqautomation.pageobjects.InicioDeSesionPageObject;
import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {

	InicioDeSesionPageObject inicioDeSesionPOM=new InicioDeSesionPageObject();
	
	@Step
	public void abrirAplicacionHSEQ() {
		inicioDeSesionPOM.open();
	}
	@Step
	public void clickEnLogIn(String usuario, String clave) throws InterruptedException {
		inicioDeSesionPOM.enviarcredenciales(usuario,clave);
	}
	
	@Step
	public void obtenerTextoDeMensaje() throws InterruptedException {
		inicioDeSesionPOM.obtenerTextoDeAlerta();
	}
	
}