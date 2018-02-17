/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose Tejada
 * @author Andres Urizar
 */
public class DoublyLinkedList<E> extends AbstractList<E>{
    protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}

/**
 * Método adFisrst para agregar al incio de una lista
 * @param value un genérico
 */
@Override
public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}

/**
 * Un mpetodo para agregar al final de una lsita, al tail
 * @param value un genérico
 */
@Override
public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}

/**
 * Este método retira el ultimo elemento
 * @return un genérico E
 */
public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
   DoublyLinkedNode<E> temp = tail;
   tail = tail.previousElement;
   if (tail == null) {
       head = null;
   } else {
       tail.setNext(null);
   }
   count--;
   return temp.value();
}
    //Método heredados que no se usan
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * un getFirst para obtener el primer elemento
     * @return un E
     */
    @Override
    public E getFirst() {
       return head.value();
    }

   
    /**
     * Este método es el push
     * @param item  un genérico
     */
    @Override
    public void push(E item) {
        addFirst(item);
    }

    /**
     *Saca el primer elemento y lo borra
     * @return un E
     */
    @Override
    public E pop() {
        return removeLast();
    }

    /**
     *toma el primer elemento 
     * @return un E
     */
    @Override
    public E peek() {
       return getFirst();
    }
    /**
     * Toma el primero
     * @return un E
     */
    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Método contains
     * @param value un vlaor E
     * @return un booleano
     */
    @Override
    public boolean contains(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
