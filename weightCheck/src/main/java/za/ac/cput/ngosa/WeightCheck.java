package za.ac.cput.ngosa;
/**
 * Hello world!
 *
 */
public class WeightCheck
{
    static int baggageWeight= 0;
    float cost= 0;

    public  int getBaggageWeight() {
        return baggageWeight;
    }

    public  void setBaggageWeight(int baggageWeight) {
        WeightCheck.baggageWeight = baggageWeight;
    }

    public float getCost()
    {
         if (getBaggageWeight()>50)
         {
             cost= (float) (getBaggageWeight() * 100.0);

         }

        else if(getBaggageWeight()>10)
        {
            cost= (float) (getBaggageWeight() * 50.0);
        }

        else
         {
             cost= (float) (getBaggageWeight() * 10.0);
         }

        return cost;

    }

}
