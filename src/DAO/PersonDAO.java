package DAO;

import Models.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAO extends GenericDAOImpl<Person> {

    @Override
    protected String getTableName() {
        return "Person";
    }

    @Override
    protected String getInsertSQL(Person entity) {
        return "INSERT INTO Person (name, age, scale_id) VALUES (?, ?, ?)";
    }

    @Override
    protected String getUpdateSQL(Person entity) {
        return "UPDATE Person SET name = ?, age = ?, scale_id = ? WHERE person_id = ?";
    }

    @Override
    protected void setPreparedStatementParams(PreparedStatement stmt, Person entity) throws SQLException {
        stmt.setString(1, entity.getName());
        stmt.setInt(2, entity.getAge());
        stmt.setInt(3, entity.getScaleId());
    }

    @Override
    protected Person mapResultSetToEntity(ResultSet rs) throws SQLException {
        int personId = rs.getInt("person_id");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        int scaleId = rs.getInt("scale_id");

        // Print values for debugging
        System.out.println("person_id: " + personId);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("scale_id: " + scaleId);

        return new Person(personId, name, age, scaleId);
    }

    @Override
    public void delete(int personId) {
        String sql = "DELETE FROM " + getTableName() + " WHERE person_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, personId);
            stmt.executeUpdate();
            System.out.println("Person record deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }
}