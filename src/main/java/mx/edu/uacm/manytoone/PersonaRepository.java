package mx.edu.uacm.manytoone;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.manytoone.domain.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
