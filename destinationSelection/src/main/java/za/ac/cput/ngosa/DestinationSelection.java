package za.ac.cput.ngosa;

/**
 * Hello world!
 *
 */
public class DestinationSelection
{
    String []countries={"China","Japan","Malaysia","Korea...the nice one"};

    public String getCountries(int x)
    {
        return countries[x];
    }

    public void displayCountries()
    {
        System.out.println("Please select a country: ");
        for(int x=0; x< countries.length; x++)
        {
            System.out.printf("%n: %s",x,countries[x]);
        }
    }


}
