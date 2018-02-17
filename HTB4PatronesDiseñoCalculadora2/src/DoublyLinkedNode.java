/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 */
public class DoublyLinkedNode<E> {
    protected E data;
protected DoublyLinkedNode<E> nextElement;
protected DoublyLinkedNode<E> previousElement;

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

public DoublyLinkedNode(E v)
// post: constructs a single element
{
    this(v,null,null);
}

    /**
     *
     * @return
     */
    public DoublyLinkedNode<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }


   public E value()
   // post: returns value associated with this element
   {
      return data;
   }
     public void setNext(DoublyLinkedNode next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      data = value;
   }
}
