package nsu.maxwell.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Getter
public abstract class NoteDTO {
    private final Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String anons;

    @NotEmpty
    private String fullText;
}
