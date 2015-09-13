package za.ac.cput.ngosa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Ignore;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   App newApp= new App();
    int []nums= {1,2,3,4};
    Object m= new Object();
    Object n= new Object();


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

    public void testFloat(){assertEquals(3, newApp.testFloat(),0);}

    public void testInt(){assertEquals(5,newApp.testInt());}

    public void testObjectEquality(){assertEquals(m,(n));}

    public void testObjectIdentity(){assertSame(m,newApp.testObjectIdentity());}

    public void testTrue(){assertEquals(true,newApp.testTruth());}

    public void testFalse(){assertEquals(false,newApp.testFalse());}

    public void testNullness(){assertNull(newApp.testNullness());}

    public void testNotNullness(){assertNotNull(newApp.testNonNullness());}

    public void testFail(){
        Assert.fail();}

    public void testArrayContent() {assertArrayEquals(nums, newApp.testArrayContent());}

    @org.junit.Test(timeout= 10)
    public void testTimeOut()
    {}

    @Ignore
    @org.junit.Test
    public void testDisabled()
    {}






}
