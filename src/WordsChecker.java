
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

    System.out.println();
    System.out.println(set);
    System.out.println(
        "\ncontains:   Поиск в тексте слова: [" + word + "] результат поиска - [" + text.contains(word) + "]");

//    if (!set.add(word)) {
//      System.out.println("В этом тексте найдено слово " + word);
//      return true;
//    } else {
//      System.out.println("В этом тексте не найдено слово " + word);
     return false;
    }
}
