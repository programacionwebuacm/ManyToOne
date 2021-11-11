package mx.edu.uacm.manytoone.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.edu.uacm.manytoone.ManyToOneApplication;
import mx.edu.uacm.manytoone.PersonaRepository;



@SpringBootTest(classes = {ManyToOneApplication.class})
public class PersonaTest {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Test
	public void debeGuardarPersona() {
		System.out.println("Entrando");
		Persona p = new Persona("Victor");
		
		
		//A traves de un objeto persona puedo obtener el telefono si existe esa asociacion?
		
		personaRepository.save(p);
	}

}
