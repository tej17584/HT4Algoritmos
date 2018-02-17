
import java.util.Iterator;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Interfas List
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 * @param <E> un genérico
 */
public interface List<E> extends Stack<E>{
    @Override
    public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list
   
   public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value

  

 
    
}
