import edu.princeton.cs.algs4.In;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pc03 {
    private static String readHTML(String html) {
        In page = new In(html);
        String pageread = page.readAll();
        return pageread;
    }
    public static StringBuilder equality(String texts) {
        StringBuilder OUTstring = new StringBuilder();
        Pattern p = Pattern.compile("[^A-Z]+[A-Z]{3}([a-z])[A-Z]{3}[^A-Z]+");
        Matcher m = p.matcher(texts);
        while(m.find()) {
            OUTstring.append(m.group(1));
        }
        return OUTstring;
    }
    public static void main(String[] args) {
        String webpage = "file:///home/lynn/Documents/challenge/python/equality.html";
        String html = readHTML(webpage);
        System.out.println(equality(html));
    }
}

