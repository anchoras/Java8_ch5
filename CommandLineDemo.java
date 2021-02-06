/*
    demo of arguments for command line in main method of the program
*/

class CommandLineDemo {
    public static void main(String args[]) {
        System.out.println("There are " + args.length + " arguments in the command line");

        System.out.println("List of the arguments: ");
        for(int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}