/*
    elementary program for array and bubble sort demo
*/

class Bubble {
    public static void main(String args[]) 
        throws java.io.IOException {
        int i, j, intTemp, size = 6, intInput;
        char ignore;
        int myIntArray[] = new int[size];

        myIntArray[0] = -13;
        myIntArray[1] = 3;
        myIntArray[2] = 32;
        myIntArray[3] = 0;
        myIntArray[4] = 0;
        myIntArray[5] = 17;
/*         for (i=0; i<=(size-1); i++) {
            intInput = System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            myIntArray[i] = intInput;
        } */

        System.out.println("unsorted array: ");
        for (i=0; i<=(size-1); i++) {
            System.out.print(myIntArray[i] + " ");
        }

        for (i=0; i<=(size-1); i++) {
            for (j=(size-1); j>i; j--) {
                if (myIntArray[j-1] > myIntArray[j]) {
                    intTemp = myIntArray[j-1];
                    myIntArray[j-1] = myIntArray[j];
                    myIntArray[j] = intTemp;
                }
            }
        }

        System.out.println("sorted array: ");
        for (i=0; i<=(size-1); i++) {
            System.out.print(myIntArray[i] + " ");
        }
    }
}