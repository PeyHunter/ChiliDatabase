package DAO;

import Models.Chili;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChiliDAO extends GenericDAOImpl<Chili>
{


    @Override
    protected String getTableName()
    {
        return "Chili";
    }

    @Override
    protected String getInsertSQL(Chili entity)
    {
        return "INSERT INTO Chili (name, scoville, scale_id, rating, comments) VALUES (?, ?, ?, ?, ?)";
    }


    @Override
    protected String getUpdateSQL(Chili entity)
    {
        return "UPDATE Chili SET name = ?, scoville = ?, scale_id = ?, rating = ?, comments = ? WHERE chili_id = ?";
    }

    public void delete(int chiliId) {
        String sql = "DELETE FROM Chili WHERE chili_id = ?";  // Correct column name

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, chiliId);  // Set the chiliId parameter
            int rowsAffected = stmt.executeUpdate();  // Execute the delete query
            if (rowsAffected > 0) {
                System.out.println("Chili with ID " + chiliId + " was deleted successfully.");
            } else {
                System.out.println("No chili found with ID " + chiliId);
            }
        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }


    @Override
    protected void setPreparedStatementParams(PreparedStatement stmt, Chili entity) throws SQLException {
        stmt.setString(1, entity.getName());
        stmt.setInt(2, entity.getScoville());
        stmt.setInt(3, entity.getScaleId());
        stmt.setInt(4, entity.getRating());
        stmt.setString(5, entity.getComments());
    }

    @Override
    protected Chili mapResultSetToEntity(ResultSet rs) throws SQLException
    {
        return new Chili(
                rs.getInt("chili_id"),
                rs.getString("name"),
                rs.getInt("scoville"),
                rs.getInt("scale_id"),
                rs.getInt("rating"),
                rs.getString("comments")
        );
    }


}
