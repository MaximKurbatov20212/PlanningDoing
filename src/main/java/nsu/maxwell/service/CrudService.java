package nsu.maxwell.service;


import nsu.maxwell.enity.Note;

import java.util.Optional;

public interface CrudService<T extends Note> {
    void add(T entity);
    void delete(long id);
    void update(T entity);
    Optional<T> getById(long id);
}