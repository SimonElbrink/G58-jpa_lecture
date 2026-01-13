package se.lexicon.g58jpa_lecture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.g58jpa_lecture.entity.Student;


//CRUD - Create, Read, Update, Delete

public interface StudentRepository extends JpaRepository<Student, String> {




}