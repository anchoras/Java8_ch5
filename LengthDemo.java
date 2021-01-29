/*
    demo program for demonstate Length variable of an array
*/

class LengthDemo {
    public static void main (String args[]) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9} };

        System.out.println("list length is: " + list.length);
        System.out.println("nums length is: " + nums.length);
        System.out.println("table[0] length is: " + table[0].length);
        System.out.println("table[1] length is: " + table[1].length);
        System.out.println("table[2] length is: " + table[2].length);

        for (int i=0; i<list.length; i++) {
            list[i] = i * i;
        }

        System.out.println("\nvariables in list are:");
        for (int i=0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        System.out.println(table.length);

    }
}