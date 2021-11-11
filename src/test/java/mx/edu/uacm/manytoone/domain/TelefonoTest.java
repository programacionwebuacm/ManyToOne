package mx.edu.uacm.manytoone.domain;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mx.edu.uacm.manytoone.ManyToOneApplication;
import mx.edu.uacm.manytoone.PersonaRepository;
import mx.edu.uacm.manytoone.repository.TelefonoRepository;

@SpringBootTest(classes = {ManyToOneApplication.class})
public class TelefonoTest {
	
	private Logger log = LogManager.getLogger(TelefonoTest.class);
	
	@Autowired
	private TelefonoRepository telefonoRepository;
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Test
	public void debeGuardarTelefonosConPersonaTest() {
		//el uso de System.out.println para una app web no es el mas optimo
		//debemos utilizar una api para los mensajes 
		log.debug("> Entrando a debeGuardarTelefonosConPersonaTest");
		Telefono t1 = new Telefono("727272");
		Telefono t2 = new Telefono("837373");
		
		Persona p = new Persona("Brandon");
		personaRepository.save(p);
		
		
		t1.setPersona(p);
		t2.setPersona(p);
		
		telefonoRepository.save(t1);
		telefonoRepository.save(t2);
		
	}

}
