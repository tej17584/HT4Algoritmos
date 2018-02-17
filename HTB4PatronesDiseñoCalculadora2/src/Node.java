/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase nodo para formar listas
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 */
class Node<E> {
     protected E data; // value stored in this element
   protected Node<E> nextElement; // ref to next
   /**
    * Constructor de nodo
    * @param v un genérico
    * @param next un objeto tipo Nodo
    */
   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }
   /**
    * Constructor de a clase node
    * @param v un genérico
    */
   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }
   /**
    * Método para el siguiente nodo
    * @return un nodo
    */
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   /**
    * Un setNext para el nodo
    * @param next un nodo genérico
    */
   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }
   /**
    * Un método value
    * @return un genérico
    */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }
   /**
    * set value para colocar un valor
    * @param value un setValue
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}
