/*
    demo program shows bite shifting
*/

class ShiftBitesDemo {
    public static void main(String args[]) {
        int val = -2;
        int t;

        for (int i=0; i<8; i++) {
            for (t=128; t>0; t=t/2) {
                if ((val & t) == t) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
            val = val << 1;
        }

        System.out.println();
        System.out.println("val is: " + val);

        //val = 144;
        for (int i=0; i<8; i++) {
            for (t=128; t>0; t=t/2) {
                if ((val & t) == t) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
            val = val >> 1;
        }
        System.out.println("val is: " + val);
    }
}