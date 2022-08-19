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

//    Set<String> set = new HashSet<>();

    Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
////    for (String s : text.split("\\P{IsAlphabetic}+")) {
////      set.add(s);
    System.out.println();
    System.out.println(set);
    System.out.println(
        "\nПоиск в тексте слова: [" + word + "] результат поиска - [" + text.contains(word) + "]");





//   // Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
//
//    List<String> result = set.stream()
//        .filter(lang -> lang.contains(word)).toList();
//    if (!result.isEmpty()) {System.out.println("Слово [" + word + "] найдено в этом тексте");}
//    else System.out.println("Такого слова нет в тексте");
//
//

  }
}

