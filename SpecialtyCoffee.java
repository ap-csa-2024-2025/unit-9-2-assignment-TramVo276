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
    
    return "The price is " + super.getPrice() * 1.5;
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
    System.out.println("A regular coffee costs " + super.getPrice()); //This will print the prices from Parent class
    System.out.println("A speciality coffee costs " + this.getPrice()); // this will print the prices from parent class and multiply by 1.5
    //this do the same with the getPrice() below
    //System.out.println("A specialty coffee costs " + getPrice()); 

  }
}
