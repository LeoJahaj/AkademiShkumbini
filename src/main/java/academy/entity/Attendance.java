package academy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Song")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {

    private Player player;
    private TrainingSession trainingSession;
    private boolean attended;
    }
