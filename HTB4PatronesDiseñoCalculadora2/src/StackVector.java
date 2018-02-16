
import java.util.Vector;

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
public class StackVector<E> implements Stack<E>{
    protected Vector<E> data;
    /**
     * 
     */
    public StackVector() {
       data= new Vector<>();
    }
    
    /**
     * 
     * @param item 
     */
    @Override
    public void push(E item) {
       data.addElement(item);
    }
    /**
     * 
     * @return 
     */
    @Override
    public E pop() {
      return data.remove(size()-1);
    }
    /**
     * 
     * @return 
     */
    @Override
    public E peek() {
        return data.get(size()-1);
    }
    /**
     * 
     * @return 
     */
    @Override
    public boolean empty() {
        return size()==0;
    }
    /**
     * 
     */
    @Override
    public int size() {
       return data.size();
    }
    
}
