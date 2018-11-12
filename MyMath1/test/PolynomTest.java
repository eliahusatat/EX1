import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolynomTest {

	//	@AfterAll
	//	static void tearDownAfterClass() throws Exception {
	//	}
	//
	//	@BeforeEach
	//	void setUp() throws Exception {
	//	}
	//
	//	@AfterEach
	//	void tearDown() throws Exception {
	//	}
   /**
    * empty constructor test
    */
	@Test
	void testPolynom() {
		Polynom m =new Polynom();
		String s=m.toString();
		if(!s.equals("0")) {
			fail("this Should to be an empty polynom!");
		}
	}
	   /**
	    * string constructor tests
	    * and toString() tests
	    */
	@Test
	void testPolynomString1() {
		Polynom m1 =new Polynom("1");
		String s=m1.toString();
		if(!s.equals("1"))
			fail("Not the same polynom");
	}
	@Test
	void testPolynomString2() {
		Polynom m1 =new Polynom("x^4+5x^2-3");
		String s=m1.toString();
		if(!s.equals("x^4+5.0x^2-3.0"))
			fail("Not the same polynom");
	}
	@Test
	void testPolynomString3() {
		Polynom m1 =new Polynom("x^4+x^3+x^2+x^1+x^0");
		String s=m1.toString();
		if(!s.equals("x^4+x^3+x^2+x+1"))
			fail("Not the same polynom");
	}
	@Test
	void testPolynomString4() {
		Polynom m1 =new Polynom("-3x");
		String s=m1.toString();
		if(!s.equals("-3.0x"))
			fail("Not the same polynom");
	}
	@Test
	void testPolynomString5() {
		Polynom m1 =new Polynom("0");
		String s=m1.toString();
		if(!s.equals("0"))
			fail("Not the same polynom");
	}

	@Test
	void testPolynomString6() {
		Polynom m1 =new Polynom("0x^5");
		String s=m1.toString();
		if(!s.equals("0"))
			fail("Not the same polynom");
	}
	
	
	@Test
	void testPolynomString7() {
		try {
			Polynom m1 =new Polynom("0x^-5");
			fail("this sould be an Exception");
		}
		catch( RuntimeException e ) {

		}
	}
		@Test
		void testPolynomString8() {
			try {
				Polynom m1 =new Polynom("4x^");
				fail("this sould be an Exception");
			}
			catch( RuntimeException e ) {

			}
		}
			@Test
			void testPolynomString9() {
				try {
					Polynom m1 =new Polynom("");
					fail("this sould be an Exception");
				}
				catch( RuntimeException e ) {

				}
			}
			
			@Test
			void testPolynomString10() {
				try {
					Polynom m1 =new Polynom("1b3x^6");
					fail("this sould be an Exception");
				}
				catch( RuntimeException e ) {

				}
			}
			
			@Test
			void testPolynomString11() {
				try {
					Polynom m1 =new Polynom("13x^$");
					fail("this sould be an Exception");
				}
				catch( RuntimeException e ) {

				}
			}
			

			@Test
			void testF() {
				Polynom m1 =new Polynom("0x^5");
				for (int i = 0; i < 40; i++) {
					double actual =m1.f(i);
					double expected =0;
					assertEquals(expected, actual);
				}
				
			}
			@Test
			void testF1() {
				Polynom m1 =new Polynom("4x^5");
				for (int i = 0; i < 1000; i++) {
					double actual =m1.f(i);
					double expected =4*Math.pow(i, 5);
					assertEquals(expected, actual);
				}
				
			}
			
			@Test
			void testAddPolynom_able() {
				Polynom p1 =new Polynom("4x^5+4");
				Polynom p2 =new Polynom("-3x^5+x^3+4");
				p1.add(p2);
				String actual=p1.toString();
				String expected="x^5+x^3+8.0";
				assertEquals(expected, actual);
			}
		
			@Test
			void testAddMonom() {
				Polynom p1 =new Polynom("4x^5+4");
				Monom m1= new Monom("x^5");
				Monom m2= new Monom("0x^4");
				p1.add(m1);
				p1.add(m2);
				String actual=p1.toString();
				String expected="5.0x^5+4.0";
				assertEquals(expected, actual);
			}
		
				@Test
				void testSubstractPolynom_able() {
					Polynom p1 =new Polynom("4x^5+4");
					Polynom p2 =new Polynom("-3x^5+x^3+4");
					p1.substract(p2);
					p2.substract(p2.copy());
					String actual=p1.toString();
					String expected="7.0x^5-x^3";
					assertEquals(expected, actual);
					if(!p2.isZero())
					fail("Not yet implemented");
				}
			

			@Test
			void testMultiplyPolynom_able() {
				Polynom p1 =new Polynom("x^2+2");
				Polynom p2 =new Polynom("3x^1+3");
				p2.multiply(p1);
				p1.multiply(p1.copy());
				String actual=p1.toString();
				String expected="x^4+4.0x^2+4.0";
				assertEquals(expected, actual);
			    actual=p2.toString();
				expected="3.0x^3+3.0x^2+6.0x+6.0";
				assertEquals(expected, actual);
				
				
			}
		

			@Test
			void testEqualsPolynom_able() {
				Polynom p1 =new Polynom("3x^2+x+4");
				Polynom p2 =new Polynom("3x^2+1x+4");
				Polynom p3 =new Polynom("3x^4+1x+4");
				if(p1.equals(p3))
				fail("they should be equals");
				if(!p1.equals(p2))
				fail("they shouldn't be equals");
			}
		
			@Test
			void testIsZero() {
				Polynom p1 =new Polynom();
				Polynom p2 =new Polynom("0x^2");
				Polynom p3 =new Polynom("2x^2");
				boolean zero1=p1.isZero();
				boolean zero2=p2.isZero();
				boolean zero3=p3.isZero();
				if(!zero1||!zero2||zero3)	
				fail("iszero problem!");
			}
		
			@Test
			void testRoot() {
				Polynom p2 =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
				double actual= p2.root(-2, 2, 0.1);
				double expected=-0.96875;
				assertEquals(expected, actual);
			    actual= p2.root(4, 6, 0.1);
				expected=4.84375;
				assertEquals(expected, actual);
				try {
					p2.root(2, -2, 0.1);
					fail("this sould be an Exception");
				}
				catch( RuntimeException e ) {
                
				}
				
				
			}
		
			@Test
			void testCopy() {
				Polynom p1 =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
				Polynom p3 =new Polynom("x");
				Polynom_able p2=p1.copy();
				if(!p1.equals(p2))
					fail("they should be equals");
				//they are supered polynoms
				assertNotSame(p1,p2);
				p1.add(p3);
				if(p1.equals(p2))
					fail("they shouldn't be equals");
				
				
			}
		
			@Test
			void testDerivative() {
				Polynom p1 =new Polynom("x^4");
				Polynom_able p2 =p1.derivative();
				//first test
				String actual=p2.toString();
				String expected="4.0x^3";
				assertEquals(expected, actual);
				//second test
				p2 =p2.derivative();
				actual=p2.toString();
				expected="12.0x^2";
				assertEquals(expected, actual);
				//next test
				p2 =p2.derivative();
				actual=p2.toString();
				expected="24.0x";
				assertEquals(expected, actual);
				//second test
				p2 =p2.derivative();
				actual=p2.toString();
				expected="24.0";
				assertEquals(expected, actual);
				//second test
				p2 =p2.derivative();
				actual=p2.toString();
				expected="0";
				assertEquals(expected, actual);
				//second test
				p2 =p2.derivative();
				actual=p2.toString();
				expected="0";
				assertEquals(expected, actual);
			}
		
			@Test
			void testarea() {
			Polynom p1 =new Polynom("0.2x^4-1.5x^3+3.0x^2");
			System.out.println(p1.area(0, 4,0.1));
			double actual= p1.area(0, 4,0.1);
			double expected=8.958669000000004;
			assertEquals(expected, actual);
			Polynom p2 =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
			actual= p2.area(0, 4,0.1);
			expected=0;
			assertEquals(expected, actual);
			}
			
			@Test
			void testAreaBelow() {
			Polynom p1 =new Polynom("0.2x^4-1.5x^3+3.0x^2-x-5");
			double actual= p1.AreaBelow(-2, 6);
			double expected=25.1833405497978;
			assertEquals(expected, actual);
			actual= p1.AreaBelow(6, 8);
			expected=0;
			assertEquals(expected, actual);
			}
			
			@Test
			void testIteretor() {
				Polynom p1 =new Polynom("x^4");
				Iterator<Monom> it = p1.iteretor();
			}


	}


