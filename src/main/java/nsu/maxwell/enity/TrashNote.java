package nsu.maxwell.enity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity(name="TrashNote")
@Getter
@Setter
@NoArgsConstructor
public class TrashNote extends Note {
    private Date deadline;

    public TrashNote(@NotEmpty Long id, @NotEmpty String name, @NotEmpty String anons, @NotEmpty String fullText, @NotEmpty Date deadline) {
        super(id, name, anons, fullText);
        this.deadline = deadline;
    }

    public TrashNote(@NotEmpty String name, @NotEmpty String anons, @NotEmpty String fullText, @NotEmpty Date deadline) {
        super(name, anons, fullText);
        this.deadline = deadline;
    }
}
