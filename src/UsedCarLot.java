/** This class represents a Used Car Lot
 *
 *
 * @author Crystal Ling
 */

import java.util.ArrayList;

public class UsedCarLot
{
    /**
     * The inventory of the UsedCarLot
     */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object and initializes it as an empty ArrayList
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the inventory of the UsedCarLot
     *
     * @return the inventory of the UsedCarLot
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a car to the UsedCarLot object
     *
     * @param added The added Car object
     */
    public void addCar(Car added)
    {
        inventory.add(added);
    }

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */
    /**
     * Adds a car to a certain index of the UsedCarLot object
     * @param indexToAdd the index of where to place the carToAdd
     * @param carToAdd the Car object added in indexToAdd
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Swaps the places of two Car objects
     * @param one the first index
     * @param two the second index
     * @return true if the indexes are within the size of inventory and false if they do not
     */
    public boolean swap(int one, int two)
    {
        if (one < inventory.size() && two < inventory.size() && one > 0 && two > 0)
        {
            Car car1 = inventory.get(one);
            Car car2 = inventory.get(two);
            inventory.set(one, car2);
            inventory.set(two, car1);
            return true;
        }
        else
        {
            return false;
        }
    }
    /* "sells" the Car located at indexOfCarToSell which
      removes it from the inventory list and shifting the remaining
      Cars in the inventory list to the left to fill in the gap;
      this method reduces the size of inventory by 1

      Returns the Car that is being "sold" (removed from lot)

      PRECONDITION: indexOfCarToSell < inventory.size()

      HINT: the ArrayList remove() method returns the removed element while also
            removing it from the ArrayList
    */
    /**
     * Removes a Car object from the inventory
     *
     * @param indexOfCarToSell index of the car the user wants to sell
     * @return the Car that was removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
     but instead of removing it and shifting the inventory
     list to the left, REPLACE the Car at indexOfCarToSell
     with NULL, thus creating an "empty parking spot" on the lot;
     this method does NOT reduce the size of inventory by 1

     PRECONDITION: indexOfCarToSell < inventory.size()

     This method returns the Car that is being "sold" (replaced with null)
   */
    /**
     * Removes the Car object from the inventory and replaces it with null
     *
     * @param indexOfCarToSell index of the car the user wants to sell
     * @return the Car that was removed
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sellingCar = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sellingCar;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
     if destinationIndex > indexOfCarToMove, moves the Car to the right in
     inventory; if destinationIndex < indexOfCarToMove, moves the
     Car to the left in the inventory. All other cars in the inventory
     should shift accordingly

     PRECONDITIONS: indexOfCarToMove < inventory.size()
                    destinationIndex < inventory.size()
   */
    /**
     * Moves the car to the location of the index
     *
     * @param indexOfCarToMove index of the car the user wants to move
     * @param destinationIndex index of the place the user wants to move the car to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        inventory.add(destinationIndex, inventory.remove(indexOfCarToMove));
    }
}
