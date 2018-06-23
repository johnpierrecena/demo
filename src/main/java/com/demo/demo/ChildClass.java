package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ChildClass extends ParentClass {
	
	@Autowired
	DependClass dependClass;
	
	public int call(int x, int y) {
		
		return this.add(x, y);
	}
	
	public String callDepend() {
		return dependClass.someMethod();
	}
}
