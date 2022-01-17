package by.tms.springbootuser.repository;

import by.tms.springbootuser.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Integer> {

    @Query(name = "Pet.findByPetId", value = "select p from Pet p where p.id = :p")
    Optional<Pet> findByPetId(@Param("p") int id);
}
