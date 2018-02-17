/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase doublyLinkedNode
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 */
public class DoublyLinkedNode<E> {
    protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;
/**
 * Consttructor de la clase
 * @param v un objeto E
 * @param next un objeto tipo DoubleLinedNode para el anterior
 * @param previous un objeto tipo DoubleLinkedNode para el siguiente
 */
public DoublyLinkedNode(E v,
                        DoublyLinkedNode<E> next,
                        DoublyLinkedNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}
/**
 * Este es el constructor sobrecargado
 * @param v un genérico E
 */
public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

    /**
     *este retorna un objeto tipo DoubleLinkedNode genérico
     * @return un objeto DoublyLinkedNode
     */
    public DoublyLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }

    /**
     * Observa el valor
     * @return un objeto E
     */
   public E value()
   // post: returns value associated with this element
   {
      return data;
   }
   /**
    * Set al next elemento
    * @param next un objeto tipo DoublylinkedNode
    */
     public void setNext(DoublyLinkedNode next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }
   /**
    * set del value
    * @param value un objeto tipo  E
    */
   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}
