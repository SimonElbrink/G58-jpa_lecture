package se.lexicon.g58jpa_lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.g58jpa_lecture.entity.Student;
import se.lexicon.g58jpa_lecture.repo.StudentRepository;

@Component
public class AppCommandLineRunner implements CommandLineRunner {

    StudentRepository studentRepository;

    @Autowired
    public AppCommandLineRunner(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        studentRepository.save(new Student("John", "Doe", "john@test.com"));


        studentRepository.findAll().forEach(System.out::println);

    }

}
