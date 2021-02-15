/*
    demo program with introducing of string objects
    different input ways showed
    some basic methods introduced
*/

class StringDemo {
    public static void main (String args[]) {
        //String str1 = new String("Java - is the leader of internet");
        String str1 = new String("Java Java Java Java ");
        String str2 = (str1);
        String str3 = ("Java's strings are effective");
        int result, idx;
        char ch;

        System.out.println("Length of str1 is: " + str1.length());

        /* for (int i=0; i<str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println(); */


        /* if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        }
        else {
            System.out.println("str1 is NOT equal to str2");
        } */

        System.out.println();
        System.out.println("Length of str3 is: " + str3.length());

        String str4 = "";
        result = str1.compareTo(str4);
        System.out.println(result);
        result = str3.compareTo(str4);
        System.out.println(result);
        result = str3.compareTo(str1);
        System.out.println(result);
/*         if (str1.equals(str3)) {
            System.out.println("str1 is equal to str3");
        }
        else {
            System.out.println("str1 is NOT equal to str3");
        }

        result = str1.compareTo(str3);
        System.out.println(result);
        if (result == 0) {
            System.out.println("length of str1 is equal to length of str3");
            System.out.println(result);
        }
        else if (result > 0) {
            System.out.println("str1 is shorter than str3");
            System.out.println(result);
        }
        else if (result < 0) {
            System.out.println("str1 is longer than str3");
            System.out.println(result);
        } */
/* 
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of first 'One' is: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last 'One' is: " + idx); */
    }
}