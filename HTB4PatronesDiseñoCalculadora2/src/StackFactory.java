/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta es la clase factory
 * @author Jose Tejada
 * @author Andrez urizar
 */
public class StackFactory {
    public Stack getImplementacion(String forma){
        if ("1".equals(forma)) {
            return new StackArrayList();
        }
        return null;
    }
}
