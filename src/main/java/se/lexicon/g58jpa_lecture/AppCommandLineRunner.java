package se.lexicon.g58jpa_lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.g58jpa_lecture.entity.Address;
import se.lexicon.g58jpa_lecture.entity.AddressRepository;
import se.lexicon.g58jpa_lecture.entity.Student;
import se.lexicon.g58jpa_lecture.repo.StudentRepository;

import java.util.Optional;

@Component
public class AppCommandLineRunner implements CommandLineRunner {

    StudentRepository studentRepository;
    AddressRepository addressRepository;

    public AppCommandLineRunner(StudentRepository studentRepository, AddressRepository addressRepository) {
        this.studentRepository = studentRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // TODO: Transaction - one unit of work ?

        Student john = studentRepository.save(new Student("John", "Doe", "john@test.com"));

        Address stockholm = addressRepository.save(new Address("Nygatan 1", "Stockholm", "12345"));

        john.setAddress(stockholm);

        studentRepository.save(john);

    }

}
