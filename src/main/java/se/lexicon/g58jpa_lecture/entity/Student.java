package se.lexicon.g58jpa_lecture.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@EntityListeners(AuditingEntityListener.class) // https://www.codegenes.net/blog/spring-boot-jpa-createddate-lastmodifieddate-not-being-populated-when-saving-the-object/
public class Student {

    @Id
    @UuidGenerator
    @Column(nullable = false, updatable = false)
    private String id;

    @Setter
    @Column(length = 50, nullable = false)
    private String firstName;

    @Setter
    @Column(length = 50, nullable = false)
    private String lastName;

    @Setter
    @Column(nullable = false, unique = true, length = 120)
    private String email;

    private boolean status;

    // 📅 @CreatedDate - Automatically sets this field to the current date/time when the entity is first saved to the database
    // Works with Spring Data JPA's auditing feature (requires @EnableJpaAuditing in main application class)
    // This field is set ONCE when the entity is created and never changes after that
    @CreatedDate
    private LocalDateTime createDate;

    // 🔄 @LastModifiedDate - Automatically updates this field to the current date/time whenever the entity is modified
    // Works with Spring Data JPA's auditing feature (requires @EnableJpaAuditing in main application class)
    // This field is updated EVERY TIME you save changes to the entity
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    // 🚫 @Transient - Tells JPA to IGNORE this field and NOT save it to the database
    // This field exists only in Java memory during runtime, not as a database column
    // Useful for temporary calculations or derived values that don't need to be persisted
    @Transient
    private LocalDate date;

    @Setter
    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH})
    @JoinColumn(name = "address_id", unique = true)
    private Address address;


    @ManyToMany
    @JoinTable(name = "students_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses;


    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
//        course.getStudents().add(this); // Make in sync...
    }

    public void dropCourse(Course course) {
        courses.remove(course);
//        course.getStudents().remove(this); // Make in sync...
    }


    @PrePersist
    public void prePersist() {
        System.out.println("Before persist:");
        System.out.println(this);

        this.status = true;
        date = createDate.toLocalDate();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Student student = (Student) o;
        return getId() != null && Objects.equals(getId(), student.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
