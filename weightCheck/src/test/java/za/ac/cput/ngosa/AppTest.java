package za.ac.cput.ngosa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testWeight()
    {
        WeightCheck weightCheck= new WeightCheck();
        weightCheck.setBaggageWeight(30);
        assertEquals(30, weightCheck.getBaggageWeight());}




    public void testCost() {
        WeightCheck weightCheck= new WeightCheck();
        weightCheck.setBaggageWeight(30);
        assertEquals(1500, weightCheck.getCost(),0);}
}
