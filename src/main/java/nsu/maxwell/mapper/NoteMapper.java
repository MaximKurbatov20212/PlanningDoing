package nsu.maxwell.mapper;

import nsu.maxwell.enity.Note;
import nsu.maxwell.model.NoteDTO;
import org.springframework.stereotype.Component;


@Component
public interface NoteMapper <T extends Note, E extends NoteDTO> {
    T toEntity(E dtoNote);
    E toDTO(T entityNote);
}
