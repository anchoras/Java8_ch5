/*
    demo of string arrays in Java
*/

class StringArraysDemo {
    public static void main (String args[]) {
        String strs[] = { "This", "string", "is", "the testing." };

        System.out.println("Original array: ");
        for(String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        strs[2] = "also is";
        strs[3] = "the testing";

        System.out.println("Changed array: ");
        for(String s : strs) {
            System.out.print(s + " ");
        }
    }
}