import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonomTest {

	//	@BeforeAll
	//	static void setUpBeforeClass() throws Exception {
	//	}
	//
	//	@AfterAll
	//	static void tearDownAfterClass() throws Exception {
	//	}
	//
	//	@BeforeEach
	//	void setUp() throws Exception {
	//	}
	//@AfterEach
	//void tearDown() throws Exception {
	//}twrtwe

	@Test
	void testMonomDoubleInt() {
		Monom m12= new Monom(5,5);
  System.out.println(m12);
	}

	@Test
	void testMonomMonom() {
		Monom expected= new Monom("5x^4");
		Monom actual= new Monom(expected);
          if(expected.equals(actual)) {
        	  System.out.println("true");
          }
          else
        	  fail("Not yet implemented");

	}

	@Test
	void testMonomString() 
	{
		try {Monom m12= new Monom("0xx^4");}
		catch(Exception e) {}
		try {Monom m12= new Monom("0x^4");}
		catch(Exception e) {}
		try {Monom m12= new Monom("0x^-63");}
		catch(Exception e) {}
		try {Monom m12= new Monom("");}
		catch(Exception e) {


			Monom m12= new Monom("5x^2");
			System.out.println(m12);

		}
	}

		@Test
		void testGet_power() {
			Monom m12= new Monom("5x^4");
			Monom m13= new Monom(1,m12.get_power());
		//	assertNotSame(p1,p2);
	assertEquals(4, m13.get_power());
		}
	
		@Test
		void testGet_coefficient() {
			Monom m12= new Monom("3x^4");
			Monom m13= new Monom(m12.get_coefficient(),8);
			if (m13.get_coefficient()==3) {
				System.out.println("3333");
			}
			else
	        	  fail("Not yet implemented");

			
		}
	
		@Test
		void testNigzeret() {
			Monom m12= new Monom("5x^4");
			m12.nigzeret();
			Monom m13= new Monom("20x^3");
			if (m12.equals(m13)) {
				System.out.println("sababa");
			}
			else
	        	  fail("Not yet implemented");

		
		}
	
		@Test
		void testDerivative_Monom() {
			Monom m12= new Monom("5x^3");
			Monom m14= new Monom("5x^3");
			m14=m12.derivative_Monom();
			m12=m14.derivative_Monom();
			Monom m13= new Monom("30x^1");
			if (m13.equals(m12))
				System.out.println("yes");
			else
	        	  fail("Not yet implemented");

		}
	
		@Test
		void testIsZero() {
			Monom m12= new Monom("0x^4");
			if(m12.isZero()!=true)
	        	  fail("Not yet implemented");
			else
				System.out.println("very good");
				
		}
	
		@Test
		void testF() {
			Monom m12= new Monom("5x^4");
			int sum=0;
			sum=(int)m12.f(2);
			assertEquals(sum, 80);
		
		}
	
		@Test
		void testAdd() {
			Monom m12= new Monom("5x^4");
			
			Monom m16= new Monom("2x^4");
			
			m12.add(m16);
			System.out.println(m12);
		}
	
		@Test
		void testSub() {
			Monom m12= new Monom("5x^4");
		
			Monom m16= new Monom("2x^4");
		
			m12.sub(m16);
			System.out.println(m12);
		
		}
	
		@Test
		void testToString() {
			Monom m12= new Monom("5x^20");
			System.out.println(m12.toString());
		}
	
		@Test
		void testMultiply() {
			Monom m12= new Monom("5x^4");
			Monom actual= new Monom("2x^2");
			Monom expected= new Monom("10x^6");
			m12.multiply(actual);
			if(expected.equals(m12)) 
			{
				System.out.println("good");
			}
			else
				fail("Not yet implemented");
		}

	@Test
	void testEqualsMonom() {
		Monom m12= new Monom("5x^4");
		Monom m13= new Monom("6x^4");
		if (m12.equals(m13))
	fail("Not yet implemented");
		else
			System.out.println("seccsid");
	}

}
