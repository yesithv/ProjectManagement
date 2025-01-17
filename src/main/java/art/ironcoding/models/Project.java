package art.ironcoding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Project {

    private UUID id;
    private String name;
    private Integer priority;
    private List<Task> taskList;

    public Project(String name, Integer priority, List<Task> taskList) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.priority = priority;
        this.taskList = taskList;
    }

}
