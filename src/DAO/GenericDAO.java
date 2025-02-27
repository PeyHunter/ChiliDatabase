package DAO;

import java.util.List;

public interface GenericDAO<T>
{
    void instert(T entity);
    void update (T entity);
    void delete (int id);
    T findById(int id);
    List<T> findAll();
}
