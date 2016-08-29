public class Check{
  char[] original = null;
  public Check(char[] targetWord){
    original = targetWord;
  }
  public Result testAgainst(String in){
    int bullseyes = 0;
    int hits = 0;

    char[] guess = new char[in.length()];
    for(int i = 0; i < in.length();i++){
      guess[i] = in.charAt(i);
    }
    //count hits and bullseyes
    for(int i = 0; i < guess.length; i++){
      if(guess[i] == original[i])
        bullseyes++;
      else{
        for(char x : original){
          if(guess[i] == x)
            hits++;
        }
      }
    }
    System.out.println(hits);
    System.out.println(bullseyes);
    Result ans = new Result(bullseyes,hits);
    return ans;
  }
}
