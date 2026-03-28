/* Christine Tobias
 * CIT-63-18779-2026SP - Module 4 - LION class [file creation 03/08/26]
 */

public class Lion extends Animal {

  private boolean hasMane;

  public Lion(String name, int age, boolean hasMane) {
    super(name, age, "Lion");
    this.hasMane = hasMane;
  }

  // get has mane value
  public boolean getHasMane() {
    return hasMane;
  }

  // set has mane value
  public void setHasMane(boolean hasMane) {
    this.hasMane = hasMane;
  }
}
