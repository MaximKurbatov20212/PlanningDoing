package nsu.maxwell.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface NoteRepository<T> extends CrudRepository<T, Long> {}
