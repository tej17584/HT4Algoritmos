/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta es la clase factory
 * @author Jose Tejada
 * @author Andres urizar
 */
public class StackFactory {
    public Stack getImplementacion(String forma){
        if ("1".equals(forma)) {
            System.out.println("USASTE ARRAYLIST");
            return new StackArrayList();
            
        }
        else if (forma.equals("2")) {
            System.out.println("USASTE Vector");
            return new StackVector();
        }
        else if (forma.equals("3")) {
            System.out.println("USASTE List single");
            return new SinglyLinkedList();
        }else if(forma.equals("4")){
            System.out.print("USASTE List Circular");
            return new CircularList();
        }
        return null;
    }
}
