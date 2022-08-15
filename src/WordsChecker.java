import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

  static String text;

  public WordsChecker(String text) {
    WordsChecker.text = text;
  }

  public static void hasWord(String word) {

    Set<String> set = new HashSet<>();

    Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
    System.out.println();
    System.out.println(set);
    System.out.println(
        "\nПоиск в тексте слова: [" + word + "] результат поиска - [" + text.contains(word) + "]");
  }
}

