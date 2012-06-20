package fi.linsshoppa.database;

import fi.linsshoppa.interfaces.DatabaseQueryInterface;

public class SelectUsernameAndPasswordQuery implements DatabaseQueryInterface {

    public SelectUsernameAndPasswordQuery() {
        dbc.connect();
    }


    @Override
    public Object result() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public  void query(String query) {
        if(dbc.getConnection() != null) {
        }
    }

    private DatabaseConnection dbc = new DatabaseConnection();
    private Object result = null;

}
