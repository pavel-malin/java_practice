package com.company;

class StrOps {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String(str1);
        String str3 = "Strings Java";
        int result, idx;
        char ch;

        System.out.println("Len str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++)
            System.out.println(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 instance str2");
        else
            System.out.println("str1 no is instance str2");

        if (str1.equals(str3))
            System.out.println("str1 instance str3");
        else
            System.out.println("str1 no instance str3");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 and str3 equally");
        else if (result < 0)
            System.out.println("str1 smaller str3");
        else
            System.out.println("str1 big's str3");

        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Index one's is included One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index last's is included One: " + idx);

    }
}
