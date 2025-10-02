package com.rsscloud.trainer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Workout extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "workout_id")
    private List<WorkoutExercise> exercises;
}
