package com.company;

class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("str1");
        String str2 = "str2";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
