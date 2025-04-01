public class SpecialtyCoffee extends Coffee
{
  private String flavor;

  public SpecialtyCoffee()
  {
    super();
    flavor = "vanilla";
  }

  public SpecialtyCoffee(String type, String flavor)
  {
    super("small", false, 1, type);
    this.flavor = flavor;
  }

  public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor)
  {
    super(size, isSkinny, shots, type);
    this.flavor = flavor;
  }

  // Method override of Coffee getPrice
  public double getPrice()
  {
    // we will edit in class
    return 0.0;
  }

  // Method override of Coffee toString
  public String toString()
  {
   return super.toString() + " with " + flavor;
  }

  // print a message that compares the prices of a regular Coffee
  // and a SpecialtyCoffee using both getPrice methods
  public void printPriceComparison()
  {

  }
}
