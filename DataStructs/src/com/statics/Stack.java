
/**
 * @date 16/10/2024, 18:48
 * @author K-Zoldyck
 */

package com.statics;
public class Stack<E> {
    private E[] data;  // cria um array do tipo E , E é um tipo gênerico.. 
    private int l;     // capacidade máxima da pilha
    private int t;     // Índice Para "Saber" quem está no topo
    
    public Stack(int limit) {
        this.l = limit;
        this.t = -1;
        this.data = (E[]) new Object[this.l]; //Cast, Java não permite Array de tipos genéricos.
    }
    
    public void push(E element) {
        if ( this.t < this.l-1 )
            this.data[++this.t] = element; //adiciona um elemento no top, e encrementa o top
    }
    
    public void pop() {
        if ( this.t > -1 )
            this.data[this.t--] = null;  //remove um elemento do top, e dencrementa o top
    }
    
    public int len() {
        return this.t+1;
    }
    
    public E get() {
        if ( this.t > -1 )
            return this.data[this.t];
        return null;
    }
    
    public E get(int indice) {
        if (indice >= 0 && indice < this.t )
            return this.data[indice];
        return null;
    }
}
        