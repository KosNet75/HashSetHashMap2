import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class WordsChecker {
  static String text;

  public WordsChecker(String text) {
    WordsChecker.text = text;
  }

  public static void hasWord(String word) {
    // List<String> set = new ArrayList<>();

    Set<String> set = new HashSet<>();


    Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));

    System.out.println();
    System.out.println(set);
    System.out.println(
        "\nПоиск в тексте слова: [" + word + "] результат поиска - [" + text.contains(word) + "]");


///без contains..

    if(!set.add(word)) {
      System.out.println("В этом тексте найдено слово " + word);
    }else System.out.println("В этом тексте не найдено слово "  + word);



//
//    int indexJava = set.indexOf(word);
//    System.out.println(" вариант без contains..????");
//    if(indexJava == - 1) {
//      System.out.println("Слово \"voluptate\" не найдено.");
//    } else {
//      System.out.println("Слово \"" + word + "\" найдено в тексте");
//     }

  }
}

