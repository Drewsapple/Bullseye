import java.util.Scanner;
import java.io.IOException;
public class Runner{
  public static void main(String[] args){
    boolean keepgoing = true;
    Scanner sc = new Scanner(System.in);
    System.out.print("How many letters would you like to play with?  ");
    int numLetters = Integer.parseInt(sc.nextLine());
    Target word = new Target(numLetters);
    Check checker = new Check(word.makeArray());
    while(keepgoing){
      System.out.print("Try your shot: ");
      String guess = sc.nextLine();
      Result ans = checker.testAgainst(guess);
      System.out.println("Your guess had "+ans.getHits()+" hits and "+ans.getBullseyes()+" bullseyes.");
      if(ans.getBullseyes() == numLetters){
        System.out.println("You win!");
        keepgoing = false;
      }
    }
  }
}
