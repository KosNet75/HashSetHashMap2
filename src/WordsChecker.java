
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class WordsChecker {

  static Set<String> set = new HashSet<>();
  static String text;

  public WordsChecker(String text) {

    WordsChecker.text = text;

    Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
  }

  public static boolean hasWord(String word) {
//    System.out.println();
//    System.out.println(set);

    return !set.add(word);
  }
}
