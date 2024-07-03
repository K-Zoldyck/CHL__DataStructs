
/*
  Given an integer array nums and an integer val, 
  remove all occurrences of val in nums in-place. 
  The order of the elements may be changed. 
  Then return the number of elements in nums which
  are not equal to val.


  date: ??/??/???? ??:?? PM/AM
  I'm: Normal?
  
  Runtime: 00 ms
  Memory Usage: 42 MB
  
*/


class Solution {
    public int removeElement(int[] nums, int val) {
        int diff = 0;
        
        for ( int x : nums ){ diff = (x == val ) ? diff+1 : diff;}
        
        diff = (nums.length - diff);
        int[] new_nums = new int[diff];
        
        for ( int x=0, y=0; x<nums.length; x++ ) {
            if ( nums[x] != val ) {
                new_nums[y] = nums[x];
                y++;
            }
        }
        
        for ( int x=0; x<new_nums.length; x++ ){
            nums[x] = new_nums[x];
        }
    
        return diff;
    }
}
