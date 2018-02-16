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
public abstract class AbstractList<E> implements List<E>{
   public AbstractList()
   // post: does nothing
   {
   }
    /**
     *
     * @return
     */
    @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
   
   @Override
   public boolean empty(){
       return size()==0;
   }
   
  
  
 
}
