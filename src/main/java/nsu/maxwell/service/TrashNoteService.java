package nsu.maxwell.service;

import nsu.maxwell.enity.TrashNote;
import nsu.maxwell.repository.TrashNoteRepository;
import org.springframework.stereotype.Service;

@Service
public class TrashNoteService extends NoteService<TrashNote> {
    public TrashNoteService(TrashNoteRepository repository) {
        super(repository);
    }
}
