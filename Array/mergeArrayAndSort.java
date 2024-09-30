package Array;

import java.util.ArrayList;
import java.util.Arrays;

class mergeArrayAndSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        ArrayList<Integer> intList = new ArrayList<>();
        for(int a :merged){
            if(a!=0){
            intList.add(a);
            }
        }

        System.out.println(intList);
    }

    public static void main(String[] args){

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeArrayAndSort obj = new mergeArrayAndSort();
        obj.merge(nums1,m,nums2,n);
    }
}