class decrypt {
    protected String enc(String msg, int key) { //key=0to26,message with no space as of now. Caesar Cipher has key=3
        String decryptedMsg = "";
        String sample = "abcdefghijklmnopqrstuvwxyz";
        int mod = 0;
        String strm = msg.toLowerCase();
        for (int i = 0; i < strm.length(); i++) {
            mod = (strm.charAt(i) - 97)%26 - (key % 26);
            if (mod < 0) {
                mod = 26+mod;
            }
            decryptedMsg = decryptedMsg + sample.charAt(mod);
        }
        return decryptedMsg;
    }
}
