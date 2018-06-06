package _03_Dynamic_Integer_Array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DynamicIntArrayTest {

	@Test
	void testAddAndGet() {
		DynamicIntegerArray dia = new DynamicIntegerArray();
		dia.add(1);
		dia.add(2);
		dia.add(3);
		
		assertEquals(1, dia.get(0));
		assertEquals(2, dia.get(1));
		assertEquals(3, dia.get(2));
	}
	
	@Test
	void testSet() {
		DynamicIntegerArray dia = new DynamicIntegerArray();
		dia.add(1);
		dia.add(2);
		dia.add(3);
		
		dia.set(25, 1);
		
		assertEquals(1, dia.get(0));
		assertEquals(25, dia.get(1));
		assertEquals(3, dia.get(2));
	}
	
	@Test
	void testInsert() {
		DynamicIntegerArray dia = new DynamicIntegerArray();
		dia.add(1);
		dia.add(2);
		dia.add(3);
		
		dia.insert(25, 1);
		
		assertEquals(1, dia.get(0));
		assertEquals(25, dia.get(1));
		assertEquals(2, dia.get(2));
		assertEquals(3, dia.get(3));
	}
	
	@Test
	void testRemove() {
		DynamicIntegerArray dia = new DynamicIntegerArray();
		dia.add(1);
		dia.add(2);
		dia.add(3);
		
		dia.remove(1);
		
		assertEquals(1, dia.get(0));
		assertEquals(3, dia.get(1));
		
	}

}
