package com.demo.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ChildClassTest {

	@InjectMocks
	ChildClass childClass;
	
	ParentClass parentClass;
	
	@Mock
	DependClass dependClass;
	
	@Test
	public void testNormal() {
		childClass = spy(new ChildClass());
		
		doReturn(5).when((ParentClass)childClass).add(1, 2);
		
		assertEquals(5, childClass.call(1, 2));
	}
	
	@Test
	public void testNormal1() {
		
		when(dependClass.someMethod()).thenReturn("test");
		
		assertEquals("test", childClass.callDepend());
	}}
