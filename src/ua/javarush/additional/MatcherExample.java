package ua.javarush.additional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

    public static void main(String[] args) {

        final String regex = "[\\s\\!\\:\\;\\,\\.]+";
        final String string = "     ,,,    dfdlkj!  ldk5jf., dfkjdfl   ,,, ij55dflkj    d    ";
        final String subst = " ";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        // The substituted value will be contained in the result variable
        final String result = matcher.replaceAll(subst);

        System.out.println("Substitution result: " + result);
    }


}
