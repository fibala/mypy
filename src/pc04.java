import edu.princeton.cs.introcs.In;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pc04 {
    public static String linkedlist(String num) {
        String webpage = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=";
        In page = new In(webpage + num);
        String pageread = page.readAll();
        System.out.println(pageread);
        Pattern p = Pattern.compile("and the next nothing is (\\d+)");
        Matcher m = p.matcher(pageread);
        return m.find() ? m.group(1) : "Done";
    }
    public static void main(String[] args) {
        String num;
        for(num = new String(Integer.toString(8022)); num != "Done"; num = linkedlist(num)) {
            ;
        }
        System.out.println(num);
    }
}

