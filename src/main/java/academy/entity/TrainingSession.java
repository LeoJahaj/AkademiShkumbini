package academy.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@Entity
@Table(name = "Song")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingSession {
    private int id;
    private Date date;
    private Team team;
}

