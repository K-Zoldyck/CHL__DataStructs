
/**
 * @date 17/10/2024, 14:25
 * @author K-Zoldyck
 */

import com.dinamics.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DinamicStackTest {
    @Test
    public void simpleAdd() {
        Stack<Integer> s1 = new Stack();
        s1.push(10);
        s1.push(10);
        s1.push(12);
        Assert.assertEquals((int) s1.get(), 12); 
    }
    
    @Test
    public void simpleRemove() {
        Stack<Integer> s1 = new Stack();
        s1.push(10);
        s1.push(13);
        s1.push(12);
        s1.pop();
        Assert.assertEquals((int) s1.get(), 13); 
    }
    
    @Test
    public void removeVoid() {
        Stack<Integer> s1 = new Stack();
        s1.pop();
        Assert.assertEquals(s1.get(), null); 
    }
    
    @Test
    public void removeBrutForce() {
        Stack<Integer> s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        
        for ( int i=0; i<20; i++ ) {s1.pop();}
        Assert.assertEquals(s1.get(), null); 
    }
}
