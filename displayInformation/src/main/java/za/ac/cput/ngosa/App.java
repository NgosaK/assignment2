package za.ac.cput.ngosa;

/**
 * Hello world!
 *
 */
public class App 
{
    static DataEntry dataEntry = new DataEntry();
    static DestinationSelection destinationSelection = new DestinationSelection();
    static WeightCheck weightCheck= new WeightCheck();
    public static void main( String[] args )
    {
        System.out.println("****The Store Stuff Stuff****");
        System.out.println();
        System.out.println("Enter first name: ");
        dataEntry.setFname();
        System.out.println("Enter last name: ");
        dataEntry.setLname();
        System.out.println("Enter baggage weight: ");
        dataEntry.setWeight();
        destinationSelection.displayCountries();
        dataEntry.setLocation();
        weightCheck.setBaggageWeight((int) dataEntry.getWeight());
        System.out.println();
        System.out.println("Details: ");
        System.out.printf("First Name: %s", dataEntry.getFname());
        System.out.println();
        System.out.printf("Last Name: %s", dataEntry.getLname());
        System.out.println();
        System.out.printf("Baggage Weight: %n", weightCheck.getBaggageWeight());
        System.out.println();
        System.out.printf("Cost: %f",weightCheck.getCost());
        System.out.println();
        System.out.printf("Destination: %s",destinationSelection.getCountries(dataEntry.getLocation()));













    }
}
