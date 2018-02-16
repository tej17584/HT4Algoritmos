
import java.util.Iterator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 * @param <E>
 */
public class SinglyLinkedList<E> extends AbstractList<E>{

     protected int count; // list size
     protected Node<E> head; // ref. to first element

   public SinglyLinkedList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
     @Override
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
     @Override
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<E>(value, head);
     count++;
  }
  
     @Override
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  
     @Override
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
     @Override
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
     @Override
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Node<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   }
   
   //Métodos de la clase Stack 
/**
 * 
 * @param item 
 */
    @Override
    public void push(E item) {
        addFirst(item);
    }

    @Override
    public E pop() {
       return removeFirst();
    }

    @Override
    public E peek() {
       return getFirst();
    }

  

}
