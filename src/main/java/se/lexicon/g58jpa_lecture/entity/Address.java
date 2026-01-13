package se.lexicon.g58jpa_lecture.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {

        /*
   🔑 @GeneratedValue(strategy = GenerationType.IDENTITY)
    What it does: Relies on the database's identity column to auto-generate the primary key (like AUTO_INCREMENT in MySQL).
    When to use: When your DB handles ID generation and you want JPA to just let it happen.

  🔁 GenerationType.AUTO
    What it does: JPA chooses the strategy based on the underlying DB.
    When to use: When you're okay with letting JPA decide (but not always predictable).

  📈 GenerationType.SEQUENCE
    What it does: Uses a database sequence object to generate unique values.
    When to use: Great with databases like PostgreSQL, Oracle, etc.

  🗃️ GenerationType.TABLE
    What it does: Uses a separate table to simulate a sequence (for DBs that don't support sequences).
    When to use: Rare now, usually when using old or less common DBs.
    Slower — not ideal for high-scale apps.

 */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String postalCode;

}