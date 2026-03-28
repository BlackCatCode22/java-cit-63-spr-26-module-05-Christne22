/* Christine Tobias
 * CIT-63-18779-2026SP - Module 4 - TIGER class [file creation 03/08/26]
 */
public class Tiger extends Animal {

  private String stripePattern;

  public Tiger(String name, int age, String stripePattern) {
    super(name, age, "Tiger");
    this.stripePattern = stripePattern;
  }

  // get stripe pattern
  public String getStripePattern() {
    return stripePattern;
  }

  // set stripe pattern
  public void setStripePattern(String stripePattern) {
    this.stripePattern = stripePattern;
  }
}
