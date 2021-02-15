/*
    demo program shows 'x ? y : z' form of  ternary operator
*/

class NoZeroDiv {
    public static void main (String args[]) {
        int result;

        for (int i = -6; i<5; i++) {
            result = i != 0 ? 100/i : 0;
            if (i != 0) {
                System.out.println("100/" + i + " is equal to " + result);
            }
        } 
    }
}