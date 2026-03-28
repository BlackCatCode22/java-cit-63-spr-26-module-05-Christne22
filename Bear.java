/* Christine Tobias
 * CIT-63-18779-2026SP - Module 4 - BEAR class [file creation 03/08/26]
 */

public class Bear extends Animal {

  private String furColor;

  public Bear(String name, int age, String furColor) {
    super(name, age, "Bear");
    this.furColor = furColor;
  }

  // get fur color
  public String getFurColor() {
    return furColor;
  }

  // set fur color
  public void setFurColor(String furColor) {
    this.furColor = furColor;
  }
}
