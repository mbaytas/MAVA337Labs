
/**
 * Describes a Car.
 *
 * @author mbaytas
 * @version 20150219
 */
public class Car
{
    // instance variables
    private String ownerName;
    private int ownerId;
    private String licencePlate;
    private boolean isFeePaid;

    /**
     * Constructor for objects of class Car
     */
    public Car(String initOwnerName, int initOwnerId, String initLicencePlate, boolean initIsFeePaid)
    {
        // initialise instance variables
        ownerName = initOwnerName;
        ownerId = initOwnerId;
        licencePlate = initLicencePlate;
        isFeePaid = initIsFeePaid;
    }

    public void setOwnerName(String newOwnerName)
    {
        ownerName = newOwnerName;
    }

    public void setOwnerId(int newOwnerId)
    {
        ownerId = newOwnerId;
    }

    public void setLicencePlate(String newLicencePlate)
    {
        licencePlate = newLicencePlate;
    }

    public void setIsFeePaid(boolean newIsFeePaid)
    {
        isFeePaid = newIsFeePaid;
    }
}
