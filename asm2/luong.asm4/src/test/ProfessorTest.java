package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import domain.Professor;
import junit.framework.Assert;

public class ProfessorTest {
	Professor professor;
	@Before
	public void setUp(){
	professor = new Professor();
	
	professor.setName("Luong");
	professor.setSalaryRadio(1);
	professor.setDegree(1);
	professor.setTeachingTime(10);
	}
	
	@After
	public void tearDown()  {
		System.out.println("Destroy teacher");
	}

	@Test
	public void test() {
		double expResult = 1480; //tester require
	    double result = 0;
	    result = professor.calculateSalary();
	    Assert.assertEquals(expResult, result);
	  }
	
	}


