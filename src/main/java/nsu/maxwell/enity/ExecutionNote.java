package nsu.maxwell.enity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity(name="ExecutionNote")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExecutionNote extends Note {
    private Date deadline;

    public ExecutionNote(@NotEmpty Long id, @NotEmpty String name, @NotEmpty String anons, @NotEmpty String fullText, @NotEmpty Date deadline) {
        super(id, name, anons, fullText);
        this.deadline = deadline;
    }

    public ExecutionNote(@NotEmpty String name, @NotEmpty String anons, @NotEmpty String fullText, @NotEmpty Date deadline) {
        super(name, anons, fullText);
        this.deadline = deadline;
    }
}
