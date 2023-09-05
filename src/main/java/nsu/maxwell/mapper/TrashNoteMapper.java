package nsu.maxwell.mapper;

import nsu.maxwell.enity.TrashNote;
import nsu.maxwell.model.TrashNoteDTO;
import org.springframework.stereotype.Component;

@Component
public class TrashNoteMapper implements NoteMapper<TrashNote, TrashNoteDTO> {

    @Override
    public TrashNote toEntity(TrashNoteDTO dtoNote) {
        return new TrashNote(
                dtoNote.getId(),
                dtoNote.getName(),
                dtoNote.getAnons(),
                dtoNote.getFullText(),
                dtoNote.getDeadline()
        );
    }

    @Override
    public TrashNoteDTO toDTO(TrashNote entityNote) {
        return new TrashNoteDTO(
                entityNote.getId(),
                entityNote.getName(),
                entityNote.getAnons(),
                entityNote.getFullText(),
                entityNote.getDeadline()
        );
    }
}
