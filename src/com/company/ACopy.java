package com.company;

class ACopy {
    public static void main(String[] args) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i=0; i < nums1.length; i++)
            nums1[i] = i;

        if (nums2.length >= nums1.length)
            for (i = 0; i < nums2.length; i++)
                nums2[i] = i;

        for (i=0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}
