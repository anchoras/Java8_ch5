/*
    demo program inludes intoduction For-Each cycle basics
*/

class ForEachDemo {
    public static void main (String args[]) {
        int  nums[] = {1, 2, 3, 4, 5, 6};
        

        for (int x : nums) {
            System.out.println("Value of element: " + x);
            x += 10;
            System.out.println("Potentional new value of element: " + x);
        }

        System.out.println();

        for (int x : nums) {
            System.out.println("Value of element: " + x);
        }
    }
}