import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    coffee c = new Coffee("large", true, 10, "latte");
    SpecialtyCoffee sp = new SpecialtyCoffee("medium", false, 30, "machiatto", "matcha");

    System.out.println(c); // implicit call to c.toString();
    System.out.println(sp); //implicit call to sp.toString(); 
    // it call from the parent at Coffee eventhough the SpecialtyCoffee
    // If the Coffee don't have the toString it will call from the super Parent which is Object (super class of everything - here is Coffee)




    // Uncomment to test the Car classes
    // CarTester.run();

    // Uncomment to test the Company classes
    // CompanyTester.run();
  }
}
