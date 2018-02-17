/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta es la interfaz de calculadora
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 */
public interface Calculadora {
    
    /**
     * Metodo operar que se le dará cuerpo luego
     * @param expresion es la expresion a operar
     * @return Resultado de la operacion dependiendo si es suma, resta, multiplicacion o division
     */
    double operar(String expresion);
}
