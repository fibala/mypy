public class pc01 {
    private static StringBuilder cipher1(String words) {
        StringBuilder cipher_word = new StringBuilder();

        for(int i = 0; i < words.length(); ++i) {
            char c = words.charAt(i);
            if (c >= 'a' && c <= 'z') {
                cipher_word.append((char)((c + 2 - 97) % 26 + 97));
            }
            else {
                cipher_word.append(c);
            }
        }
        return cipher_word;
    }
    public static void main(String[] args) {
        String the_string1 = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
        String the_string2 = "map";
        StringBuilder sb = cipher1(the_string1);
        StringBuilder mm = cipher1(the_string2);
        System.out.println(sb);
        System.out.println(mm);
    }
}

