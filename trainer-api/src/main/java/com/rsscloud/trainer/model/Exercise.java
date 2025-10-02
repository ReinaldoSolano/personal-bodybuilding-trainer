package com.rsscloud.trainer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exercise extends PanacheEntityBase {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String muscleGroup;
}
