
/**
 * @date 16/10/2024, 18:48
 * @author K-Zoldyck
 */

package com.statics;
public class Queue<E> {
    public int st;    // inicio
    public int fn;    // final
    public int ln;    // quantidade
    public E[] data;

    public Queue(int limit) {
        this.st = -1;  // fila vazia
        this.fn = -1;
        this.lm = limit-1;
        this.data = (E[]) new Object[limit];
    }

    public void add(E element) {
        if (this.fn < this.lm ) {
            this.data[++this.fn] = element;
        } 
        else if (this.st >= 0 ){
            this.organize()
            this.add(data);
        }
    }

    public E remove() {
        if ( this.fn > 0 && this.fn < this.ln)
            return this.data[++this.st];
        
        if (this.fn == this.st ) {
            this.st = -1;
            this.fn = -1;
            return null;
        }
    }

    public void organize() {
        int lp = 0;
        while ( this.st <= this.fn ) {
            this.data[lp] = this.data[this.st];
            this.st +=1;
            lp +=1;
        }
        this.fn = this.st-1;
        this.st = 0;
    }
}
