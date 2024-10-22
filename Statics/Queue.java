
/**
 * @date 22/10/2024, 12:10 @update: 15:06
 * @author K-Zoldyck
 */

package Statics;
public class Queue<E> {
    public int st;    // inicio
    public int fn;    // final
    public int lm;    // quantidade
    public E[] data;

    public Queue(int limit) {
        this.st = 0;  // fila vazia
        this.fn = 0;
        this.lm = limit;
        this.data = (E[]) new Object[limit];
    }

    public void add(E element) {
        if (this.fn < this.lm )
            this.data[this.fn++] = element;
    }

    public E remove() {
        if (this.st < this.fn )
            return this.data[this.st++];
        this.st = 0;
        this.fn = 0;
        return null;
    }

    public void organize() {
        int lp = 0;
        while ( this.st < this.fn ) {
            this.data[lp] = this.data[this.st];
            this.st +=1;
            lp +=1;
        }
        this.fn = lp;
        this.st =  0;
    }
}
