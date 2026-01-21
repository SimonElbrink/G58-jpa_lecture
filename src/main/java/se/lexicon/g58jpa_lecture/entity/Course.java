package se.lexicon.g58jpa_lecture.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, unique = true)
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor mainTeacher;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}
