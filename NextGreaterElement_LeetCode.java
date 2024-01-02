/*
  leet code https://leetcode.com/problems/next-greater-element-i/description/

  just use hash map for cehcking elements in num2 and getting its value 
*/

class NextGreaterElement_LeetCode {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        s.push(nums2.length-1);
        for(int i = nums2.length-2 ; i>=0 ; i--)
        {
                while(!s.isEmpty() && nums2[i]>nums2[s.peek()])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    nextGreater.put(nums2[i] , -1);
                }
                else 
                {
                    nextGreater.put(nums2[i] , nums2[s.peek()]);
                }
            s.push(i);
        }
        for(int i = 0 ; i<nums1.length ; i++ )
        {
            ans[i] = nextGreater.getOrDefault(nums1[i] , -1);
        }
        return ans;
        
    }
}