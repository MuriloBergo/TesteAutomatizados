package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.ArrayReverse;
import junit.framework.Assert;

public class TestArrayReverse {

	@Test
	public void testArrayReverse() {
		Integer [] numbers = {1,2,3,4,5};
		ArrayReverse.reverse(numbers);
		Integer [] expected = {5,4,3,2,1}; 
		Assert.assertEquals(numbers, expected);
	}
	
		

	@Test
	@org.junit.Before
	public void Before(){
		System.out.println("Ïniciando teste automatizado!!!");
	}
	
	@org.junit.After
	public void After(){
		System.out.println("Finalizando Teste automatizado");
	}
	
}
