/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta es la clase factory
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 */
public class StackFactory {
    /**
     * Este es el factoru para la implementacion
     * @param forma la forma de la implementacion
     * @return un objeto de tipo STack para ser usado
     */
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
        }
        else if(forma.equals("4")){
            System.out.print("USASTE List Circular");
            return new CircularList();
        }
        else if (forma.equals("5")) {
            System.out.println("Usaste DoubleLinked List");
            return new DoublyLinkedList();
        }
        return null;
    }
}
