class encrypt {
    protected String enc(String msg, int key) {
        String encryptedMsg="";
        String sample="abcdefghijklmnopqrstuvwxyz";
        int mod=0;
        String strm = msg.toLowerCase();
        for(int i=0;i<strm.length();i++)
        {
            mod=(strm.charAt(i)-97+key)%26;
            encryptedMsg= encryptedMsg+sample.charAt(mod);
        }
        return  encryptedMsg;
    }
}
