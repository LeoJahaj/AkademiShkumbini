package academy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Song")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    private int id;
    private String name;
    private String coach;
    private List<Player> players;
}
