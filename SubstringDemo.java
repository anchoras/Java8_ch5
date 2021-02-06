/*
    demo of substring
*/

class SubstringDemo {
    public static void main (String args[]) {
        String orgstr = "Java -- engine of internet.";
        String substr = orgstr.substring(7, 26);

        System.out.println("Original string: " + orgstr);
        System.out.println("Substring: " + substr);
    }
}