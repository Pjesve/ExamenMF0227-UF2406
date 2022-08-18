import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtilidadesTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
void devuelveNotaTest() {
		
		assertThrows(ArithmeticException.class, ()->u.devuelveNota());
		assertThrows(ArithmeticException.class, ()->u.devuelveNota());
		
		assertEquals("Matrícula", u.devuelveNota(10), "Matrícula");
		assertEquals("Suspenso", u.devuelveNota(0), "Suspenso");
		assertEquals("Bien", u.devuelveNota(5), "Bien");
		assertEquals("Notable", u.devuelveNota(7), "Notable");
		
		
	}
	
	
}	