/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alber
 */
public class CircularList<E> extends AbstractList<E>{

    protected Node<E> tail; 
    protected int count;
    
    /**
     * Constructor de la clase
     */
    public CircularList()
    {
        tail = null;
        count = 0;
    }
    

    @Override
    public void addFirst(E value) {
       Node<E> temp = new Node<E>(value);
       if(tail == null){
           tail = temp;
           tail.setNext(tail);
       }else{
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }

    @Override
    public void addLast(E value) {
       addFirst(value);
       tail = tail.next();
    }

    @Override
    public E removeFirst() {
        Node<E> finger = tail;
        while(finger.next() != tail){
            finger = finger.next();
        }
        Node<E> temp = tail;
        if(finger == tail){
            tail = null;
        }else{
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    @Override
    public boolean contains(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(E item) {
       addFirst(item);
    }

    @Override
    public E pop() {
        return  removeFirst();
    }

    @Override
    public E peek() {
        return getFirst();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
