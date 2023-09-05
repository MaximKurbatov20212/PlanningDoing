package nsu.maxwell.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nsu.maxwell.enity.Note;
import nsu.maxwell.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Getter
@Service
public abstract class NoteService<T extends Note> implements CrudService<T> {
    private final NoteRepository<T> repository;

    @Override
    public void add(T entity) {
        repository.save(entity);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(T entity) {
        repository.save(entity);
    }

    @Override
    public Optional<T> getById(long id) {
        return repository.findById(id);
    }
}
