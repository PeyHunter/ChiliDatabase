package DAO;

import Connection.DatabaseConnection;
import Models.Chili;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAOImpl<T> implements GenericDAO<T>
{
    protected Connection connection;

    public GenericDAOImpl()
    {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }


    @Override
    public void insert(T entity)
    {
        String sql = getInsertSQL(entity);
        try (PreparedStatement stmt = connection.prepareStatement(sql))
        {
            setPreparedStatementParams(stmt, entity);
            stmt.executeUpdate();
            System.out.println("Inserted succesfully");
        } catch (SQLException e)
        {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }

    @Override
    public void update(T entity)
    {
        String sql = getUpdateSQL(entity);  // Use the getUpdateSQL method
        try (PreparedStatement stmt = connection.prepareStatement(sql))
        {
            setPreparedStatementParams(stmt, entity);
            stmt.executeUpdate();
            System.out.println("Record updated successfully.");
        } catch (SQLException e)
        {
            System.out.println("Update failed: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id)
    {
        String sql = "DELETE FROM " + getTableName() + " WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql))
        {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Record deleted successfully.");
        } catch (SQLException e)
        {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }

    @Override
    public T findById(int id)
    {
        String sql = "SELECT * FROM " + getTableName() + " WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql))
        {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next())
            {
                return mapResultSetToEntity(rs);
            }
        } catch (SQLException e)
        {
            System.out.println("Find by ID failed: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<T> findAll()
    {
        List<T> entities = new ArrayList<>();
        String sql = "SELECT * FROM " + getTableName();
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery())
        {
            while (rs.next())
            {
                entities.add(mapResultSetToEntity(rs));
            }

            for (T entity : entities)
            {
                System.out.println(entity);
            }

        } catch (SQLException e)
        {
            System.out.println("Find all failed: " + e.getMessage());
        }
        return entities;
    }

    protected abstract String getUpdateSQL(T entity);

    protected abstract String getTableName();

    protected abstract String getInsertSQL(T entity);

    protected abstract T mapResultSetToEntity(ResultSet rs) throws SQLException;

    protected abstract void setPreparedStatementParams(PreparedStatement stmt, T entity) throws SQLException;

}
