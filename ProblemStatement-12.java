//Junit taste case for 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit_test {

	@Test
	void test() {
		Box3d obj = new Box3d(40,20,10);
		int result = obj.area();
		int result1 = obj.volume();
		assertEquals(800,result);
		assertEquals(8000,result1);
		
	}

}
