
/**
 * @date 16/10/2024, 19:12
 * @author K-Zoldyck
 */

import com.statics.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaticStackTest {
    @Test
    public void simpleAdd() {
        Stack<Integer> s1 = new Stack(3);
        s1.push(10);
        s1.push(10);
        s1.push(10);
        Assert.assertEquals((int)s1.len(), 3); 
    }
    
    @Test
    public void InvalidLengthAdd() {
        Stack<Integer> s1 = new Stack(3);
        s1.push(10);
        s1.push(10);
        s1.push(10);
        s1.push(10);
        s1.push(10);
        s1.push(10);
        Assert.assertEquals((int)s1.len(), 3); 
    }
    
    @Test
    public void simpleRemove() {
        Stack<Integer> s1 = new Stack(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        Assert.assertEquals((int)s1.len(),  2); 
        Assert.assertEquals((int)s1.get(), 20); 
    }
    
    @Test
    public void InvalidLengthRemove() {
        Stack<Integer> s1 = new Stack(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        Assert.assertEquals((int)s1.len(),  0); 
        Assert.assertEquals(s1.get(), null); 
    }
}
