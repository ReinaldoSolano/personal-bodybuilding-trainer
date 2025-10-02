package com.rsscloud.trainer.resource;

import com.rsscloud.trainer.model.Workout;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/workouts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WorkoutResource {


    @GET
    public List<Workout> listWorkouts() {
        return Workout.listAll();
    }

    @POST
    @Transactional
    public Response createWorkout(Workout workout) {
        workout.persist();
        return Response.ok(workout).status(201).build();
    }

}
