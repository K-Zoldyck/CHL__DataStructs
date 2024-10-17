
/**
 * @date 17/10/2024, 14:23
 * @author K-Zoldyck
 */

package com.dinamics;
class Node<E> {
    E      value;
    Node<E> before;
    
    public Node(E value, E before) {
        this.value = value;
        this.before  =  (Node<E>) before;
    }
} 

public class Stack<E> {
    private Node<E>  top = null;
    
    public void push(E value) {
        if ( this.top == null ) {
            this.top = new Node(value, null);
            return;
        }
        Node node = new Node(value,this.top);
        this.top = node;
    }
    
    public void pop() {
        if (this.top != null ) 
            this.top = this.top.before;
    }
    
    public E get() {
        if (this.top != null )
            return this.top.value;
        return null;
    }
}
