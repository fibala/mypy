import edu.princeton.cs.algs4.In;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pc02b {
    private static String readHTML(String html) {
        In page = new In(html);
        return page.readAll();
    }
    public static String ocr(String texts) {
        Pattern p = Pattern.compile("[\\[\\]{}()#$%^@+!*&_\n]");
        Matcher m = p.matcher(texts);
        return m.replaceAll("");
    }
    public static void main(String[] args) {
        String webpage = "file:///home/lynn/Documents/challenge/java/src/ocr.html";
        String html = readHTML(webpage);
        System.out.println(ocr(html));
    }
}

