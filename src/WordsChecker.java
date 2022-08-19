import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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



    int indexJava = set.indexOf(word);
    System.out.println(" вариант без contains..????");
    if(indexJava == - 1) {
      System.out.println("Слово \"voluptate\" не найдено.");
    } else {
      System.out.println("Слово \"voluptate\" найдено в тексте");
     }

  }
}

