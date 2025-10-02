package com.rsscloud.trainer.resource;

import com.rsscloud.trainer.model.Exercise;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExerciseResourceTest {

    @Test
    public void testGetCustomers() {
        given()
                .when().get("/exercises")
                .then()
                .statusCode(200)
                .body("$.size()", is(0)); // ou o que for esperado
    }

}