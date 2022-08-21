import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    WordsChecker wordsChecker = new WordsChecker(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
            + " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
            + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure "
            + "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur "
            + "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");


    System.out.print("Введите слово для поиска: > ");
    String input = scanner.nextLine();
    if(WordsChecker.hasWord(input)) {
      System.out.println("без contains:   В этом тексте найдено слово " + input);
    }else {
      System.out.println("без contains:   В этом тексте не найдено слово " + input);
    }
  }
}
