package ua.javarush.additional;

import java.util.regex.Pattern;

public class WinPathCorrector {

    public static void main(String[] args) {

    }

    public static String winPathCorrector(String path){

        Pattern winBegin = Pattern.compile("(?:[a-zA-Z]\\:)\\\\([\\w-]+\\\\)*\\w([\\w-.])+");
        Pattern winEnd = Pattern.compile("$[a-zA-Z]");
        Pattern winWrong = Pattern.compile("/*~*");
        Pattern winMultipleSlash= Pattern.compile("\\\\*");
        Pattern winReplaceAfterBeginning = Pattern.compile("\\\\");

        path = winWrong.matcher(path).replaceAll("");
        path = winMultipleSlash.matcher(path).replaceAll("\\\\");
        return path;
    }

}
