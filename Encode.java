/*
    demo program shows encrypting using XOR ^ operator
*/

class Encode {
    public static void main (String args[]) {
        String msg = "Let's fuck";
        String encmsg = "";
        String decmsg = "";

        int key = 81;

        System.out.println("Original message is:\n" + msg);

        for(int i=0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("Encoded message is:\n" + encmsg);

        for (int i=0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("Decoded message is:\n" + decmsg);

    }
}