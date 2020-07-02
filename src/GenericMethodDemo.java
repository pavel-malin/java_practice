public class GenericMethodDemo {
    static<T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y) {
        if(x.length != y.length)
            return false;

        for (int i=0; i<x.length; i++) {
            if (!x[i].equals(y[i]))
                return false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4,5};
        Integer[] nums3 = {1, 2, 7, 4, 5};
        Integer[] nums4 = {1, 2, 7, 4, 5, 6};

        if (arrayEqual(nums, nums))
            System.out.println("nums equivalent nums");
        if (arrayEqual(nums, nums2))
            System.out.println("nums equivalent nums2");
        if (arrayEqual(nums, nums3))
            System.out.println("nums equivalent nums3");
        if (arrayEqual(nums, nums4))
            System.out.println("nums equivalent nums4");

        Double[] dvals = {1.1, 2.2, 3.3, 4.4, 5.5};
        // Error codes nums and dvals not types
        // if (arrayEqual(nums, dvals))
        //    System.out.println("nums equivalent dvals");
    }
}
