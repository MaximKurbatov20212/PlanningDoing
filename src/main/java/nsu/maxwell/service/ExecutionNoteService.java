package nsu.maxwell.service;

import nsu.maxwell.enity.ExecutionNote;
import nsu.maxwell.repository.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class ExecutionNoteService extends NoteService<ExecutionNote> {
    public ExecutionNoteService(NoteRepository<ExecutionNote> repository) {
        super(repository);
    }
}
