package com.rsscloud.trainer.resource;

import com.rsscloud.trainer.model.Exercise;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/exercises")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExerciseResource {

    @GET
    public List<Exercise> listWorkouts() {
        return Exercise.listAll();
    }

    @POST
    @Transactional
    public Response createWorkout(Exercise exercise) {
        exercise.persist();
        return Response.ok(exercise).status(201).build();
    }

    public List<Exercise> getExercises() {
        return Exercise.listAll();
    }
}
