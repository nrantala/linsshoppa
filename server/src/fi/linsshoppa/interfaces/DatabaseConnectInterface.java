/**
 *
 */
package fi.linsshoppa.interfaces;

/**
 * @author nrantala
 *
 */
public interface DatabaseConnectInterface {

    /**
     * Opens a connection to the database
     * @return 0 if successful -1 if connection failed
     */
    public int connect();

    /**
     * Closes the connection to the database
     * @return 0 if closing was successful, -1 if the operation failed
     */
    public int close();


    public Object query();

}
