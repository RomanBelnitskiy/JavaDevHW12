package com.example.JavaDevHW12.note;

import java.util.List;

public interface ServiceBase<T, K> {
    List<T> listAll();
    T add(T entity);
    void deleteById(K id);
    void update(T entity);
    T getById(K id);
}
