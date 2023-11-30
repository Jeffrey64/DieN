
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class Die20
{
   private int value;

   public Die20() {
    this.roll();
  }

   public int getValue() {
    return value;
  }

   public void roll() {
    this.value = (int)(Math.random() * 20) + 1;
  }

    public int rollAndGetValue() {
    roll();
    return getValue();
  }

}


