package se.lexicon.g58jpa_lecture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.lexicon.g58jpa_lecture.entity.Student;

import java.util.List;
import java.util.Optional;


//CRUD - Create, Read, Update, Delete

public interface StudentRepository extends JpaRepository<Student, String> {

    List<Student> findByFirstName(String firstName);

    Optional<Student> findByEmail(String email);


    // JPQL
    @Query(value = "SELECT s FROM Student s WHERE s.firstName = :firstName")
    //    @Query(value = "SELECT * FROM student WHERE first_name = :firstName", nativeQuery = true)
    List<Student> searchFindByFirstName(@Param("firstName") String firstName);


    /*
    In Spring Data JPA, the save() method is smart — it can handle both insert (save) and update operations depending on the state of the entity.
    Now, if you need to update just a specific field, or perform more complex updates without loading the entity first,
    that’s where a custom @Query with @Modifying comes in
     */
    @Modifying // tells Spring Data that this is an update query (not a SELECT)
    @Query("UPDATE Student s SET s.status = :status WHERE s.id = :id")
//    @Query("UPDATE #{entityName} s SET s.status = :status WHERE s.id = :id") // #{entityName} is a SpEL expression, which is a way to refer to the ENTITY name in a query.
    int updateStudentStatusById(@Param("id") String id, @Param("status") boolean status);
    // int: returns the number of rows affected (— could also be void)


}