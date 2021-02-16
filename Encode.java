/*
    demo program shows encrypting using XOR ^ operator
*/

class IwillStartUsingProperNamesENCODE {
    String myMsg="", myEncmsg="", myDecmsg="";
    long longKey = 0;
    //int longKey = 0;
    ShowBits li = new ShowBits(64);

    IwillStartUsingProperNamesENCODE(String stringToBeEncrepted) {
        this.myMsg = stringToBeEncrepted;
    }

    long createLongKeyFromString(String stringKey) {
        //this.longKey = 39923;
        for (int i=0; i< stringKey.length(); i++) {
            this.longKey <<= 8;
            this.longKey += (int) stringKey.charAt(i);
        }
        return this.longKey;
    }

    void showOriginalMessage() {
        System.out.println("Original message is:\n" + this.myMsg);
    }

    void showEncryptedMessage() {
        System.out.println("Encrypted message is:\n" + this.myEncmsg);
    }

    void showDecryptedMessage() {
        System.out.println("Decrypted message is:\n" + this.myDecmsg);
    }

    String encodeMessageWithIntkey (int key) {
        for(int i=0; i < this.myMsg.length(); i++) {
            this.myEncmsg = this.myEncmsg + (char) (this.myMsg.charAt(i) ^ key);
        }
        return this.myEncmsg;
        //System.out.println("Encoded message is:\n" + encmsg);
    }

    String decodeMessageWithIntkey (int key) {
        for(int i=0; i < this.myMsg.length(); i++) {
            this.myDecmsg = this.myDecmsg + (char) (this.myEncmsg.charAt(i) ^ key);
        }
        return this.myDecmsg;
        //System.out.println("Encoded message is:\n" + encmsg);
    }

    String encodeMessageWithStringkey (String stringKey) {
        long localLongKey = this.createLongKeyFromString(stringKey);
        for(int i=0; i < this.myMsg.length(); i++) {
            //this.myEncmsg = this.myEncmsg + (char) (this.myMsg.charAt(i) ^ stringKey.charAt(i%this.myMsg.length()));
            this.myEncmsg = this.myEncmsg + (char) (this.myMsg.charAt(i) ^ localLongKey);
        }
        return this.myEncmsg;
    }

    String decodeMessageWithStringkey (String stringKey) {
        long localLongKey = this.createLongKeyFromString(stringKey);
        for(int i=0; i < this.myMsg.length(); i++) {
            //this.myDecmsg = this.myDecmsg + (char) (this.myEncmsg.charAt(i) ^ stringKey.charAt(i%this.myMsg.length()));
            this.myDecmsg = this.myDecmsg + (char) (this.myEncmsg.charAt(i) ^ localLongKey);
        }
        return this.myDecmsg;
    }


}

class Encode {
    public static void main (String args[]) {
        String msg1 = "Let's fuck";
        String msg2 = "I masturbeted already";

        int intKey = 17;
        String stringKey = args[0];


        System.out.println("Message 1 is:\n" + msg1);
        System.out.println("Message 2 is:\n" + msg2);
        IwillStartUsingProperNamesENCODE tempEncDecclass1 = new IwillStartUsingProperNamesENCODE(msg1);
        IwillStartUsingProperNamesENCODE tempEncDecclass2 = new IwillStartUsingProperNamesENCODE(msg2);
        
        System.out.println();
        System.out.println("\nFirst message:");
        tempEncDecclass1.showOriginalMessage();
        tempEncDecclass1.encodeMessageWithIntkey(intKey);
        tempEncDecclass1.showEncryptedMessage();
        tempEncDecclass1.decodeMessageWithIntkey(intKey);
        tempEncDecclass1.showDecryptedMessage();

        System.out.println("\nSecond message:");
        tempEncDecclass2.showOriginalMessage();
        tempEncDecclass2.encodeMessageWithStringkey(stringKey);
        tempEncDecclass2.showEncryptedMessage();
        tempEncDecclass2.decodeMessageWithStringkey(stringKey);
        tempEncDecclass2.showDecryptedMessage();
    }
}