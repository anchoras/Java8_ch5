/*
    demo program that shows working of class "ShowBits"
    input number of bits for showing --> program show them
*/


class ShowBitsDemo {
    public static void main (String args[]) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 in binary form: ");
        b.show(123);

        System.out.println("\n87987 in binary form: ");
        i.show(87987);

        System.out.println("\n237658768 in binary form: ");
        i.show(237658768);

        System.out.println("\nLesser 8 bits of number 87987 in binary form: ");
        b.show(87987);
    }
}