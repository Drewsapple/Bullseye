public class Result{
  int bullseyes = 0;
  int hits = 0;
  public Result(int bullseyes, int hits){
    this.bullseyes = bullseyes;
    this.hits = hits;
  }
  public int getBullseyes(){
    return bullseyes;
  }
  public int getHits(){
    return hits;
  }
}
