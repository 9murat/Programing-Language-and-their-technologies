package proje.OneOne.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "languages")
@Entity
public class Language {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL,
    targetEntity = Technologies.class,
    mappedBy = "language")
  private Set<Technologies> technologiesSet;
     // Diller Anne olduğu için ve tek olduğu için OneToMany .


}
