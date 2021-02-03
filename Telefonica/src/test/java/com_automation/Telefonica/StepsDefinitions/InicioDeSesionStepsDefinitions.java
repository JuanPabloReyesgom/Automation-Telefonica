package com_automation.Telefonica.StepsDefinitions;

public class InicioDeSesionStepsDefinitions {

	
	@Steps
	InicioDeSesionSteps inicioDeSesionSteps;
	
	//ADMINISTRADOR
	@Given("^que estoy en la pagina de inicio de HSEQ$")
	public void que_estoy_en_la_pagina_de_inicio_de_HSEQ() {
	    
	    inicioDeSesionSteps.abrirAplicacionHSEQ();
	    //throw new PendingException();
	}

	@When("^ingreso mis credenciales$")
	public void ingreso_mis_credenciales(List<Usuario> listaUsuario) throws InterruptedException {
		//inicioDeSesionSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
	    //inicioDeSesionSteps.escribirClave(listaUsuario.get(0).getClave());
	    inicioDeSesionSteps.clickEnLogIn(listaUsuario.get(0).getUsuario(), listaUsuario.get(0).getClave());
	   // throw new PendingException();    
	}

	@Then("^valido que el login ha sido exitoso$")
	public void valido_que_el_login_ha_sido_exitoso() throws InterruptedException {
		inicioDeSesionSteps.obtenerTextoDeMensaje();
		//throw new PendingException();
	}
	
	//EVALUADOR
	
	@Given("^me encuentro en la pagina de inicio de HSEQ$")
	public void me_encuentro_en_la_pagina_de_inicio_de_HSEQ() {
	    
	    inicioDeSesionSteps.abrirAplicacionHSEQ();
	    //throw new PendingException();
	}

	@When("^digito mis credenciales$")
	public void digito_mis_credenciales(List<Usuario> listaUsuario) throws InterruptedException {
		//inicioDeSesionSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
	    //inicioDeSesionSteps.escribirClave(listaUsuario.get(0).getClave());
	    inicioDeSesionSteps.clickEnLogIn(listaUsuario.get(0).getUsuario(), listaUsuario.get(0).getClave());
	   // throw new PendingException();
	    
	}
	@Then("^valido exito del login$")
	public void valido_exito_del_login() throws InterruptedException {
		inicioDeSesionSteps.obtenerTextoDeMensaje();
		//throw new PendingException();
	}

}

