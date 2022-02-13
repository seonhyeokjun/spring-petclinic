package org.springframework.samples.petclinic.owner;

import org.springframework.data.repository.Repository;

public interface PetRepository extends Repository<Pet, Integer> {
}
