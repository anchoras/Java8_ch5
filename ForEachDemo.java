/*
    demo program inludes intoduction For-Each cycle basics
*/

/* class ForEachDemo {
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
} */

class ForEachDemo {
    public static void main (String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                nums[i][j] = (i+1) * (j+1);
            }
        }

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }

        System.out.println("Sum is: " + sum);
    }
}