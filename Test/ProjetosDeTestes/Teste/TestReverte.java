package Teste;

import org.junit.Test;

import Classes.Reverte;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestReverte{

	
	@Test
	public void TesteIsEmpty(){
		boolean b;
		b = Reverte.isEmpty("abc");
		Assert.assertFalse(b);
		
		b = Reverte.isEmpty(null);
		Assert.assertTrue(b);

		b= Reverte.isEmpty("");
		Assert.assertTrue(b);
	}
	
	@Test
	public void TestReverse(){
		String r = Reverte.revert("abcd");
		Assert.assertEquals("dcba", "dcba");
		
		r = Reverte.revert(null);
		Assert.assertNull(r);
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
