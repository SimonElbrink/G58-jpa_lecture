package se.lexicon.g58jpa_lecture.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.g58jpa_lecture.repo.StudentRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class StudentAuditingTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void testAuditingFields() throws InterruptedException {
        // 1. Create and save a new entity
        Student student = new Student("Test", "User", "test@example.com");
        Student savedStudent = studentRepository.save(student);

        // 2. Verify @CreatedDate is populated
        assertThat(savedStudent.getCreateDate()).isNotNull();
        assertThat(savedStudent.getLastModifiedDate()).isNotNull();

        // Save the original created date for comparison
        var originalCreatedDate = savedStudent.getCreateDate();
        var originalLastModifiedDate = savedStudent.getLastModifiedDate();

        // Small delay to ensure timestamp change
        Thread.sleep(100);

        // 3. Update the entity
        savedStudent.setFirstName("Updated Test");
        // We need to flush or perform another save to trigger the update auditing
        Student updatedStudent = studentRepository.saveAndFlush(savedStudent);

        // 4. Verify @LastModifiedDate is updated (newer than original created date)
        assertThat(updatedStudent.getLastModifiedDate())
                .isAfter(originalLastModifiedDate);
        
        // Created date should remain the same
        assertThat(updatedStudent.getCreateDate()).isEqualTo(originalCreatedDate);
    }
}
