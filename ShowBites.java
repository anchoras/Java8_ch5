/*
    demo program for showing off bites of the int number
*/

class ShowBites {
    public static void main (String args[]) {
        int t;
        byte number = 10;

        for (t=128; t>0; t/=2) {
            if ((number & t) == t) {
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}