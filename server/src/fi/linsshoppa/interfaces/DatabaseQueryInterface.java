package fi.linsshoppa.interfaces;

public interface DatabaseQueryInterface {

    /**
     * @return the result of the query
     */
    public Object result();

    /**
     * Query the database
     * @param query
     */
    public void query(String query);
}
