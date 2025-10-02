package com.rsscloud.trainer.model;

import com.rsscloud.trainer.resource.ExerciseResource;
import com.rsscloud.trainer.resource.WorkoutResource;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@QuarkusTest
class ExerciseTest {

    @Inject
    ExerciseResource exerciseResource;

    @Test
    public void testSanity(){
        List<Exercise> exs = exerciseResource.getExercises();
        assertFalse(exs.isEmpty());
    }



    /*
    * 1. Add exercise to trainer
    * 2.
    *
    *
    * */


}
