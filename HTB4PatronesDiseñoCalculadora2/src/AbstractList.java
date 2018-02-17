/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 * @param <E> es un genéric
 */
public abstract class AbstractList<E> implements List<E>{
    /**
     * Este es el constructor
     */
   public AbstractList()
   // post: does nothing
   {
   }
    /**
     *Retorna true si la lista no tiene elementos
     * @return un booelano
     */
    @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
   
   /**
    * Retorna true si la lista no está vacía
    * @return un booelano
    */
   @Override
   public boolean empty(){
       return size()==0;
   }
   
  
  
 
}
