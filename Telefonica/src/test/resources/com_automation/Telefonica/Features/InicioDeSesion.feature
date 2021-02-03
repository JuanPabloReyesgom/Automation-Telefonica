Feature: Inicio de Sesion en HSEQ

  Scenario Outline: Inicio de sesion en HSEQ
    Given que estoy en la pagina de inicio de HSEQ
    When ingreso mis credenciales 
      |usuario|clave|
      |<Usuario>|<Clave>|
    Then valido que el login ha sido exitoso

    Examples: 
      |Usuario|Clave|
      |jpreyesg|reyes-1|
      
  Scenario Outline: Inicio de sesion con rol evaluador en HSEQ
    Given me encuentro en la pagina de inicio de HSEQ
    When digito mis credenciales 
      |usuario|clave|
      |<Usuario>|<Clave>|
    Then valido exito del login

    Examples: 
      |Usuario|Clave|
      |cedussan|1225092055|