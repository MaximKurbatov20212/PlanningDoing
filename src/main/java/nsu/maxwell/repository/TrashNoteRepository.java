package nsu.maxwell.repository;

import nsu.maxwell.enity.TrashNote;
import org.springframework.stereotype.Repository;

@Repository
public interface TrashNoteRepository extends NoteRepository<TrashNote> {}
