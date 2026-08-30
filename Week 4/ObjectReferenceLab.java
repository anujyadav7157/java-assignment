public class ObjectReferenceLab {
  public void ObjectReferenceLab_main() {

    ScoreBox box1 = new ScoreBox(10);

    ScoreBox alias = box1;

    ScoreBox box2 = new ScoreBox(10);

    System.out.println("\nComparison with ==:");
    System.out.println("box1 == alias: " + (box1 == alias));
    System.out.println("box1 == box2: " + (box1 == box2));

    System.out.println("\nMutating through alias (adding 5):");
    alias.updateScore(15);
    System.out.println("box1 score is now: " + box1.getScore());

    System.out.println("\nTesting parameter reassignment:");
    System.out.println("box1 score before replaceLocally: " + box1.getScore());
    replaceLocally(box1);
    System.out.println("box1 score after replaceLocally: " + box1.getScore());

    System.out.println("\nTesting addBonus:");
    addBonus(box1, 5);
    System.out.println("box1 score after addBonus: " + box1.getScore());

    System.out.println("\nCreating new ScoreBox from method:");
    ScoreBox newBox = createScoreBox(100);
    System.out.println("newBox score: " + newBox.getScore());
  }

  public static void addBonus(ScoreBox box, int bonus) {
    if (box != null && bonus > 0) {
      box.updateScore(box.getScore() + bonus);
    }
  }

  public static void replaceLocally(ScoreBox box) {
    box = new ObjectReferenceLab().new ScoreBox(999);
  }

  public static ScoreBox createScoreBox(int score) {
    return new ObjectReferenceLab().new ScoreBox(score);
  }

  public class ScoreBox {
    private int score;

    ScoreBox(int score) {
      if (score >= 0) {
        this.score = score;
      } else {
        System.err.println("Score cannot be negative");
        this.score = 0;
      }
    }

    public int getScore() {
      return score;
    }

    public boolean updateScore(int newScore) {
      if (newScore >= 0) {
        this.score = newScore;
        return true;
      }
      return false;
    }
  }
}
