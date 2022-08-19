import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WordsChecker {
  static String text;

  public WordsChecker(String text) {
    WordsChecker.text = text;
  }

  public static void hasWord(String word) {
    List<String> set = new ArrayList<>();


    Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));

    System.out.println();
    System.out.println(set);
    System.out.println(
        "\nПоиск в тексте слова: [" + word + "] результат поиска - [" + text.contains(word) + "]");






  }
}

