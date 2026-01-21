package se.lexicon.g58jpa_lecture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.g58jpa_lecture.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}