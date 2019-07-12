import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class TestAssignment {

	
	String myObject = "myObject";
	String notMyObject = "notMyObject";
	String empty = null;
	private boolean[] array2;
	private boolean[] array1;
	public static void main(String args[]){  
		String[] array1 = {"1", "2", "3"};  
		
		
		String[] array2 = {"1", "2", "3"};    
		}
	
	
	
	@Test
	public void test() {
		assertFalse(false);
		assertTrue(true);
		assertEquals("5","5");
		assertNotEquals("5","6");
		assertSame(myObject, myObject);
		assertNotSame(notMyObject, myObject);
		assertNull(empty);
		assertNotNull(myObject);
		assertArrayEquals(array1, array2);
	}
}