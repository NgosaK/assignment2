package za.ac.cput.ngosa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static float testFloat(){return 3;}

    public static int testInt(){return 5;};

    public static Object testObjectEquality(){Object m = new Object(); return m;}

    public static Object testObjectIdentity(){Object n = new Object(); return n;}

    public static boolean testTruth(){return true;}

    public static boolean testFalse() {return false;}

    public static Object testNullness(){ App appNull= null; return appNull;}

    public static Object testNonNullness(){App appNonNull= new App(); return appNonNull;}

    public static int[] testArrayContent(){int []digits= {1,2,3,4}; return digits;}


}
