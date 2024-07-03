
/*

  Given an array of integers nums and an integer
  target, return indices of the two numbers such
  that they add up to target. You may assume that
  each input would have exactly one solution, 
  and you may not use the same element twice.
  You can return the answer in any order.

  
  date: ??/??/???? ??:?? PM/AM
  I'm: Normal?

  Runtime: 44 ms
  Memory Usage: 44.9 MB
  
*/

class Solution {
	public int[] twoSum(int[] n, int t) {
    	int s[] = {0,0};
    	for (int x = 0; x< n.length; x++) {
    	for (int y = x+1; y< n.length; y++) { 
    		if ( n[x]+n[y] == t ) {
            	s[0] = x;
            	s[1] = y;
            	return s;
        	}
    	}}
    	return s;
	}
}

