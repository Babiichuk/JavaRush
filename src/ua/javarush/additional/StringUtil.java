package ua.javarush.additional;



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;

public class StringUtil {


    public static int countEqualIgnoreCaseAndSpaces(String[] words, String sample) {
        if (sample == null || words == null || words.length == 0) {
            return 0;
        } else {
            int counter = 0;

            for (String analysedWord : words) {
                if (sample.trim().equalsIgnoreCase(analysedWord.trim())) {
                    counter += 1;
                }
            }
            return counter;
        }
    }


    public static String[] splitWords(String text) {
        char[] tempArray = text.toCharArray();
        int counter =0;
        for (int i=0; i<tempArray.length;i++ ){
            if(tempArray[i] != '.' &&tempArray[i] != ':' && tempArray[i] != ';' && tempArray[i] != ','&&tempArray[i] != ' ' &&tempArray[i] != '!' && tempArray[i] != '?'){
                counter +=1;
            }
        }
        if(text == null || counter ==0){
            return  null;
        }
        else {
            String regex = "[\\s\\!\\:\\;\\,\\.]+";
            String subst = " ";

            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(text);

            String result = matcher.replaceAll(subst);
            String[] resultArray = result.trim().split(" ");

            return resultArray;
        }
    }



    public static String convertPath(String path, boolean toWin) {
        throw new UnsupportedOperationException();
    }



    public static String joinWords(String[] words) {
        if (words == null) {
            return null;
        }

        ArrayList<String> withoutBlank = new ArrayList<>();
        String result = null;
        int counter = 0;
        for (String analysedWord : words) {
            if (analysedWord == "") {
                counter += 1;
            }
        }
        if (words.length == 0) {
            return null;
        } else if (counter == words.length) {
            return null;

        } else {
            for (int i = 0; i < words.length; i++) {
                if (words[i].trim() != "") {
                    withoutBlank.add(words[i]);
                }
            }
        }
        String[] resultArray = new String[withoutBlank.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = withoutBlank.get(i);
        }
        result = Arrays.toString(resultArray);
        return result;
    }


    public static void main(String[] args) {


        System.out.println("Test 1: countEqualIgnoreCaseAndSpaces");
        String[] words = new String[]{" WordS    \t", "words", "w0rds", "WOR  DS",};
        String sample = "words   ";
        int countResult = countEqualIgnoreCaseAndSpaces(words, sample);
        System.out.println("Result: " + countResult);
        int expectedCount = 2;
        System.out.println("Must be: " + expectedCount);

        System.out.println("Test 2: splitWords");
        String text = "   ,, first, second!!!! third   ,, ";
        String[] splitResult = splitWords(text);
        System.out.println("Result : " + Arrays.toString(splitResult));
        String[] expectedSplit = new String[]{"first", "second", "third"};
        System.out.println("Must be: " + Arrays.toString(expectedSplit));

        System.out.println("Test 3: convertPath");
        String unixPath = "/some/unix/path";
        String convertResult = convertPath(unixPath, true);
        System.out.println("Result: " + convertResult);
        String expectedWinPath = "C:\\some\\unix\\path";
        System.out.println("Must be: " + expectedWinPath);


        System.out.println("Test 4: joinWords");
        String[] toJoin = new String[]{"go", "with", "the", "", "FLOW"};
        String joinResult = joinWords(toJoin);
        System.out.println("Result: " + joinResult);
        String expectedJoin = "[go, with, the, FLOW]";
        System.out.println("Must be: " + expectedJoin);

    }
}