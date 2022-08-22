import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

  Set<String> set = new HashSet<>();
  protected String text;

  public WordsChecker(String text) {
    this.text = text;

    Collections.addAll(set, text.split("\\P{IsAlphabetic}+"));
  }

  public boolean hasWord(String word) {
    return text.contains(word);
  }
}