package project1;

import static org.junit.Assert.*;

import org.junit.Test;

import testing.JunitTesting;

public class BubbleTest {

	@Test
	public void test() {
		BubbleSort test = new BubbleSort();
		int output = test.sort(23,20,32,45,12,19,35);
		assertsEquals(12,19,20,23,32,35,45,output);
		
		
		
	}

}
