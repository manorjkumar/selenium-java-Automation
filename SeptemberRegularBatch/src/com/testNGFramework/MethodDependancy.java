package com.testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodDependancy {
	@Test
	public void first() {
		//System.out.println("methos 1");
		Assert.assertTrue(true);
		
	}
	@Test(enabled = false)
	public void second() {
		System.out.println("method 2");
		
	}
	@Test
	public void third() {
		System.out.println("method 3");
		
	}
	
	}
	


