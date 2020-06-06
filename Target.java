import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Target {
  String targetWord; // start off empty

  public Target(int numLetters) {
    targetWord = getWord(numLetters); // gets word from dictionary with right number of letters
  }

  public char[] makeArray() {
    char[] arr = new char[targetWord.length()];
    for (int i = 0; i < targetWord.length(); i++) {
      arr[i] = targetWord.charAt(i);
    }
    return arr;
  }

  private String getWord(int numLetters) {
    var words = new ArrayList<String>();
    File file = new File("words.english.txt");
    Scanner dict;
    try {
      dict = new Scanner(file);
      while(dict.hasNext()){
        String word = dict.next();
        if(word.length() == numLetters){
          words.add(word);
        }
      }
      dict.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return words.get((int)(Math.random()*(words.size()))).toLowerCase();
  }
}
