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
        "\ncontains:   Поиск в тексте слова: [" + word + "] результат поиска - [" + text.contains(word) + "]");


    if(!set.add(word)) {
      System.out.println("без contains:   В этом тексте найдено слово " + word);
    }else System.out.println("без contains:   В этом тексте не найдено слово "  + word);
    set.remove(word);


  }
}

