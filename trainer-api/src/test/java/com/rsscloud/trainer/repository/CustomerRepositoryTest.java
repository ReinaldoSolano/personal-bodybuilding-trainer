package com.rsscloud.trainer.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.DBUnitExtension;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
@ExtendWith(DBUnitExtension.class)
public class CustomerRepositoryTest {

    @Inject
    EntityManager em;

    @Test
    @DataSet("customers.yml")
    public void testCustomerCount() {
        Long count = em.createQuery("SELECT COUNT(c) FROM Customer c", Long.class).getSingleResult();
        assertEquals(2, count);
    }
}
