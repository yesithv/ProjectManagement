package art.ironcoding.model;

import art.ironcoding.utils.Seniority;
import lombok.Data;


@Data
public class User {

    private String name;
    private Seniority seniority;
}
