package com.nighthawk.csa.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonJpaRepository extends JpaRepository<Person, Long> {

    // JPA query, findBy does JPA magic with "Name", "Containing", "Or", "Email", "IgnoreCase"
    List<Person> findByNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String name, String email);
    /* Custom JPA query articles, there are articles that show custom SQL as well
       https://springframework.guru/spring-data-jpa-query/
       https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
     */

    // Custom JPA query
    @Query(
            value = "SELECT * FROM Person p WHERE p.name LIKE ?1 or p.email LIKE ?1",
            nativeQuery = true)
    List<Person> findByLikeTermNative(String term);
    /*
        https://www.baeldung.com/spring-data-jpa-query
     */
}

