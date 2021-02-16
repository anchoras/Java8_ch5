/*
    elementary program for array and bubble sort demo
*/

class Bubble {
    public static void main(String args[]) 
        throws java.io.IOException {
        int i, j, size, intInput;
        char ignore;
        
        size = args.length;
        String[] myStringArray = new String[size];
        String stringTemp = new String();

/*         myIntArray[0] = -13;
        myIntArray[1] = 3;
        myIntArray[2] = 32;
        myIntArray[3] = 0;
        myIntArray[4] = 0;
        myIntArray[5] = 17; */
/*         for (i=0; i<=(size-1); i++) {
            intInput = System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            myIntArray[i] = intInput;
        } */

        System.out.println("unsorted array: ");
        for (i=0; i<=(size-1); i++) {
            myStringArray[i] = args[i];
            System.out.print(myStringArray[i] + " ");
        }

        for (i=0; i<=(size-1); i++) {
            for (j=(size-1); j>i; j--) {
                if (myStringArray[j].compareTo(myStringArray[j-1]) < 0) {
                    stringTemp = myStringArray[j];
                    myStringArray[j] = myStringArray[j-1];
                    myStringArray[j-1] = stringTemp;
                }
            }
        }

        System.out.println("\nsorted array: ");
        for (i=0; i<=(size-1); i++) {
            System.out.print(myStringArray[i] + " ");
        }
    }
}