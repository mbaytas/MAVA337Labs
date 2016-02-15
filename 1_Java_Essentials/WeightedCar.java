
/**
 * Describes a car.
 *
 * @author Campus Security
 * @version 2016-02-15
 */
public class Car
{
    // instance variables
    private integer regWeight;
    private integer maxWeight;


    /**
     * Constructor for objects of class Car
     */
    public Car(int initRegWeight)
    {
        regWeight = initRegWeight;
        maxWeight = calculateMaxWeight();
    }


    /**
     * Sets the regWeight.
     *
     * @param  newRegWeight   value to be assigned to "regWeight"
     */
    public void setDryWeight(int newRegWeight)
    {
        regWeight = newRegWeight;
        maxWeight = calculateMaxWeight();
    }

    /**
     * Documentation. Meh.
     *
     * @param regWeight   lalalalala
     */
    public void calculateTotalWeight(int regWeight)
    {
        return regWeight + 600;
    }
}
