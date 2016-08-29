import java.util.Scanner;
import java.io.IOException;
public class Runner{
  public static void main(String[] args){
    boolean keepgoing = true;
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.println("How many letters would you like to play with?");
    int numLetters = sc.nextInt();
    Target word = new Target(numLetters);
    Check checker = new Check(word.makeArray());
    while(keepgoing){
      System.out.println("Try your shot.");
      String guess = sc2.nextLine();
      Result ans = checker.testAgainst(guess);
      System.out.println("Your guess had "+ans.getHits()+" hits and "+ans.getBullseyes()+" bullseyes.");
      if(ans.getBullseyes() == numLetters){
        System.out.println("You win!");
        keepgoing = false;
      }
    }
  }
}
