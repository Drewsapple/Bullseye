public class Target{
  String targetWord = null; //start off empty
  public Target(int numLetters){
    targetWord = getWord(numLetters); //gets word from dictionary with right number of letters
  }
  public char[] makeArray(){
    char[] arr = new char[targetWord.length()];
    for(int i = 0; i < targetWord.length();i++){
      arr[i] = targetWord.charAt(i);
    }
    return arr;
  }
  private String getWord(int numLetters){
    String[] dict4 = {"also","dogs","cats","rock","lock","joke"};
    String[] dict5 = {"Cores","Miles","Bears","Paint"};
    if(numLetters == 4){
      return dict4[(int)(Math.random()*(dict4.length))].toLowerCase();
    }
    else if(numLetters == 5){
      return dict5[(int)(Math.random()*(dict5.length))].toLowerCase();
    }
    else{
      return "";
    }
  }
}
