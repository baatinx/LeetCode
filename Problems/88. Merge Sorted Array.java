class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if (nums2.length == 0) return;
        
        
        int i = (nums1.length - nums2.length) - 1;
        int j = nums2.length - 1;
        
        int k = nums1.length - 1;
        
        
        while (i >= 0 && j >= 0 ) {
            
            if (nums1[i] > nums2[j]) {
                
                nums1[k] = nums1[i];
                i--;
                
            } else {

                nums1[k] = nums2[j];
                j--;

            }
            
            k--;
                
        }
        
        
        while (j >= 0) {
            
            nums1[k] = nums2[j];
            j--;
            k--;
            
        }
        
    }
}