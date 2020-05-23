package lv.zane;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {
        String str = "abc1020404lv";
        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher(str);

        boolean checkMatch = matcher.matches();

        System.out.println(checkMatch);
    }
}
