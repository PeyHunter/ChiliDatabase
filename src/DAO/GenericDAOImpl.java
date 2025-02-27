package DAO;
import Connection.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAOImpl<T> implements GenericDAO<T>
{
    protected DatabaseConnection connection;

    public GenericDAOImpl()
    {
        this.connection = DatabaseConnection.getInstance();
    }




}
