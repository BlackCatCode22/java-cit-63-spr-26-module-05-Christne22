/* Christine Tobias
 * CIT-63-18779-2026SP - Module 4 - HYENA class [file creation 03/08/26]
 */

public class Hyena extends Animal {

  private String laughStyle;

  public Hyena(String name, int age, String laughStyle) {
    super(name, age, "Hyena");
    this.laughStyle = laughStyle;
  }

  // get laugh style
  public String getLaughStyle() {
    return laughStyle;
  }

  // set laugh style
  public void setLaughStyle(String laughStyle) {
    this.laughStyle = laughStyle;
  }
}
