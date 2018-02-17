
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Tejada
 * @author Andres Urizar
 * @version 1.0
 * @param <E> un genérico
 */
public class StackVector<E> implements Stack<E>{
    protected Vector<E> data;
    /**
     * 
     */
    public StackVector() {
       data= new Vector<>();
    }
    
    /**
     *push para un valor del stacj
     * @param item un genérico E
     */
    @Override
    public void push(E item) {
       data.addElement(item);
    }
    /**
     * pop a un valor del stack
     * @return un genérico E
     */
    @Override
    public E pop() {
      return data.remove(size()-1);
    }
    /**
     * peek al stack
     * @return un genérico E
     */
    @Override
    public E peek() {
        return data.get(size()-1);
    }
    /**
     * ver si el vector está vacío
     * @return un genérico E
     */
    @Override
    public boolean empty() {
        return size()==0;
    }
   /**
    * consultar el tamaño del array
    * @return un int con el tamaño
    */
    @Override
    public int size() {
       return data.size();
    }
    
}
