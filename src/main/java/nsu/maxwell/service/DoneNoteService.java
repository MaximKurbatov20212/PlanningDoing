package nsu.maxwell.service;

import nsu.maxwell.enity.DoneNote;
import nsu.maxwell.repository.DoneNoteRepository;
import org.springframework.stereotype.Service;

@Service
public class DoneNoteService extends NoteService<DoneNote> {
    public DoneNoteService(DoneNoteRepository repository) {
        super(repository);
    }
}
