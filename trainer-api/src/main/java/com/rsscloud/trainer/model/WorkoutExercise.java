package com.rsscloud.trainer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WorkoutExercise extends PanacheEntityBase {

    @Id
    @GeneratedValue
    private Long id;

    private Long exerciseId;
    private int repetitions;
    private double load;
    private int sequence;

}
